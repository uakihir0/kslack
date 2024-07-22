package work.socialhub.kslack.entity.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.file.FileComment
import kotlin.js.JsExport

@JsExport
@Serializable
class MessageItem {
    var id: String? = null
    var name: String? = null
    var title: String? = null
    var created: String? = null
    var timestamp: String? = null
    var user: String? = null
    var username: String? = null

    @SerialName("is_intro")
    var isIntro: Boolean = false

    @SerialName("is_public")
    var isPublic: Boolean = false

    @SerialName("is_starred")
    var isStarred: Boolean = false

    var isPublicUrlShared: Boolean = false
    var urlPrivate: String? = null
    var isUrlPrivateDownload: Boolean = false

    var permalink: String? = null
    var isPermalinkPublic: Boolean = false

    var editLink: String? = null
    var preview: String? = null
    var previewHighlight: String? = null

    var lines: Int? = null
    var linesMore: Int? = null

    @SerialName("preview_is_truncated")
    var isPreviewTruncated: Boolean = false
    var isHasRichPreview: Boolean = false

    var mimetype: String? = null
    var filetype: String? = null
    var prettyType: String? = null // "Plain Text"

    @SerialName("is_external")
    var isExternal: Boolean = false
    var externalType: String? = null
    var isEditable: Boolean = false
    var isDisplayAsBot: Boolean = false
    var size: Int? = null
    var mode: String? = null
    var comment: String? = null
}