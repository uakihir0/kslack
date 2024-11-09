package work.socialhub.kslack.api.methods.response.im

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel
import kotlin.js.JsExport

@JsExport
@Serializable
class ImOpenResponse : SlackApiResponse() {
    var isNoOp: Boolean = false
    var isAlreadyOpen: Boolean = false
    var channel: Channel? = null
}