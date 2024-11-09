package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Comment {
    var id: String? = null
    var created: Int? = null
    var timestamp: Int? = null
    var user: String? = null

    @SerialName("is_intro")
    var isIntro: Boolean = false
    var comment: String? = null
    var numStars: Int? = null

    @SerialName("is_starred")
    var isStarred: Boolean = false
}