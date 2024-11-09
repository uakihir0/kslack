package work.socialhub.kslack.api.methods.response.admin.teams

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminTeamsCreateResponse : SlackApiResponse() {
    var team: String? = null // created team id
    var responseMetadata: ResponseMetadata? = null
}
