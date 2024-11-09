package work.socialhub.kslack.api.methods.response.pins

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class PinsAddResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null
}