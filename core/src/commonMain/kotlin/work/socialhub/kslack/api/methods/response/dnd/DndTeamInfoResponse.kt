package work.socialhub.kslack.api.methods.response.dnd

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.dnd.DndTeamMemberInfo
import kotlin.js.JsExport

@JsExport
@Serializable
class DndTeamInfoResponse : SlackApiResponse() {
    // user.id -> info
    var users: Map<String, DndTeamMemberInfo>? = null
}