package work.socialhub.kslack.api.methods.response.team

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.team.Team
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamInfoResponse : SlackApiResponse() {
    var team: Team? = null
}