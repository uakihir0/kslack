package work.socialhub.kslack.entity

import com.github.seratch.jslack.api.model.block.LayoutBlock

class MatchedItem {
    var iid: String? = null
    var id: String? = null
    var team: String? = null
    var type: String? = null
    var channel: Channel? = null
    var user: String? = null
    var username: String? = null
    var ts: String? = null
    var title: String? = null
    var text: String? = null
    var attachments: List<Attachment>? = null
    var blocks: List<LayoutBlock>? = null
    var permalink: String? = null
    var name: String? = null
    var subject: String? = null
    var preview: String? = null

    var plainText: String? = null
    var previewPlainText: String? = null

    var isHasMore: Boolean = false
    var isSentToSelf: Boolean = false

    var botId: String? = null

    var fileId: String? = null
    var externalId: String? = null
    var externalUrl: String? = null

    var timestamp: String? = null
    var created: String? = null

    @SerializedName("is_intro")
    private val intro = false

    @SerializedName("is_public")
    var isPublic: Boolean = false

    var isPublicUrlShared: Boolean = false

    var urlPrivate: String? = null
    var isUrlPrivateDownload: Boolean = false

    var isPermalinkPublic: Boolean = false

    var editLink: String? = null
    var previewHighlight: String? = null

    var lines: Int? = null
    var linesMore: Int? = null

    @SerializedName("preview_is_truncated")
    var isPreviewTruncated: Boolean = false
    var isHasRichPreview: Boolean = false

    var mimetype: String? = null
    var filetype: String? = null
    var prettyType: String? = null

    @SerializedName("is_mpim")
    var isMpim: Boolean = false

    @SerializedName("is_external")
    var isExternal: Boolean = false

    @SerializedName("is_starred")
    var isStarred: Boolean = false
    var externalType: String? = null
    var isEditable: Boolean = false
    var isDisplayAsBot: Boolean = false
    var size: Int? = null
    var mode: String? = null
    var comment: String? = null

    @SerializedName("previous_2")
    var previous2: OtherItem? = null
    var previous: OtherItem? = null
    var next: OtherItem? = null

    @SerializedName("next_2")
    var next2: OtherItem? = null

    var shares: File.Shares? = null
    var channels: List<String>? = null
    var groups: List<String>? = null
    var ims: List<String>? = null

    @SerializedName("thumb_64")
    var thumb64: String? = null

    @SerializedName("thumb_64_gif")
    var thumb64Gif: String? = null

    @SerializedName("thumb_64_w")
    var thumb64Width: String? = null

    @SerializedName("thumb_64_h")
    var thumb64Height: String? = null

    @SerializedName("thumb_80")
    var thumb80: String? = null

    @SerializedName("thumb_80_gif")
    var thumb80Gif: String? = null

    @SerializedName("thumb_80_w")
    var thumb80Width: String? = null

    @SerializedName("thumb_80_h")
    var thumb80Height: String? = null

    @SerializedName("thumb_160")
    var thumb160: String? = null

    @SerializedName("thumb_160_gif")
    var thumb160Gif: String? = null

    @SerializedName("thumb_160_w")
    var thumb160Width: String? = null

    @SerializedName("thumb_160_h")
    var thumb160Height: String? = null

    @SerializedName("thumb_360")
    var thumb360: String? = null

    @SerializedName("thumb_360_gif")
    var thumb360Gif: String? = null

    @SerializedName("thumb_360_w")
    var thumb360Width: String? = null

    @SerializedName("thumb_360_h")
    var thumb360Height: String? = null

    @SerializedName("thumb_480")
    var thumb480: String? = null

    @SerializedName("thumb_480_gif")
    var thumb480Gif: String? = null

    @SerializedName("thumb_480_w")
    var thumb480Width: String? = null

    @SerializedName("thumb_480_h")
    var thumb480Height: String? = null

    @SerializedName("thumb_720")
    var thumb720: String? = null

    @SerializedName("thumb_720_gif")
    var thumb720Gif: String? = null

    @SerializedName("thumb_720_w")
    var thumb720Width: String? = null

    @SerializedName("thumb_720_h")
    var thumb720Height: String? = null

    @SerializedName("thumb_800")
    var thumb800: String? = null

    @SerializedName("thumb_800_gif")
    var thumb800Gif: String? = null

    @SerializedName("thumb_800_w")
    var thumb800Width: String? = null

    @SerializedName("thumb_800_h")
    var thumb800Height: String? = null

    @SerializedName("thumb_960")
    var thumb960: String? = null

    @SerializedName("thumb_960_gif")
    var thumb960Gif: String? = null

    @SerializedName("thumb_960_w")
    var thumb960Width: String? = null

    @SerializedName("thumb_960_h")
    var thumb960Height: String? = null

    @SerializedName("thumb_1024")
    var thumb1024: String? = null

    @SerializedName("thumb_1024_gif")
    var thumb1024Gif: String? = null

    @SerializedName("thumb_1024_w")
    var thumb1024Width: String? = null

    @SerializedName("thumb_1024_h")
    var thumb1024Height: String? = null

    var thumbTiny: String? = null

    var thumbPdf: String? = null

    @SerializedName("thumb_pdf_w")
    var thumbPdfWidth: String? = null

    @SerializedName("thumb_pdf_h")
    var thumbPdfHeight: String? = null

    var imageExifRotation: Int? = null

    @SerializedName("original_w")
    var originalWidth: String? = null

    @SerializedName("original_h")
    var originalHeight: String? = null

    var score: String? = null
    var isTopFile: Boolean = false

    var deanimateGif: String? = null

    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null

    class OtherItem {
        var iid: String? = null
        var type: String? = null
        var user: String? = null
        var username: String? = null
        var ts: String? = null
        var text: String? = null
        var attachments: List<Attachment>? = null
        var blocks: List<LayoutBlock>? = null
        var permalink: String? = null
    }

    var to: List<Address>? = null
    var from: List<Address>? = null
    var cc: List<Address>? = null

    class Address {
        var address: String? = null
        var name: String? = null
        var original: String? = null
    }
}
