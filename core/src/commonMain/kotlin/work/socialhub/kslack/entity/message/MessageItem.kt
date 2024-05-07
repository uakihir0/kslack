package work.socialhub.kslack.entity.message

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.File
import work.socialhub.kslack.entity.FileComment
import kotlin.js.JsExport

/**
 * https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/MessageItem.java
 */
@JsExport
@Serializable
@Deprecated("")
class MessageItem {

    var type: String? = null
    var channel: String? = null
    var message: Message? = null
    var file: File? = null
    var comment: FileComment? = null
    var created: Int? = null
}
