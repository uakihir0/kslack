package work.socialhub.kslack.entity.block

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * Tolerant serializer for the polymorphic [LayoutBlock] interface.
 *
 * Slack keeps adding new layout block types (`rich_text`, `section`, ...), and
 * the previous setup registered no subclasses at all, so *any* message carrying
 * `blocks` failed to deserialize with:
 *
 * ```
 * Serializer for subclass 'rich_text' is not found in the polymorphic scope of 'LayoutBlock'
 * ```
 *
 * Rather than enumerate every block type, this serializer decodes each block
 * into a lossless [RawLayoutBlock] that keeps the original JSON in
 * [RawLayoutBlock.content]. Parsing therefore never fails on an unknown block,
 * and a deserialize → serialize round-trip preserves the payload verbatim.
 *
 * Serialization only supports [RawLayoutBlock]. The typed block classes
 * (`SectionBlock`, `ImageBlock`, ...) are not `@Serializable` and cannot be
 * encoded field-by-field, so encoding one would silently drop its content;
 * instead this serializer fails fast. Outgoing requests should send blocks via
 * the dedicated `blocksAsString` (pre-rendered JSON) parameters.
 */
object LayoutBlockSerializer : KSerializer<LayoutBlock> {

    override val descriptor: SerialDescriptor =
        buildClassSerialDescriptor("work.socialhub.kslack.entity.block.LayoutBlock")

    override fun deserialize(decoder: Decoder): LayoutBlock {
        require(decoder is JsonDecoder) {
            "LayoutBlockSerializer only supports JSON decoding."
        }
        val obj = decoder.decodeJsonElement().jsonObject
        val type = obj["type"]?.jsonPrimitive?.content
        val blockId = obj["block_id"]?.jsonPrimitive?.content
        return RawLayoutBlock(type, blockId, obj)
    }

    override fun serialize(encoder: Encoder, value: LayoutBlock) {
        require(encoder is JsonEncoder) {
            "LayoutBlockSerializer only supports JSON encoding."
        }
        // Only RawLayoutBlock carries a serializable payload. Typed blocks have
        // no per-field serialization, so encoding one would silently truncate
        // its data — fail fast instead of corrupting the request.
        val raw = value as? RawLayoutBlock
            ?: throw SerializationException(
                "Cannot serialize LayoutBlock of type '${value.type}' " +
                    "(${value::class.simpleName}). Only RawLayoutBlock is supported; " +
                    "send constructed blocks via the 'blocksAsString' parameter instead."
            )
        val content = raw.content
            ?: throw SerializationException(
                "Cannot serialize RawLayoutBlock of type '${raw.type}' without captured content."
            )
        encoder.encodeJsonElement(content)
    }
}
