package work.socialhub.kslack.entity.file

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kmastodon.entity.Attachment
import work.socialhub.kslack.entity.Reaction
import work.socialhub.kslack.entity.block.LayoutBlock
import kotlin.js.JsExport

/**
 * https://api.slack.com/types/file
 */
@JsExport
@Serializable
class File {

    var id: String? = null
    var created: Int? = null
    var timestamp: Int? = null
    var name: String? = null
    var title: String? = null
    var subject: String? = null
    var mimetype: String? = null
    var filetype: String? = null
    var prettyType: String? = null
    var user: String? = null
    var mode: String? = null
    var isEditable: Boolean = false

    @SerialName("is_external")
    var isExternal: Boolean = false

    @SerialName("external_type")
    var externalType: String? = null

    @SerialName("external_id")
    var externalId: String? = null

    @SerialName("external_url")
    var externalUrl: String? = null

    var username: String? = null
    var size: Int? = null
    var urlPrivate: String? = null
    var urlPrivateDownload: String? = null

    var appId: String? = null
    var appName: String? = null

    @SerialName("thumb_64")
    var thumb64: String? = null

    @SerialName("thumb_64_gif")
    var thumb64Gif: String? = null

    @SerialName("thumb_64_w")
    var thumb64Width: String? = null

    @SerialName("thumb_64_h")
    var thumb64Height: String? = null

    @SerialName("thumb_80")
    var thumb80: String? = null

    @SerialName("thumb_80_gif")
    var thumb80Gif: String? = null

    @SerialName("thumb_80_w")
    var thumb80Width: String? = null

    @SerialName("thumb_80_h")
    var thumb80Height: String? = null

    @SerialName("thumb_160")
    var thumb160: String? = null

    @SerialName("thumb_160_gif")
    var thumb160Gif: String? = null

    @SerialName("thumb_160_w")
    var thumb160Width: String? = null

    @SerialName("thumb_160_h")
    var thumb160Height: String? = null

    @SerialName("thumb_360")
    var thumb360: String? = null

    @SerialName("thumb_360_gif")
    var thumb360Gif: String? = null

    @SerialName("thumb_360_w")
    var thumb360Width: String? = null

    @SerialName("thumb_360_h")
    var thumb360Height: String? = null

    @SerialName("thumb_480")
    var thumb480: String? = null

    @SerialName("thumb_480_gif")
    var thumb480Gif: String? = null

    @SerialName("thumb_480_w")
    var thumb480Width: String? = null

    @SerialName("thumb_480_h")
    var thumb480Height: String? = null

    @SerialName("thumb_720")
    var thumb720: String? = null

    @SerialName("thumb_720_gif")
    var thumb720Gif: String? = null

    @SerialName("thumb_720_w")
    var thumb720Width: String? = null

    @SerialName("thumb_720_h")
    var thumb720Height: String? = null

    @SerialName("thumb_800")
    var thumb800: String? = null

    @SerialName("thumb_800_gif")
    var thumb800Gif: String? = null

    @SerialName("thumb_800_w")
    var thumb800Width: String? = null

    @SerialName("thumb_800_h")
    var thumb800Height: String? = null

    @SerialName("thumb_960")
    var thumb960: String? = null

    @SerialName("thumb_960_gif")
    var thumb960Gif: String? = null

    @SerialName("thumb_960_w")
    var thumb960Width: String? = null

    @SerialName("thumb_960_h")
    var thumb960Height: String? = null

    @SerialName("thumb_1024")
    var thumb1024: String? = null

    @SerialName("thumb_1024_gif")
    var thumb1024Gif: String? = null

    @SerialName("thumb_1024_w")
    var thumb1024Width: String? = null

    @SerialName("thumb_1024_h")
    var thumb1024Height: String? = null

    var thumbVideo: String? = null

    @SerialName("thumb_pdf")
    var thumbPdf: String? = null

    @SerialName("thumb_pdf_w")
    var thumbPdfWidth: String? = null

    @SerialName("thumb_pdf_h")
    var thumbPdfHeight: String? = null

    var thumbTiny: String? = null

    var convertedPdf: String? = null

    var imageExifRotation: Int? = null

    @SerialName("original_w")
    var originalWidth: String? = null

    @SerialName("original_h")
    var originalHeight: String? = null

    var deanimateGif: String? = null
    var pjpeg: String? = null

    var permalink: String? = null
    var permalinkPublic: String? = null

    var editLink: String? = null

    var isHasRichPreview: Boolean = false

    @SerialName("preview_is_truncated")
    var isPreviewTruncated: Boolean = false
    var preview: String? = null
    var previewHighlight: String? = null

    var plainText: String? = null
    var previewPlainText: String? = null

    var isHasMore: Boolean = false
    var isSentToSelf: Boolean = false
    var botId: String? = null

    var lines: Int? = null
    var linesMore: Int? = null

    @SerialName("is_public")
    var isPublic: Boolean = false

    var isPublicUrlShared: Boolean = false
    var isDisplayAsBot: Boolean = false

    var channels: Array<String>? = null
    var groups: Array<String>? = null
    var ims: Array<String>? = null
    var initialComment: FileComment? = null
    var numStars: Int? = null

    @SerialName("is_starred")
    var isStarred: Boolean = false

    var pinnedTo: Array<String>? = null
    var reactions: Array<Reaction>? = null
    var commentsCount: Int? = null

    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null

    var attachments: Array<Attachment>? = null
    var blocks: Array<LayoutBlock>? = null

    var shares: FileShares? = null

    var to: Array<FileAddress>? = null
    var from: Array<FileAddress>? = null
    var cc: Array<FileAddress>? = null

    // C00000000 -> {}
    var pinnedInfo: Map<String, FilePinnedInfo>? = null
}