package work.socialhub.kslack.api.methods.response.groups

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class GroupsCloseResponse : SlackApiResponse() {
    var isNoOp: Boolean = false
    var isAlreadyClosed: Boolean = false
}