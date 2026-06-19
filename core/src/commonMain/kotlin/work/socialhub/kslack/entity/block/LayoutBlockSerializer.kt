package work.socialhub.kslack.entity.block

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
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
        // Round-trip the captured payload when available; otherwise emit the
        // minimal {type, block_id} so typed blocks still serialize without crashing.
        val element = (value as? RawLayoutBlock)?.content ?: buildJsonObject {
            value.type?.let { put("type", JsonPrimitive(it)) }
            (value as? RawLayoutBlock)?.blockId?.let { put("block_id", JsonPrimitive(it)) }
        }
        encoder.encodeJsonElement(element)
    }
}
