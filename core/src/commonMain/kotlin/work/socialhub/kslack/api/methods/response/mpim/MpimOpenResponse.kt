package work.socialhub.kslack.api.methods.response.mpim

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Group
import kotlin.js.JsExport

@JsExport
@Serializable
class MpimOpenResponse : SlackApiResponse() {
    var group: Group? = null
}