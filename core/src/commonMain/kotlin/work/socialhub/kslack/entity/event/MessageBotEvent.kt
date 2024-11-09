package work.socialhub.kslack.entity.event

import work.socialhub.kmastodon.entity.Attachment
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.message.MessageIcons

/**
 * https://api.slack.com/events/message/bot_message
 */
class MessageBotEvent : Event {
    override val type: String = TYPE_NAME
    override val subtype: String = SUBTYPE_NAME

    var botId: String? = null
    var username: String? = null
    var icons: MessageIcons? = null

    var channel: String? = null

    var text: String? = null
    var blocks: Array<LayoutBlock>? = null
    var attachments: Array<Attachment>? = null

    var ts: String? = null

    var eventTs: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    companion object {
        const val TYPE_NAME: String = "message"
        const val SUBTYPE_NAME: String = "bot_message"
    }
}
