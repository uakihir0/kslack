package work.socialhub.kslack.api.methods.response.pins

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.file.FileComment
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

@JsExport
@Serializable
class PinsListResponse : SlackApiResponse() {
    var items: Array<MessageItem>? = null
}

@JsExport
@Serializable
class MessageItem {
    var type: String? = null
    var channel: String? = null
    var message: Message? = null
    var file: File? = null
    var comment: FileComment? = null
    var createdBy: String? = null
    var created: Int? = null
}