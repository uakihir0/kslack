package work.socialhub.kslack.api.methods.response.apps.connections

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AppsConnectionsOpenResponse : SlackApiResponse() {
    var url: String? = null
}
