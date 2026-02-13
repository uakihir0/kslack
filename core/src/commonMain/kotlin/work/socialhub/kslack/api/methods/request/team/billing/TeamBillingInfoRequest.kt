package work.socialhub.kslack.api.methods.request.team.billing

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class TeamBillingInfoRequest(
    override var token: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf()
    }
}
