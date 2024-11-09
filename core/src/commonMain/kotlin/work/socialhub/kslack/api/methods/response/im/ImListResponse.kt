package work.socialhub.kslack.api.methods.response.im

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.Im
import kotlin.js.JsExport

@JsExport
@Serializable
class ImListResponse : SlackApiResponse() {
    var ims: Array<Im>? = null
    var responseMetadata: ResponseMetadata? = null
}
