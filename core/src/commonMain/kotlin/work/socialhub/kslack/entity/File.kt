package work.socialhub.kslack.entity

import com.github.seratch.jslack.api.model.block.LayoutBlock

/**
 * https://api.slack.com/types/file
 */
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

    @SerializedName("is_external")
    var isExternal: Boolean = false
    var externalType: String? = null
    var externalId: String? = null
    var externalUrl: String? = null

    var username: String? = null
    var size: Int? = null
    var urlPrivate: String? = null
    var urlPrivateDownload: String? = null

    var appId: String? = null
    var appName: String? = null

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

    var thumbVideo: String? = null

    @SerializedName("thumb_pdf")
    var thumbPdf: String? = null

    @SerializedName("thumb_pdf_w")
    var thumbPdfWidth: String? = null

    @SerializedName("thumb_pdf_h")
    var thumbPdfHeight: String? = null

    var thumbTiny: String? = null

    var convertedPdf: String? = null

    var imageExifRotation: Int? = null

    @SerializedName("original_w")
    var originalWidth: String? = null

    @SerializedName("original_h")
    var originalHeight: String? = null

    var deanimateGif: String? = null
    var pjpeg: String? = null

    var permalink: String? = null
    var permalinkPublic: String? = null

    var editLink: String? = null

    var isHasRichPreview: Boolean = false

    @SerializedName("preview_is_truncated")
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

    @SerializedName("is_public")
    var isPublic: Boolean = false

    constructor(
        id: String?,
        created: Int?,
        timestamp: Int?,
        name: String?,
        title: String?,
        subject: String?,
        mimetype: String?,
        filetype: String?,
        prettyType: String?,
        user: String?,
        mode: String?,
        editable: Boolean,
        external: Boolean,
        externalType: String?,
        externalId: String?,
        externalUrl: String?,
        username: String?,
        size: Int?,
        urlPrivate: String?,
        urlPrivateDownload: String?,
        appId: String?,
        appName: String?,
        thumb64: String?,
        thumb64Gif: String?,
        thumb64Width: String?,
        thumb64Height: String?,
        thumb80: String?,
        thumb80Gif: String?,
        thumb80Width: String?,
        thumb80Height: String?,
        thumb160: String?,
        thumb160Gif: String?,
        thumb160Width: String?,
        thumb160Height: String?,
        thumb360: String?,
        thumb360Gif: String?,
        thumb360Width: String?,
        thumb360Height: String?,
        thumb480: String?,
        thumb480Gif: String?,
        thumb480Width: String?,
        thumb480Height: String?,
        thumb720: String?,
        thumb720Gif: String?,
        thumb720Width: String?,
        thumb720Height: String?,
        thumb800: String?,
        thumb800Gif: String?,
        thumb800Width: String?,
        thumb800Height: String?,
        thumb960: String?,
        thumb960Gif: String?,
        thumb960Width: String?,
        thumb960Height: String?,
        thumb1024: String?,
        thumb1024Gif: String?,
        thumb1024Width: String?,
        thumb1024Height: String?,
        thumbVideo: String?,
        thumbPdf: String?,
        thumbPdfWidth: String?,
        thumbPdfHeight: String?,
        thumbTiny: String?,
        convertedPdf: String?,
        imageExifRotation: Int?,
        originalWidth: String?,
        originalHeight: String?,
        deanimateGif: String?,
        pjpeg: String?,
        permalink: String?,
        permalinkPublic: String?,
        editLink: String?,
        hasRichPreview: Boolean,
        previewTruncated: Boolean,
        preview: String?,
        previewHighlight: String?,
        plainText: String?,
        previewPlainText: String?,
        hasMore: Boolean,
        sentToSelf: Boolean,
        botId: String?,
        lines: Int?,
        linesMore: Int?,
        _public: Boolean,
        publicUrlShared: Boolean,
        displayAsBot: Boolean,
        channels: List<String>?,
        groups: List<String>?,
        ims: List<String>?,
        initialComment: FileComment?,
        numStars: Int?,
        starred: Boolean,
        pinnedTo: List<String>?,
        reactions: List<Reaction>?,
        commentsCount: Int?,
        channelActionsTs: String?,
        channelActionsCount: Int?,
        attachments: List<Attachment>?,
        blocks: List<LayoutBlock>?,
        shares: Shares?,
        to: List<Address>?,
        from: List<Address>?,
        cc: List<Address>?,
        pinnedInfo: Map<String, PinnedInfo>?
    ) {
        this.id = id
        this.created = created
        this.timestamp = timestamp
        this.name = name
        this.title = title
        this.subject = subject
        this.mimetype = mimetype
        this.filetype = filetype
        this.prettyType = prettyType
        this.user = user
        this.mode = mode
        this.isEditable = editable
        this.isExternal = external
        this.externalType = externalType
        this.externalId = externalId
        this.externalUrl = externalUrl
        this.username = username
        this.size = size
        this.urlPrivate = urlPrivate
        this.urlPrivateDownload = urlPrivateDownload
        this.appId = appId
        this.appName = appName
        this.thumb64 = thumb64
        this.thumb64Gif = thumb64Gif
        this.thumb64Width = thumb64Width
        this.thumb64Height = thumb64Height
        this.thumb80 = thumb80
        this.thumb80Gif = thumb80Gif
        this.thumb80Width = thumb80Width
        this.thumb80Height = thumb80Height
        this.thumb160 = thumb160
        this.thumb160Gif = thumb160Gif
        this.thumb160Width = thumb160Width
        this.thumb160Height = thumb160Height
        this.thumb360 = thumb360
        this.thumb360Gif = thumb360Gif
        this.thumb360Width = thumb360Width
        this.thumb360Height = thumb360Height
        this.thumb480 = thumb480
        this.thumb480Gif = thumb480Gif
        this.thumb480Width = thumb480Width
        this.thumb480Height = thumb480Height
        this.thumb720 = thumb720
        this.thumb720Gif = thumb720Gif
        this.thumb720Width = thumb720Width
        this.thumb720Height = thumb720Height
        this.thumb800 = thumb800
        this.thumb800Gif = thumb800Gif
        this.thumb800Width = thumb800Width
        this.thumb800Height = thumb800Height
        this.thumb960 = thumb960
        this.thumb960Gif = thumb960Gif
        this.thumb960Width = thumb960Width
        this.thumb960Height = thumb960Height
        this.thumb1024 = thumb1024
        this.thumb1024Gif = thumb1024Gif
        this.thumb1024Width = thumb1024Width
        this.thumb1024Height = thumb1024Height
        this.thumbVideo = thumbVideo
        this.thumbPdf = thumbPdf
        this.thumbPdfWidth = thumbPdfWidth
        this.thumbPdfHeight = thumbPdfHeight
        this.thumbTiny = thumbTiny
        this.convertedPdf = convertedPdf
        this.imageExifRotation = imageExifRotation
        this.originalWidth = originalWidth
        this.originalHeight = originalHeight
        this.deanimateGif = deanimateGif
        this.pjpeg = pjpeg
        this.permalink = permalink
        this.permalinkPublic = permalinkPublic
        this.editLink = editLink
        this.isHasRichPreview = hasRichPreview
        this.isPreviewTruncated = previewTruncated
        this.preview = preview
        this.previewHighlight = previewHighlight
        this.plainText = plainText
        this.previewPlainText = previewPlainText
        this.isHasMore = hasMore
        this.isSentToSelf = sentToSelf
        this.botId = botId
        this.lines = lines
        this.linesMore = linesMore
        this.isPublic = _public
        this.isPublicUrlShared = publicUrlShared
        this.isDisplayAsBot = displayAsBot
        this.channels = channels
        this.groups = groups
        this.ims = ims
        this.initialComment = initialComment
        this.numStars = numStars
        this.isStarred = starred
        this.pinnedTo = pinnedTo
        this.reactions = reactions
        this.commentsCount = commentsCount
        this.channelActionsTs = channelActionsTs
        this.channelActionsCount = channelActionsCount
        this.attachments = attachments
        this.blocks = blocks
        this.shares = shares
        this.to = to
        this.from = from
        this.cc = cc
        this.pinnedInfo = pinnedInfo
    }

    constructor()

    var isPublicUrlShared: Boolean = false
    var isDisplayAsBot: Boolean = false

    var channels: List<String>? = null
    var groups: List<String>? = null
    var ims: List<String>? = null
    private var initialComment: FileComment? = null
    var numStars: Int? = null

    @SerializedName("is_starred")
    var isStarred: Boolean = false

    var pinnedTo: List<String>? = null
    var reactions: List<Reaction>? = null
    var commentsCount: Int? = null

    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null

    private var attachments: List<Attachment>? = null
    private var blocks: List<LayoutBlock>? = null

    var shares: Shares? = null

    fun getInitialComment(): FileComment? {
        return this.initialComment
    }

    fun getAttachments(): List<Attachment>? {
        return this.attachments
    }

    fun getBlocks(): List<LayoutBlock>? {
        return this.blocks
    }

    fun setInitialComment(initialComment: FileComment?) {
        this.initialComment = initialComment
    }

    fun setAttachments(attachments: List<Attachment>?) {
        this.attachments = attachments
    }

    fun setBlocks(blocks: List<LayoutBlock>?) {
        this.blocks = blocks
    }

    class Shares {
        /**
         * The key of the Map: channel ID
         */
        @SerializedName("public")
        var publicChannels: Map<String, List<ShareDetail>>? = null

        /**
         * The key of the Map: channel ID
         */
        @SerializedName("private")
        var privateChannels: Map<String, List<ShareDetail>>? = null
    }

    class ShareDetail {
        var replyUsers: List<String>? = null
        var replyUsersCount: Int? = null
        var replyCount: Int? = null
        var ts: String? = null
        var threadTs: String? = null
        var latestReply: String? = null
        var channelName: String? = null
        var teamId: String? = null
    }

    var to: List<Address>? = null
    var from: List<Address>? = null
    var cc: List<Address>? = null

    class Address {
        var address: String? = null
        var name: String? = null
        var original: String? = null
    }

    var pinnedInfo: Map<String, PinnedInfo>? = null // C00000000 -> {}

    class PinnedInfo {
        var pinnedBy: String? = null // U00000000
        var pinnedTs: Int? = null
    }

    class FileBuilder internal constructor() {
        private var id: String? = null
        private var created: Int? = null
        private var timestamp: Int? = null
        private var name: String? = null
        private var title: String? = null
        private var subject: String? = null
        private var mimetype: String? = null
        private var filetype: String? = null
        private var prettyType: String? = null
        private var user: String? = null
        private var mode: String? = null
        private var editable = false
        private var external = false
        private var externalType: String? = null
        private var externalId: String? = null
        private var externalUrl: String? = null
        private var username: String? = null
        private var size: Int? = null
        private var urlPrivate: String? = null
        private var urlPrivateDownload: String? = null
        private var appId: String? = null
        private var appName: String? = null
        private var thumb64: String? = null
        private var thumb64Gif: String? = null
        private var thumb64Width: String? = null
        private var thumb64Height: String? = null
        private var thumb80: String? = null
        private var thumb80Gif: String? = null
        private var thumb80Width: String? = null
        private var thumb80Height: String? = null
        private var thumb160: String? = null
        private var thumb160Gif: String? = null
        private var thumb160Width: String? = null
        private var thumb160Height: String? = null
        private var thumb360: String? = null
        private var thumb360Gif: String? = null
        private var thumb360Width: String? = null
        private var thumb360Height: String? = null
        private var thumb480: String? = null
        private var thumb480Gif: String? = null
        private var thumb480Width: String? = null
        private var thumb480Height: String? = null
        private var thumb720: String? = null
        private var thumb720Gif: String? = null
        private var thumb720Width: String? = null
        private var thumb720Height: String? = null
        private var thumb800: String? = null
        private var thumb800Gif: String? = null
        private var thumb800Width: String? = null
        private var thumb800Height: String? = null
        private var thumb960: String? = null
        private var thumb960Gif: String? = null
        private var thumb960Width: String? = null
        private var thumb960Height: String? = null
        private var thumb1024: String? = null
        private var thumb1024Gif: String? = null
        private var thumb1024Width: String? = null
        private var thumb1024Height: String? = null
        private var thumbVideo: String? = null
        private var thumbPdf: String? = null
        private var thumbPdfWidth: String? = null
        private var thumbPdfHeight: String? = null
        private var thumbTiny: String? = null
        private var convertedPdf: String? = null
        private var imageExifRotation: Int? = null
        private var originalWidth: String? = null
        private var originalHeight: String? = null
        private var deanimateGif: String? = null
        private var pjpeg: String? = null
        private var permalink: String? = null
        private var permalinkPublic: String? = null
        private var editLink: String? = null
        private var hasRichPreview = false
        private var previewTruncated = false
        private var preview: String? = null
        private var previewHighlight: String? = null
        private var plainText: String? = null
        private var previewPlainText: String? = null
        private var hasMore = false
        private var sentToSelf = false
        private var botId: String? = null
        private var lines: Int? = null
        private var linesMore: Int? = null
        private var _public = false
        private var publicUrlShared = false
        private var displayAsBot = false
        private var channels: List<String>? = null
        private var groups: List<String>? = null
        private var ims: List<String>? = null
        private var initialComment: FileComment? = null
        private var numStars: Int? = null
        private var starred = false
        private var pinnedTo: List<String>? = null
        private var reactions: List<Reaction>? = null
        private var commentsCount: Int? = null
        private var channelActionsTs: String? = null
        private var channelActionsCount: Int? = null
        private var attachments: List<Attachment>? = null
        private var blocks: List<LayoutBlock>? = null
        private var shares: Shares? = null
        private var to: List<Address>? = null
        private var from: List<Address>? = null
        private var cc: List<Address>? = null
        private var pinnedInfo: Map<String, PinnedInfo>? = null

        fun id(id: String?): FileBuilder {
            this.id = id
            return this
        }

        fun created(created: Int?): FileBuilder {
            this.created = created
            return this
        }

        fun timestamp(timestamp: Int?): FileBuilder {
            this.timestamp = timestamp
            return this
        }

        fun name(name: String?): FileBuilder {
            this.name = name
            return this
        }

        fun title(title: String?): FileBuilder {
            this.title = title
            return this
        }

        fun subject(subject: String?): FileBuilder {
            this.subject = subject
            return this
        }

        fun mimetype(mimetype: String?): FileBuilder {
            this.mimetype = mimetype
            return this
        }

        fun filetype(filetype: String?): FileBuilder {
            this.filetype = filetype
            return this
        }

        fun prettyType(prettyType: String?): FileBuilder {
            this.prettyType = prettyType
            return this
        }

        fun user(user: String?): FileBuilder {
            this.user = user
            return this
        }

        fun mode(mode: String?): FileBuilder {
            this.mode = mode
            return this
        }

        fun editable(editable: Boolean): FileBuilder {
            this.editable = editable
            return this
        }

        fun external(external: Boolean): FileBuilder {
            this.external = external
            return this
        }

        fun externalType(externalType: String?): FileBuilder {
            this.externalType = externalType
            return this
        }

        fun externalId(externalId: String?): FileBuilder {
            this.externalId = externalId
            return this
        }

        fun externalUrl(externalUrl: String?): FileBuilder {
            this.externalUrl = externalUrl
            return this
        }

        fun username(username: String?): FileBuilder {
            this.username = username
            return this
        }

        fun size(size: Int?): FileBuilder {
            this.size = size
            return this
        }

        fun urlPrivate(urlPrivate: String?): FileBuilder {
            this.urlPrivate = urlPrivate
            return this
        }

        fun urlPrivateDownload(urlPrivateDownload: String?): FileBuilder {
            this.urlPrivateDownload = urlPrivateDownload
            return this
        }

        fun appId(appId: String?): FileBuilder {
            this.appId = appId
            return this
        }

        fun appName(appName: String?): FileBuilder {
            this.appName = appName
            return this
        }

        fun thumb64(thumb64: String?): FileBuilder {
            this.thumb64 = thumb64
            return this
        }

        fun thumb64Gif(thumb64Gif: String?): FileBuilder {
            this.thumb64Gif = thumb64Gif
            return this
        }

        fun thumb64Width(thumb64Width: String?): FileBuilder {
            this.thumb64Width = thumb64Width
            return this
        }

        fun thumb64Height(thumb64Height: String?): FileBuilder {
            this.thumb64Height = thumb64Height
            return this
        }

        fun thumb80(thumb80: String?): FileBuilder {
            this.thumb80 = thumb80
            return this
        }

        fun thumb80Gif(thumb80Gif: String?): FileBuilder {
            this.thumb80Gif = thumb80Gif
            return this
        }

        fun thumb80Width(thumb80Width: String?): FileBuilder {
            this.thumb80Width = thumb80Width
            return this
        }

        fun thumb80Height(thumb80Height: String?): FileBuilder {
            this.thumb80Height = thumb80Height
            return this
        }

        fun thumb160(thumb160: String?): FileBuilder {
            this.thumb160 = thumb160
            return this
        }

        fun thumb160Gif(thumb160Gif: String?): FileBuilder {
            this.thumb160Gif = thumb160Gif
            return this
        }

        fun thumb160Width(thumb160Width: String?): FileBuilder {
            this.thumb160Width = thumb160Width
            return this
        }

        fun thumb160Height(thumb160Height: String?): FileBuilder {
            this.thumb160Height = thumb160Height
            return this
        }

        fun thumb360(thumb360: String?): FileBuilder {
            this.thumb360 = thumb360
            return this
        }

        fun thumb360Gif(thumb360Gif: String?): FileBuilder {
            this.thumb360Gif = thumb360Gif
            return this
        }

        fun thumb360Width(thumb360Width: String?): FileBuilder {
            this.thumb360Width = thumb360Width
            return this
        }

        fun thumb360Height(thumb360Height: String?): FileBuilder {
            this.thumb360Height = thumb360Height
            return this
        }

        fun thumb480(thumb480: String?): FileBuilder {
            this.thumb480 = thumb480
            return this
        }

        fun thumb480Gif(thumb480Gif: String?): FileBuilder {
            this.thumb480Gif = thumb480Gif
            return this
        }

        fun thumb480Width(thumb480Width: String?): FileBuilder {
            this.thumb480Width = thumb480Width
            return this
        }

        fun thumb480Height(thumb480Height: String?): FileBuilder {
            this.thumb480Height = thumb480Height
            return this
        }

        fun thumb720(thumb720: String?): FileBuilder {
            this.thumb720 = thumb720
            return this
        }

        fun thumb720Gif(thumb720Gif: String?): FileBuilder {
            this.thumb720Gif = thumb720Gif
            return this
        }

        fun thumb720Width(thumb720Width: String?): FileBuilder {
            this.thumb720Width = thumb720Width
            return this
        }

        fun thumb720Height(thumb720Height: String?): FileBuilder {
            this.thumb720Height = thumb720Height
            return this
        }

        fun thumb800(thumb800: String?): FileBuilder {
            this.thumb800 = thumb800
            return this
        }

        fun thumb800Gif(thumb800Gif: String?): FileBuilder {
            this.thumb800Gif = thumb800Gif
            return this
        }

        fun thumb800Width(thumb800Width: String?): FileBuilder {
            this.thumb800Width = thumb800Width
            return this
        }

        fun thumb800Height(thumb800Height: String?): FileBuilder {
            this.thumb800Height = thumb800Height
            return this
        }

        fun thumb960(thumb960: String?): FileBuilder {
            this.thumb960 = thumb960
            return this
        }

        fun thumb960Gif(thumb960Gif: String?): FileBuilder {
            this.thumb960Gif = thumb960Gif
            return this
        }

        fun thumb960Width(thumb960Width: String?): FileBuilder {
            this.thumb960Width = thumb960Width
            return this
        }

        fun thumb960Height(thumb960Height: String?): FileBuilder {
            this.thumb960Height = thumb960Height
            return this
        }

        fun thumb1024(thumb1024: String?): FileBuilder {
            this.thumb1024 = thumb1024
            return this
        }

        fun thumb1024Gif(thumb1024Gif: String?): FileBuilder {
            this.thumb1024Gif = thumb1024Gif
            return this
        }

        fun thumb1024Width(thumb1024Width: String?): FileBuilder {
            this.thumb1024Width = thumb1024Width
            return this
        }

        fun thumb1024Height(thumb1024Height: String?): FileBuilder {
            this.thumb1024Height = thumb1024Height
            return this
        }

        fun thumbVideo(thumbVideo: String?): FileBuilder {
            this.thumbVideo = thumbVideo
            return this
        }

        fun thumbPdf(thumbPdf: String?): FileBuilder {
            this.thumbPdf = thumbPdf
            return this
        }

        fun thumbPdfWidth(thumbPdfWidth: String?): FileBuilder {
            this.thumbPdfWidth = thumbPdfWidth
            return this
        }

        fun thumbPdfHeight(thumbPdfHeight: String?): FileBuilder {
            this.thumbPdfHeight = thumbPdfHeight
            return this
        }

        fun thumbTiny(thumbTiny: String?): FileBuilder {
            this.thumbTiny = thumbTiny
            return this
        }

        fun convertedPdf(convertedPdf: String?): FileBuilder {
            this.convertedPdf = convertedPdf
            return this
        }

        fun imageExifRotation(imageExifRotation: Int?): FileBuilder {
            this.imageExifRotation = imageExifRotation
            return this
        }

        fun originalWidth(originalWidth: String?): FileBuilder {
            this.originalWidth = originalWidth
            return this
        }

        fun originalHeight(originalHeight: String?): FileBuilder {
            this.originalHeight = originalHeight
            return this
        }

        fun deanimateGif(deanimateGif: String?): FileBuilder {
            this.deanimateGif = deanimateGif
            return this
        }

        fun pjpeg(pjpeg: String?): FileBuilder {
            this.pjpeg = pjpeg
            return this
        }

        fun permalink(permalink: String?): FileBuilder {
            this.permalink = permalink
            return this
        }

        fun permalinkPublic(permalinkPublic: String?): FileBuilder {
            this.permalinkPublic = permalinkPublic
            return this
        }

        fun editLink(editLink: String?): FileBuilder {
            this.editLink = editLink
            return this
        }

        fun hasRichPreview(hasRichPreview: Boolean): FileBuilder {
            this.hasRichPreview = hasRichPreview
            return this
        }

        fun previewTruncated(previewTruncated: Boolean): FileBuilder {
            this.previewTruncated = previewTruncated
            return this
        }

        fun preview(preview: String?): FileBuilder {
            this.preview = preview
            return this
        }

        fun previewHighlight(previewHighlight: String?): FileBuilder {
            this.previewHighlight = previewHighlight
            return this
        }

        fun plainText(plainText: String?): FileBuilder {
            this.plainText = plainText
            return this
        }

        fun previewPlainText(previewPlainText: String?): FileBuilder {
            this.previewPlainText = previewPlainText
            return this
        }

        fun hasMore(hasMore: Boolean): FileBuilder {
            this.hasMore = hasMore
            return this
        }

        fun sentToSelf(sentToSelf: Boolean): FileBuilder {
            this.sentToSelf = sentToSelf
            return this
        }

        fun botId(botId: String?): FileBuilder {
            this.botId = botId
            return this
        }

        fun lines(lines: Int?): FileBuilder {
            this.lines = lines
            return this
        }

        fun linesMore(linesMore: Int?): FileBuilder {
            this.linesMore = linesMore
            return this
        }

        fun _public(_public: Boolean): FileBuilder {
            this._public = _public
            return this
        }

        fun publicUrlShared(publicUrlShared: Boolean): FileBuilder {
            this.publicUrlShared = publicUrlShared
            return this
        }

        fun displayAsBot(displayAsBot: Boolean): FileBuilder {
            this.displayAsBot = displayAsBot
            return this
        }

        fun channels(channels: List<String>?): FileBuilder {
            this.channels = channels
            return this
        }

        fun groups(groups: List<String>?): FileBuilder {
            this.groups = groups
            return this
        }

        fun ims(ims: List<String>?): FileBuilder {
            this.ims = ims
            return this
        }

        fun initialComment(initialComment: FileComment?): FileBuilder {
            this.initialComment = initialComment
            return this
        }

        fun numStars(numStars: Int?): FileBuilder {
            this.numStars = numStars
            return this
        }

        fun starred(starred: Boolean): FileBuilder {
            this.starred = starred
            return this
        }

        fun pinnedTo(pinnedTo: List<String>?): FileBuilder {
            this.pinnedTo = pinnedTo
            return this
        }

        fun reactions(reactions: List<Reaction>?): FileBuilder {
            this.reactions = reactions
            return this
        }

        fun commentsCount(commentsCount: Int?): FileBuilder {
            this.commentsCount = commentsCount
            return this
        }

        fun channelActionsTs(channelActionsTs: String?): FileBuilder {
            this.channelActionsTs = channelActionsTs
            return this
        }

        fun channelActionsCount(channelActionsCount: Int?): FileBuilder {
            this.channelActionsCount = channelActionsCount
            return this
        }

        fun attachments(attachments: List<Attachment>?): FileBuilder {
            this.attachments = attachments
            return this
        }

        fun blocks(blocks: List<LayoutBlock>?): FileBuilder {
            this.blocks = blocks
            return this
        }

        fun shares(shares: Shares?): FileBuilder {
            this.shares = shares
            return this
        }

        fun to(to: List<Address>?): FileBuilder {
            this.to = to
            return this
        }

        fun from(from: List<Address>?): FileBuilder {
            this.from = from
            return this
        }

        fun cc(cc: List<Address>?): FileBuilder {
            this.cc = cc
            return this
        }

        fun pinnedInfo(pinnedInfo: Map<String, PinnedInfo>?): FileBuilder {
            this.pinnedInfo = pinnedInfo
            return this
        }

        fun build(): File {
            return File(
                id,
                created,
                timestamp,
                name,
                title,
                subject,
                mimetype,
                filetype,
                prettyType,
                user,
                mode,
                editable,
                external,
                externalType,
                externalId,
                externalUrl,
                username,
                size,
                urlPrivate,
                urlPrivateDownload,
                appId,
                appName,
                thumb64,
                thumb64Gif,
                thumb64Width,
                thumb64Height,
                thumb80,
                thumb80Gif,
                thumb80Width,
                thumb80Height,
                thumb160,
                thumb160Gif,
                thumb160Width,
                thumb160Height,
                thumb360,
                thumb360Gif,
                thumb360Width,
                thumb360Height,
                thumb480,
                thumb480Gif,
                thumb480Width,
                thumb480Height,
                thumb720,
                thumb720Gif,
                thumb720Width,
                thumb720Height,
                thumb800,
                thumb800Gif,
                thumb800Width,
                thumb800Height,
                thumb960,
                thumb960Gif,
                thumb960Width,
                thumb960Height,
                thumb1024,
                thumb1024Gif,
                thumb1024Width,
                thumb1024Height,
                thumbVideo,
                thumbPdf,
                thumbPdfWidth,
                thumbPdfHeight,
                thumbTiny,
                convertedPdf,
                imageExifRotation,
                originalWidth,
                originalHeight,
                deanimateGif,
                pjpeg,
                permalink,
                permalinkPublic,
                editLink,
                hasRichPreview,
                previewTruncated,
                preview,
                previewHighlight,
                plainText,
                previewPlainText,
                hasMore,
                sentToSelf,
                botId,
                lines,
                linesMore,
                _public,
                publicUrlShared,
                displayAsBot,
                channels,
                groups,
                ims,
                initialComment,
                numStars,
                starred,
                pinnedTo,
                reactions,
                commentsCount,
                channelActionsTs,
                channelActionsCount,
                attachments,
                blocks,
                shares,
                to,
                from,
                cc,
                pinnedInfo
            )
        }

        override fun toString(): String {
            return "File.FileBuilder(id=" + this.id + ", created=" + this.created + ", timestamp=" + this.timestamp + ", name=" + this.name + ", title=" + this.title + ", subject=" + this.subject + ", mimetype=" + this.mimetype + ", filetype=" + this.filetype + ", prettyType=" + this.prettyType + ", user=" + this.user + ", mode=" + this.mode + ", editable=" + this.editable + ", external=" + this.external + ", externalType=" + this.externalType + ", externalId=" + this.externalId + ", externalUrl=" + this.externalUrl + ", username=" + this.username + ", size=" + this.size + ", urlPrivate=" + this.urlPrivate + ", urlPrivateDownload=" + this.urlPrivateDownload + ", appId=" + this.appId + ", appName=" + this.appName + ", thumb64=" + this.thumb64 + ", thumb64Gif=" + this.thumb64Gif + ", thumb64Width=" + this.thumb64Width + ", thumb64Height=" + this.thumb64Height + ", thumb80=" + this.thumb80 + ", thumb80Gif=" + this.thumb80Gif + ", thumb80Width=" + this.thumb80Width + ", thumb80Height=" + this.thumb80Height + ", thumb160=" + this.thumb160 + ", thumb160Gif=" + this.thumb160Gif + ", thumb160Width=" + this.thumb160Width + ", thumb160Height=" + this.thumb160Height + ", thumb360=" + this.thumb360 + ", thumb360Gif=" + this.thumb360Gif + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", thumb480=" + this.thumb480 + ", thumb480Gif=" + this.thumb480Gif + ", thumb480Width=" + this.thumb480Width + ", thumb480Height=" + this.thumb480Height + ", thumb720=" + this.thumb720 + ", thumb720Gif=" + this.thumb720Gif + ", thumb720Width=" + this.thumb720Width + ", thumb720Height=" + this.thumb720Height + ", thumb800=" + this.thumb800 + ", thumb800Gif=" + this.thumb800Gif + ", thumb800Width=" + this.thumb800Width + ", thumb800Height=" + this.thumb800Height + ", thumb960=" + this.thumb960 + ", thumb960Gif=" + this.thumb960Gif + ", thumb960Width=" + this.thumb960Width + ", thumb960Height=" + this.thumb960Height + ", thumb1024=" + this.thumb1024 + ", thumb1024Gif=" + this.thumb1024Gif + ", thumb1024Width=" + this.thumb1024Width + ", thumb1024Height=" + this.thumb1024Height + ", thumbVideo=" + this.thumbVideo + ", thumbPdf=" + this.thumbPdf + ", thumbPdfWidth=" + this.thumbPdfWidth + ", thumbPdfHeight=" + this.thumbPdfHeight + ", thumbTiny=" + this.thumbTiny + ", convertedPdf=" + this.convertedPdf + ", imageExifRotation=" + this.imageExifRotation + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", deanimateGif=" + this.deanimateGif + ", pjpeg=" + this.pjpeg + ", permalink=" + this.permalink + ", permalinkPublic=" + this.permalinkPublic + ", editLink=" + this.editLink + ", hasRichPreview=" + this.hasRichPreview + ", previewTruncated=" + this.previewTruncated + ", preview=" + this.preview + ", previewHighlight=" + this.previewHighlight + ", plainText=" + this.plainText + ", previewPlainText=" + this.previewPlainText + ", hasMore=" + this.hasMore + ", sentToSelf=" + this.sentToSelf + ", botId=" + this.botId + ", lines=" + this.lines + ", linesMore=" + this.linesMore + ", _public=" + this._public + ", publicUrlShared=" + this.publicUrlShared + ", displayAsBot=" + this.displayAsBot + ", channels=" + this.channels + ", groups=" + this.groups + ", ims=" + this.ims + ", initialComment=" + this.initialComment + ", numStars=" + this.numStars + ", starred=" + this.starred + ", pinnedTo=" + this.pinnedTo + ", reactions=" + this.reactions + ", commentsCount=" + this.commentsCount + ", channelActionsTs=" + this.channelActionsTs + ", channelActionsCount=" + this.channelActionsCount + ", attachments=" + this.attachments + ", blocks=" + this.blocks + ", shares=" + this.shares + ", to=" + this.to + ", from=" + this.from + ", cc=" + this.cc + ", pinnedInfo=" + this.pinnedInfo + ")"
        }
    }

    companion object {
        fun builder(): FileBuilder {
            return FileBuilder()
        }
    }
}