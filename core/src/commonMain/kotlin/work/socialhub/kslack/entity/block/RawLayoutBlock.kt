package work.socialhub.kslack.entity.block

import kotlinx.serialization.json.JsonObject

/**
 * Fallback [LayoutBlock] used when an incoming block has no dedicated typed
 * model yet (e.g. `rich_text`, `section`) or carries nested content that is not
 * modelled in this KMP port.
 *
 * The original JSON object is kept verbatim in [content] so that a
 * deserialize → serialize round-trip is lossless and the raw payload stays
 * available to callers that need it.
 */
class RawLayoutBlock(
    override val type: String?,
    var blockId: String? = null,
    val content: JsonObject? = null,
) : LayoutBlock
