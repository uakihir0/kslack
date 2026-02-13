package work.socialhub.kslack.api.methods.request.auth

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class AuthTeamsListRequest(
    override var token: String?,
    var cursor: String? = null,
    var includeIcon: Boolean? = null,
    var limit: Int? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("include_icon", includeIcon?.toString())
            it.addParam("limit", limit?.toString())
        }
    }
}
