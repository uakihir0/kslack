package work.socialhub.kslack.api.methods.response.team

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Login
import work.socialhub.kslack.entity.Paging
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamAccessLogsResponse : SlackApiResponse() {
    var logins: Array<Login>? = null
    var paging: Paging? = null
}