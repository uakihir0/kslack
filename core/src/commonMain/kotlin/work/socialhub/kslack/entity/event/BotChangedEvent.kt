package work.socialhub.kslack.entity.event

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.bot.BotIcons

/**
 * The bot_changed event is sent to all connections for a workspace when an integration "bot" is updated.
 * Clients can use this to update their local list of bots.
 *
 *
 * If the bot belongs to a Slack app, the event will also include an app_id pointing to its parent app.
 *
 *
 * https://api.slack.com/events/bot_changed
 */
@Serializable
class BotChangedEvent : Event {
    override val type: String = TYPE_NAME
    var bot: Bot? = null

    @Serializable
    class Bot {
        var id: String? = null
        var appId: String? = null
        var name: String? = null
        var icons: BotIcons? = null
    }

    companion object {
        const val TYPE_NAME: String = "bot_changed"
    }
}