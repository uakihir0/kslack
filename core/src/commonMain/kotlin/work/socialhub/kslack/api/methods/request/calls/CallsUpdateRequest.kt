package work.socialhub.kslack.api.methods.request.calls

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class CallsUpdateRequest(
    override var token: String?,
    var id: String?,
    var desktopAppJoinUrl: String? = null,
    var joinUrl: String? = null,
    var title: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("id", id)
            it.addParam("desktop_app_join_url", desktopAppJoinUrl)
            it.addParam("join_url", joinUrl)
            it.addParam("title", title)
        }
    }
}
