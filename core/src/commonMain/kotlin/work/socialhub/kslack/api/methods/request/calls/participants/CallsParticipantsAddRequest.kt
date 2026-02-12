package work.socialhub.kslack.api.methods.request.calls.participants

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class CallsParticipantsAddRequest(
    override var token: String?,
    var id: String?,
    var users: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("id", id)
            it.addParam("users", users)
        }
    }
}
