package work.socialhub.kslack.api.methods.response.views

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.view.View
import kotlin.js.JsExport

@JsExport
@Serializable
class ViewsUpdateResponse : SlackApiResponse() {
    var view: View? = null
    var responseMetadata: ResponseMetadata? = null
}