package work.socialhub.kslack.api.methods.request.calls

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class CallsAddRequest(
    override var token: String?,
    var externalUniqueId: String?,
    var joinUrl: String?,
    var createdBy: String? = null,
    var dateStart: Int? = null,
    var desktopAppJoinUrl: String? = null,
    var externalDisplayId: String? = null,
    var title: String? = null,
    var users: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("external_unique_id", externalUniqueId)
            it.addParam("join_url", joinUrl)
            it.addParam("created_by", createdBy)
            it.addParam("date_start", dateStart?.toString())
            it.addParam("desktop_app_join_url", desktopAppJoinUrl)
            it.addParam("external_display_id", externalDisplayId)
            it.addParam("title", title)
            it.addParam("users", users)
        }
    }
}
