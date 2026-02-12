package work.socialhub.kslack.entity.event

import kotlinx.serialization.SerialName
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.Reaction
import work.socialhub.kslack.entity.block.LayoutBlock

/**
 * https://api.slack.com/events/message/message_changed
 */
class MessageChangedEvent : Event {
    override val type: String = TYPE_NAME
    override val subtype: String = SUBTYPE_NAME
    var channel: String? = null

    var isHidden: Boolean = false

    var message: Message? = null
    var previousMessage: Message? = null

    var eventTs: String? = null
    var ts: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    class Message {
        var clientMsgId: String? = null

        val type: String = TYPE_NAME
        var subtype: String? = null

        var user: String? = null
        var team: String? = null

        var edited: Edited? = null

        var text: String? = null
        var blocks: Array<LayoutBlock>? = null
        var attachments: Array<Attachment>? = null

        var ts: String? = null
        var userTeam: String? = null
        var sourceTeam: String? = null

        @SerialName("is_starred")
        var isStarred: Boolean = false
        var pinnedTo: Array<String>? = null
        var reactions: Array<Reaction>? = null
    }

    class Edited {
        var user: String? = null
        var ts: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "message"
        const val SUBTYPE_NAME: String = "message_changed"
    }
}
