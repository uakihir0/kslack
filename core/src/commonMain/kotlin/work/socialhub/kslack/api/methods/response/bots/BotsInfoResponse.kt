package work.socialhub.kslack.api.methods.response.bots

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.bot.BotIcons
import kotlin.js.JsExport

@JsExport
@Serializable
class BotsInfoResponse : SlackApiResponse() {
    var bot: Bot? = null
}

