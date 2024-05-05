package work.socialhub.kslack.entity.event

/**
 * This app event allows your app to subscribe to message events that directly mention your bot user.
 *
 *
 * Your Slack app must have a bot user configured and installed to utilize this event.
 *
 *
 * Instead of receiving all messages in a channel and having to filter through them for those mentioning your app,
 * as you would when subscribing to message.channels,
 * you'll receive only the messages pertinent to your app.
 *
 *
 * Messages sent via this subscription arrive as an app_mention event, not as a message as with other message.* event types.
 * However, your app can treat its contents similarly.
 *
 *
 * Messages sent to your app in direct message conversations are not dispatched via app_mention,
 * whether the app is explicitly mentioned or otherwise.
 * Subscribe to message.im events to receive messages directed to your bot user in direct message conversations.
 *
 *
 * https://api.slack.com/events/app_mention
 */
class AppMentionEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    override var subtype: String? = null
    var text: String? = null
    var ts: String? = null
    var channel: String? = null
    var eventTs: String? = null

    var threadTs: String? = null

    companion object {
        const val TYPE_NAME: String = "app_mention"
    }
}