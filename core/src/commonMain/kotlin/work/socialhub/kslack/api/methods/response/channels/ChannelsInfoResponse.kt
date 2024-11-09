package work.socialhub.kslack.api.methods.response.channels

import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Channel
import kotlin.js.JsExport

@JsExport
class ChannelsInfoResponse : SlackApiResponse() {
    var channel: Channel? = null
}
