package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.Attachment

/**
 * https://api.slack.com/events/message/ekm_access_denied
 */
class MessageEkmAccessDeniedEvent : Event {
    override val type: String = TYPE_NAME
    override val subtype: String = SUBTYPE_NAME
    var channel: String? = null
    var isHidden: Boolean = false

    var user: String? = null

    var text: String? = null
    var blocks: List<LayoutBlock>? = null
    var attachments: List<Attachment>? = null

    var eventTs: String? = null
    var ts: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    companion object {
        const val TYPE_NAME: String = "message"
        const val SUBTYPE_NAME: String = "ekm_access_denied"
    }
}
