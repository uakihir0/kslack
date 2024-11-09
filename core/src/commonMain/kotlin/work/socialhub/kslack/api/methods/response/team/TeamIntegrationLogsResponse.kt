package work.socialhub.kslack.api.methods.response.team

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.IntegrationLog
import work.socialhub.kslack.entity.Paging
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamIntegrationLogsResponse : SlackApiResponse() {
    var logs: Array<IntegrationLog>? = null
    var paging: Paging? = null
}