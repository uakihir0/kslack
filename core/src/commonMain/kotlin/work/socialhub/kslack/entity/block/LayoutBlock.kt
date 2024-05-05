package work.socialhub.kslack.entity.block

/**
 * Block Kit is a new UI framework that offers you more control and flexibility
 * when building messages for Slack. Comprised of "blocks," stackable bits of
 * message UI, you can customize the order and appearance of information
 * delivered by your app in Slack.
 *
 * @see [Block Kit Guide](https://api.slack.com/block-kit)
 *
 * @see [Block Kit Reference](https://api.slack.com/reference/messaging/blocks)
 */
interface LayoutBlock {
    /**
     * Determines the type of layout block, e.g. section, divider, context, actions
     * and image.
     */
    val type: String?
}
