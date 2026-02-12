package work.socialhub.kslack.api.methods.response.apps.connections

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AppsConnectionsOpenResponse : SlackApiResponse() {
    // TODO: Stream module — This url is a WebSocket URL.
    // Use this URL in the stream/ module to implement Socket Mode connections.
    // See: https://api.slack.com/apis/connections/socket-implement
    var url: String? = null
}
