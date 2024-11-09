package work.socialhub.kslack.api.methods.response.im

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.model.Message
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class ImHistoryResponse : SlackApiResponse() {
    var latest: String? = null
    var messages: Array<Message>? = null
    var isHasMore: Boolean = false
    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null
}