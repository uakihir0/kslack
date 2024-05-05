package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.view.View

/**
 * This app event notifies your app when a user has entered into the App Home space—that's the place
 * where a user exchanges DMs with your app.
 *
 *
 * Your Slack app must have a bot user configured and installed to use this event.
 *
 *
 * Use the app_home_opened event to begin a friendly onboarding flow from your app,
 * a whimsical welcome message, or a deep-dive into a detailed dialog.
 * Since the app_home_opened event is only sent to your app when a user has already clicked on your app,
 * you can rest assured that your attentions are welcome.
 *
 *
 * Note: app_home_opened events are sent each time a user enters into the App Home space.
 * Verify that this is the first interaction between a user and your app before triggering your onboarding flow.
 *
 *
 * app_home_opened events are just like other message events sent over the Events API, but their type indicates app_home_opened.
 *
 *
 * https://api.slack.com/events/app_home_opened
 */
class AppHomeOpenedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channel: String? = null
    var tab: String? = null // home, messages
    var eventTs: String? = null
    var view: View? = null

    companion object {
        const val TYPE_NAME: String = "app_home_opened"
    }
}