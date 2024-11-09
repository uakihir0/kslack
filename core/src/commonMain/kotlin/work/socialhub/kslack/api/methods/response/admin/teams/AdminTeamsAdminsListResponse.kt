package work.socialhub.kslack.api.methods.response.admin.teams

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminTeamsAdminsListResponse : SlackApiResponse() {
    var adminIds: Array<String>? = null
    var responseMetadata: ResponseMetadata? = null
}