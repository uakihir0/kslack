package work.socialhub.kslack.api.methods.response.team.profile

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.team.Profiles
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamProfileGetResponse : SlackApiResponse() {
    var profile: Profiles? = null
}