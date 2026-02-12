package work.socialhub.kslack.api.methods.response.team.billing

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamBillingInfoResponse : SlackApiResponse() {
    var plan: String? = null
}
