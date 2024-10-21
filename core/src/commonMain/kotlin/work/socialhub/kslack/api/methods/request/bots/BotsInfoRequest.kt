package work.socialhub.kslack.api.methods.request.bots

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class BotsInfoRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,
    /** Bot user to get info on */
    var bot: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("bot", bot)
        }
    }
}