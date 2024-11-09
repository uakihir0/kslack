package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.message.Message
import kotlin.js.JsExport

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
