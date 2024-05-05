package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.Attachment

/**
 * https://api.slack.com/events/message/thread_broadcast
 */
class MessageThreadBroadcastEvent : Event {
    var clientMsgId: String? = null

    override val type: String = TYPE_NAME
    override val subtype: String = SUBTYPE_NAME
    var channel: String? = null
    var user: String? = null

    var root: MessageRoot? = null

    var text: String? = null
    var blocks: List<LayoutBlock>? = null
    var attachments: List<Attachment>? = null

    var ts: String? = null
    var threadTs: String? = null

    var eventTs: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    companion object {
        const val TYPE_NAME: String = "message"
        const val SUBTYPE_NAME: String = "thread_broadcast"
    }
}
