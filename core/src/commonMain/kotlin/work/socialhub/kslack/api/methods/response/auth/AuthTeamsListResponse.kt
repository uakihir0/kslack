package work.socialhub.kslack.api.methods.response.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.team.Team
import kotlin.js.JsExport

@JsExport
@Serializable
class AuthTeamsListResponse : SlackApiResponse() {
    var teams: Array<Team>? = null

    @SerialName("response_metadata")
    var responseMetadata: ResponseMetadata? = null
}
