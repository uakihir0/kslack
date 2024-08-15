package work.socialhub.kslack.api.methods.response.bots

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.bot.BotIcons

@Serializable
class BotsInfoResponse : SlackApiResponse() {
    var bot: Bot? = null

    @Serializable
    class Bot {
        var id: String? = null
        var appId: String? = null
        var userId: String? = null
        var name: String? = null
        var isDeleted: Boolean = false
        var updated: Int? = null
        var icons: BotIcons? = null
    }
}