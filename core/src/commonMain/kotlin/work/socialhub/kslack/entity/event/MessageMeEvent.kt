package work.socialhub.kslack.entity.event

/**
 * https://api.slack.com/events/message/me_message
 */
class MessageMeEvent : Event {
    override val type: String = TYPE_NAME
    override val subtype: String = SUBTYPE_NAME
    var channel: String? = null

    var username: String? = null
    var botId: String? = null

    var text: String? = null

    var eventTs: String? = null
    var ts: String? = null
    var channelType: String? = null // app_home, channel, group, im, mpim

    companion object {
        const val TYPE_NAME: String = "message"
        const val SUBTYPE_NAME: String = "me_message"
    }
}
