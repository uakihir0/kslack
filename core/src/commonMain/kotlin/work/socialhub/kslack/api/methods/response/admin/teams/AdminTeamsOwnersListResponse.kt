package work.socialhub.kslack.api.methods.response.admin.teams

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminTeamsOwnersListResponse : SlackApiResponse() {
    var ownerIds: Array<String>? = null
    var responseMetadata: ResponseMetadata? = null
}