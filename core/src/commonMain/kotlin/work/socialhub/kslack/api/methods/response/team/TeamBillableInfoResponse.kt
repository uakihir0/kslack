package work.socialhub.kslack.api.methods.response.team

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.BillableInfo
import kotlin.js.JsExport


@JsExport
@Serializable
class TeamBillableInfoResponse : SlackApiResponse() {
    var billableInfo: Map<String, BillableInfo>? = null
}