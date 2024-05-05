package work.socialhub.kslack.entity.event

/**
 * The reconnect_url event is currently unsupported and experimental.
 *
 *
 * https://api.slack.com/events/reconnect_url
 */
class ReconnectUrlEvent : Event {
    override val type: String = TYPE_NAME

    companion object {
        const val TYPE_NAME: String = "reconnect_url"
    }
}