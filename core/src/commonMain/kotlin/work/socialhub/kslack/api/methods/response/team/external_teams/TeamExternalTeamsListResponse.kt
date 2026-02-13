package work.socialhub.kslack.api.methods.response.team.external_teams

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamExternalTeamsListResponse : SlackApiResponse() {
    var organizations: Array<ExternalTeam>? = null

    @SerialName("response_metadata")
    var responseMetadata: ResponseMetadata? = null
}

@JsExport
@Serializable
class ExternalTeam {
    var id: String? = null
    var name: String? = null

    @SerialName("team_url")
    var teamUrl: String? = null

    @SerialName("date_connected")
    var dateConnected: Int? = null

    @SerialName("connection_status")
    var connectionStatus: String? = null
}
