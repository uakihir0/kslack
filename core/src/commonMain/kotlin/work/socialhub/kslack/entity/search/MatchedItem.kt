package work.socialhub.kslack.entity.search

import work.socialhub.kmastodon.entity.Attachment
import work.socialhub.kslack.api.model.block.LayoutBlock
import work.socialhub.kslack.entity.Channel
import work.socialhub.kslack.entity.file.File

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
    var attachments: Array<Attachment>? = null
    var blocks: Array<LayoutBlock>? = null
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

    @SerialName("is_intro")
    private val intro = false

    @SerialName("is_public")
    var isPublic: Boolean = false

    var isPublicUrlShared: Boolean = false

    var urlPrivate: String? = null
    var isUrlPrivateDownload: Boolean = false

    var isPermalinkPublic: Boolean = false

    var editLink: String? = null
    var previewHighlight: String? = null

    var lines: Int? = null
    var linesMore: Int? = null

    @SerialName("preview_is_truncated")
    var isPreviewTruncated: Boolean = false
    var isHasRichPreview: Boolean = false

    var mimetype: String? = null
    var filetype: String? = null
    var prettyType: String? = null

    @SerialName("is_mpim")
    var isMpim: Boolean = false

    @SerialName("is_external")
    var isExternal: Boolean = false

    @SerialName("is_starred")
    var isStarred: Boolean = false
    var externalType: String? = null
    var isEditable: Boolean = false
    var isDisplayAsBot: Boolean = false
    var size: Int? = null
    var mode: String? = null
    var comment: String? = null

    @SerialName("previous_2")
    var previous2: OtherItem? = null
    var previous: OtherItem? = null
    var next: OtherItem? = null

    @SerialName("next_2")
    var next2: OtherItem? = null

    var shares: File.Shares? = null
    var channels: Array<String>? = null
    var groups: Array<String>? = null
    var ims: Array<String>? = null

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

    var thumbTiny: String? = null

    var thumbPdf: String? = null

    @SerialName("thumb_pdf_w")
    var thumbPdfWidth: String? = null

    @SerialName("thumb_pdf_h")
    var thumbPdfHeight: String? = null

    var imageExifRotation: Int? = null

    @SerialName("original_w")
    var originalWidth: String? = null

    @SerialName("original_h")
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
        var attachments: Array<Attachment>? = null
        var blocks: Array<LayoutBlock>? = null
        var permalink: String? = null
    }

    var to: Array<Address>? = null
    var from: Array<Address>? = null
    var cc: Array<Address>? = null

    class Address {
        var address: String? = null
        var name: String? = null
        var original: String? = null
    }
}
