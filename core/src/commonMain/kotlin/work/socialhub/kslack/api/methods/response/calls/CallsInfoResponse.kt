package work.socialhub.kslack.api.methods.response.calls

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.call.Call
import kotlin.js.JsExport

@JsExport
@Serializable
class CallsInfoResponse : SlackApiResponse() {
    var call: Call? = null
}
