package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.BotIcons

/**
 * The bot_added event is sent to all connections for a workspace when an integration "bot" is added.
 * Clients can use this to update their local list of bots.
 *
 *
 * If the bot belongs to a Slack app, the event will also include an app_id pointing to its parent app.
 *
 *
 * https://api.slack.com/events/bot_added
 */
class BotAddedEvent : Event {
    override val type: String = TYPE_NAME
    var bot: Bot? = null

    class Bot {
        var id: String? = null
        var appId: String? = null
        var name: String? = null
        var icons: BotIcons? = null
    }

    companion object {
        const val TYPE_NAME: String = "bot_added"
    }
}