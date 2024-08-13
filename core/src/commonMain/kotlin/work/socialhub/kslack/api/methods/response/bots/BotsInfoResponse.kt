package work.socialhub.kslack.api.methods.response.bots

import work.socialhub.kslack.api.model.BotIcons

class BotsInfoResponse : SlackApiResponse {
    class Bot {
        var id: String? = null
        var appId: String? = null
        var userId: String? = null
        var name: String? = null
        var isDeleted: Boolean = false
        var updated: Int? = null
        var icons: BotIcons? = null
    }

    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var bot: Bot? = null
}