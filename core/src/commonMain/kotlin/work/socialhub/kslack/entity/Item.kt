package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

/**
 * Represents a starred item which can be a message or file.
 *
 * Used in responses from `stars.list` API method. The `type` field
 * distinguishes between message and file items.
 *
 * @see <a href="https://api.slack.com/methods/stars.list">stars.list</a>
 */
@JsExport
@Serializable
class Item {
    var type: String? = null
    var channel: String? = null
    var message: Message? = null

    var dateCreate: Int? = null
    var file: File? = null
    var comment: Comment? = null
}
