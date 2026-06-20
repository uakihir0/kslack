package work.socialhub.kslack.entity.block

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Block Kit is a new UI framework that offers you more control and flexibility
 * when building messages for Slack. Comprised of "blocks," stackable bits of
 * message UI, you can customize the order and appearance of information
 * delivered by your app in Slack.
 *
 * Blocks are (de)serialized through [LayoutBlockSerializer], which tolerates any
 * block `type` Slack sends (including `rich_text`) by capturing the raw JSON in
 * a [RawLayoutBlock]. Without it, decoding any message that carries `blocks`
 * fails because no concrete subclass is registered for the polymorphic scope.
 *
 * @see [Block Kit Guide](https://api.slack.com/block-kit)
 *
 * @see [Block Kit Reference](https://api.slack.com/reference/messaging/blocks)
 */
@JsExport
@Serializable(with = LayoutBlockSerializer::class)
interface LayoutBlock {
    /**
     * Determines the type of layout block, e.g. section, divider, context, actions
     * and image.
     */
    val type: String?
}
