package work.socialhub.kslack.api.methods.request.calls

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class CallsEndRequest(
    override var token: String?,
    var id: String?,
    var duration: Int? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("id", id)
            it.addParam("duration", duration?.toString())
        }
    }
}
