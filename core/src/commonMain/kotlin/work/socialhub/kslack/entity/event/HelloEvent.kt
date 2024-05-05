package work.socialhub.kslack.entity.event

/**
 * The hello event is sent when a connection is opened to the message server.
 * This allows a client to confirm the connection has been correctly opened.
 *
 *
 * https://api.slack.com/events/hello
 */
class HelloEvent : Event {
    override val type: String = TYPE_NAME

    companion object {
        const val TYPE_NAME: String = "hello"
    }
}