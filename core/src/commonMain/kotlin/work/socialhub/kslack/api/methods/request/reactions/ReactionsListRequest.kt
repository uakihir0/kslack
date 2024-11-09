package work.socialhub.kslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ReactionsListRequest(
    /** Authentication token. Requires scope: `reactions:read` */
    override var token: String?,
    /** Show reactions made by this user. Defaults to the authed user. */
    var user: String?,
    /** If true always return the complete reaction list. */
    var isFull: Boolean,
    var count: Int?,
    var page: Int?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
            it.addParam("full", isFull)
            it.addParam("count", count)
            it.addParam("page", page)
        }
    }
}