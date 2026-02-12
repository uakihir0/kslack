package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsInviteSharedRequest(
    override var token: String?,
    var channel: String?,
    var emails: String? = null,
    var userIds: String? = null,
    var externalLimited: Boolean? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("emails", emails)
            it.addParam("user_ids", userIds)
            it.addParam("external_limited", externalLimited?.toString())
        }
    }
}
