package work.socialhub.kslack.api.methods.response.views

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ViewsHomeUpdateResponse : SlackApiResponse() {
    var view: JsonElement? = null
}
