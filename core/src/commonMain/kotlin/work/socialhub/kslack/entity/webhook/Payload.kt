package work.socialhub.kslack.entity.webhook

import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock

/**
 * https://api.slack.com/incoming-webhooks
 *
 *
 * Implementation of [RTMMessage Payloads](https://api.slack.com/reference/messaging/payload)
 */
class Payload(
    /**
     * You can add the thread_ts parameter to your POST request
     * in order to make your message appear as a reply in a thread.
     */
    var threadTs: String?,
    /**
     * The first step is to prepare this message as a key/value pair in JSON.
     * For a simple message, your JSON payload only needs to define a text property, containing the text that will be posted to the channel.
     */
    var text: String?,

    ) {
    /**
     * An array of [layout blocks][LayoutBlock] in the same format as described in the
     * [layout block guide](https://api.slack.com/messaging/composing/layouts#getting-started).
     */
    var blocks: Array<LayoutBlock>? = null

    /**
     * An array of legacy secondary attachments. We recommend you use [.blocks] instead.
     */
    var attachments: Array<Attachment>? = null
}
