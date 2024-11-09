package work.socialhub.kslack.api.methods.response.channels

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel
import kotlin.js.JsExport

@JsExport
@Serializable
class ChannelsCreateResponse : SlackApiResponse() {
    var channel: Channel? = null
}
