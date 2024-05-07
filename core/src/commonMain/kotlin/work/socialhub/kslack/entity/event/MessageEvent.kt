package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.Attachment

/**
 * A message is delivered from several sources:
 *
 *
 * - They are sent via the Real Time Messaging API when a message is sent to a channel to which you subscribe.
 * This message should immediately be displayed in the client.
 * - They are returned via calls to channels.history, im.history or groups.history
 * - They are returned as latest property on channel, group and im objects.
 *
 *
 * https://api.slack.com/events/message
 */
class MessageEvent : Event {
    var clientMsgId: String? = null

    override val type: String = TYPE_NAME
    var channel: String? = null
    var user: String? = null

    var text: String? = null
    var blocks: Array<LayoutBlock>? = null
    var attachments: Array<Attachment>? = null

    var ts: String? = null

    var parentUserId: String? = null // in the case of replies in thread
    var threadTs: String? = null // in the case of replies in thread

    var eventTs: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    var edited: Edited? = null

    class Edited {
        var user: String? = null
        var ts: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "message"
    }
}
