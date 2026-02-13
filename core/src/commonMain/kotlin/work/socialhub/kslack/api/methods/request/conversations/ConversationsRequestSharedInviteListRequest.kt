package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsRequestSharedInviteListRequest(
    override var token: String?,
    var cursor: String? = null,
    var limit: Int? = null,
    var isApproved: Boolean? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("limit", limit?.toString())
            it.addParam("is_approved", isApproved?.toString())
        }
    }
}
