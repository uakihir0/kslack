package work.socialhub.kslack.entity.file

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/files.comments.add
 */
@JsExport
@Serializable
class FileComment {

    var id: String? = null
    var created: Int? = null
    var timestamp: Int? = null
    var user: String? = null
    var comment: String? = null
    var channel: String? = null

    @SerialName("is_intro")
    var isIntro: Boolean = false
}