package work.socialhub.kslack.entity

import com.github.seratch.jslack.api.model.block.LayoutBlock

/**
 * https://api.slack.com/docs/message-attachments
 */
class Attachment {
    var msgSubtype: String? = null // "bot_message"

    /**
     * A plain-text summary of the attachment. This text will be used in clients that don't show formatted text
     * (eg. IRC, mobile notifications) and should not contain any markup.
     */
    var fallback: String? = null

    /**
     * This is optional value that specifies callback id when there are buttons.
     */
    var callbackId: String? = null

    /**
     * Like traffic signals, color-coding messages can quickly communicate intent
     * and help separate them from the flow of other messages in the timeline.
     *
     *
     * An optional value that can either be one of good, warning, danger, or any hex color code (eg. #439FE0).
     * This value is used to color the border along the left side of the message attachment.
     */
    var color: String? = null

    /**
     * This is optional text that appears above the message attachment block.
     */
    var pretext: String? = null

    var serviceUrl: String? = null

    var serviceName: String? = null

    var serviceIcon: String? = null

    // -----------------------------------------
    // The author parameters will display a small section at the top of a message attachment that can contain the following fields:
    /**
     * Small text used to display the author's name.
     */
    var authorName: String? = null

    /**
     * A valid URL that will hyperlink the author_name text mentioned above. Will only work if author_name is present.
     */
    var authorLink: String? = null

    /**
     * A valid URL that displays a small 16x16px image to the left of the author_name text. Will only work if author_name is present.
     */
    var authorIcon: String? = null

    // -----------------------------------------
    // Attributes for reply_broadcast message (showing a posted message as an attachment)
    // https://api.slack.com/events/message/reply_broadcast
    // "from_url": "https://lost-generation-authors.slack.com/archives/general/p1482960137003543",
    var fromUrl: String? = null

    var originalUrl: String? = null

    // "author_subname": "confused",
    var authorSubname: String? = null

    // "channel_id": "C061EG9SL",
    var channelId: String? = null

    // "channel_name": "general",
    var channelName: String? = null

    //"id": 1,
    var id: Int? = null

    var botId: String? = null

    var isIndent: Boolean? = null

    constructor(
        msgSubtype: String?,
        fallback: String?,
        callbackId: String?,
        color: String?,
        pretext: String?,
        serviceUrl: String?,
        serviceName: String?,
        serviceIcon: String?,
        authorName: String?,
        authorLink: String?,
        authorIcon: String?,
        fromUrl: String?,
        originalUrl: String?,
        authorSubname: String?,
        channelId: String?,
        channelName: String?,
        id: Int?,
        botId: String?,
        indent: Boolean?,
        msgUnfurl: Boolean?,
        replyUnfurl: Boolean?,
        threadRootUnfurl: Boolean?,
        appUnfurl: Boolean?,
        appUnfurlUrl: String?,
        title: String?,
        titleLink: String?,
        text: String?,
        fields: Array<Field>?,
        imageUrl: String?,
        imageWidth: Int?,
        imageHeight: Int?,
        imageBytes: Int?,
        thumbUrl: String?,
        thumbWidth: Int?,
        thumbHeight: Int?,
        videoHtml: String?,
        videoHtmlWidth: Int?,
        videoHtmlHeight: Int?,
        footer: String?,
        footerIcon: String?,
        ts: String?,
        mrkdwnIn: Array<String>?,
        actions: Array<Action>?,
        blocks: Array<LayoutBlock>?,
        filename: String?,
        size: Int?,
        mimetype: String?,
        url: String?,
        metadata: AttachmentMetadata?
    ) {
        this.msgSubtype = msgSubtype
        this.fallback = fallback
        this.callbackId = callbackId
        this.color = color
        this.pretext = pretext
        this.serviceUrl = serviceUrl
        this.serviceName = serviceName
        this.serviceIcon = serviceIcon
        this.authorName = authorName
        this.authorLink = authorLink
        this.authorIcon = authorIcon
        this.fromUrl = fromUrl
        this.originalUrl = originalUrl
        this.authorSubname = authorSubname
        this.channelId = channelId
        this.channelName = channelName
        this.id = id
        this.botId = botId
        this.isIndent = indent
        this.isMsgUnfurl = msgUnfurl
        this.isReplyUnfurl = replyUnfurl
        this.isThreadRootUnfurl = threadRootUnfurl
        this.isAppUnfurl = appUnfurl
        this.appUnfurlUrl = appUnfurlUrl
        this.title = title
        this.titleLink = titleLink
        this.text = text
        this.fields = fields
        this.imageUrl = imageUrl
        this.imageWidth = imageWidth
        this.imageHeight = imageHeight
        this.imageBytes = imageBytes
        this.thumbUrl = thumbUrl
        this.thumbWidth = thumbWidth
        this.thumbHeight = thumbHeight
        this.videoHtml = videoHtml
        this.videoHtmlWidth = videoHtmlWidth
        this.videoHtmlHeight = videoHtmlHeight
        this.footer = footer
        this.footerIcon = footerIcon
        this.ts = ts
        this.mrkdwnIn = mrkdwnIn
        this.actions = actions
        this.blocks = blocks
        this.filename = filename
        this.size = size
        this.mimetype = mimetype
        this.url = url
        this.metadata = metadata
    }

    constructor()

    // # already exists > "fallback": "[December 28th, 2016 1:22 PM] confused: what was there?",
    // # already exists > "ts": "1482960137.003543",
    // # already exists > "author_link": "https://lost-generation-authors.slack.com/team/confused",
    // # already exists > "author_icon": "https://...png",
    // # already exists > "mrkdwn_in": ["text"],
    // # already exists > "text": "island",
    // # already exists > "footer": "5 replies"
    /**
     * NOTE: The the following Booleans (is_msg_unfurl, is_reply_unfurl, is_thread_root_unfurl,
     * is_app_unfurl) default to null intentionally to support block attachments.
     */
    @SerialName("is_msg_unfurl")
    var isMsgUnfurl: Boolean? = null

    @SerialName("is_reply_unfurl")
    var isReplyUnfurl: Boolean? = null

    @SerialName("is_thread_root_unfurl")
    var isThreadRootUnfurl: Boolean? = null

    @SerialName("is_app_unfurl")
    var isAppUnfurl: Boolean? = null

    var appUnfurlUrl: String? = null

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    var title: String? = null

    /**
     * The title is displayed as larger, bold text near the top of a message attachment.
     * By passing a valid URL in the title_link parameter (optional), the title text will be hyperlinked.
     */
    var titleLink: String? = null

    /**
     * This is the main text in a message attachment, and can contain standard message markup (see details below).
     * The content will automatically collapse if it contains 700+ characters or 5+ linebreaks,
     * and will display a "Show more..." link to expand the content.
     *
     *
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    var text: String? = null

    /**
     * Fields are defined as an array, and hashes contained within it will be displayed in a table inside the message attachment.
     */
    private var fields: Array<Field>? = java.util.ArrayArray<Field>()

    /**
     * A valid URL to an image file that will be displayed inside a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     *
     *
     * Large images will be resized to a maximum width of 400px or a maximum height of 500px,
     * while still maintaining the original aspect ratio.
     */
    var imageUrl: String? = null

    var imageWidth: Int? = null
    var imageHeight: Int? = null
    var imageBytes: Int? = null

    /**
     * A valid URL to an image file that will be displayed as a thumbnail on the right side of a message attachment.
     * We currently support the following formats: GIF, JPEG, PNG, and BMP.
     *
     *
     * The thumbnail's longest dimension will be scaled down to 75px while maintaining the aspect ratio of the image.
     * The filesize of the image must also be less than 500 KB.
     *
     *
     * For best results, please use images that are already 75px by 75px.
     */
    var thumbUrl: String? = null

    var thumbWidth: Int? = null
    var thumbHeight: Int? = null

    var videoHtml: String? = null

    var videoHtmlWidth: Int? = null
    var videoHtmlHeight: Int? = null

    // Your message attachments may also contain a subtle footer,
    // which is especially useful when citing content in conjunction with author parameters.
    /**
     * Add some brief text to help contextualize and identify an attachment.
     * Limited to 300 characters, and may be truncated further when displayed to users in environments with limited screen real estate.
     */
    var footer: String? = null

    /**
     * To render a small icon beside your footer text, provide a publicly accessible URL string in the footer_icon field.
     * You must also provide a footer for the field to be recognized.
     *
     *
     * We'll render what you provide at 16px by 16px. It's best to use an image that is similarly sized.
     */
    var footerIcon: String? = null

    /**
     * ts (timestamp)
     * Does your attachment relate to something happening at a specific time?
     *
     *
     * By providing the ts field with an integer value in "epoch time",
     * the attachment will display an additional timestamp value as part of the attachment's footer.
     *
     *
     * Use ts when referencing articles or happenings. Your message will have its own timestamp when published.
     */
    var ts: String? = null

    /**
     * By default,
     * [message text
 * in attachments](https://api.slack.com/docs/message-formatting#message_formatting) are not formatted. To enable formatting on attachment fields, add the
     * name of the field (as defined in the API) in this list.
     */
    var mrkdwnIn: Array<String>? = java.util.ArrayArray<String>()

    /**
     * Actions are defined as an array, and hashes contained within it will be displayed in as buttons in the message attachment.
     */
    private var actions: Array<Action>? = java.util.ArrayArray<Action>()

    private var blocks: Array<LayoutBlock>? = null

    // --------------------------
    // Files
    var filename: String? = null
    var size: Int? = null
    var mimetype: String? = null
    var url: String? = null
    var metadata: AttachmentMetadata? = null

    fun getFields(): Array<Field>? {
        return this.fields
    }

    fun getActions(): Array<Action>? {
        return this.actions
    }

    fun getBlocks(): Array<LayoutBlock>? {
        return this.blocks
    }

    fun setFields(fields: Array<Field>?) {
        this.fields = fields
    }

    fun setActions(actions: Array<Action>?) {
        this.actions = actions
    }

    fun setBlocks(blocks: Array<LayoutBlock>?) {
        this.blocks = blocks
    }

    class AttachmentMetadata {
        @SerialName("thumb_64")
        var thumb64: Boolean? = null

        @SerialName("thumb_80")
        var thumb80: Boolean? = null

        @SerialName("thumb_160")
        var thumb160: Boolean? = null

        @SerialName("original_w")
        var originalWidth: Int? = null

        @SerialName("original_h")
        var originalHeight: Int? = null

        @SerialName("thumb_360_w")
        var thumb360Width: Int? = null

        @SerialName("thumb_360_h")
        var thumb360Height: Int? = null

        var format: String? = null
        var extension: String? = null
        var rotation: Int? = null
        var thumbTiny: String? = null

        constructor(
            thumb64: Boolean?,
            thumb80: Boolean?,
            thumb160: Boolean?,
            originalWidth: Int?,
            originalHeight: Int?,
            thumb360Width: Int?,
            thumb360Height: Int?,
            format: String?,
            extension: String?,
            rotation: Int?,
            thumbTiny: String?
        ) {
            this.thumb64 = thumb64
            this.thumb80 = thumb80
            this.thumb160 = thumb160
            this.originalWidth = originalWidth
            this.originalHeight = originalHeight
            this.thumb360Width = thumb360Width
            this.thumb360Height = thumb360Height
            this.format = format
            this.extension = extension
            this.rotation = rotation
            this.thumbTiny = thumbTiny
        }

        constructor()

        class AttachmentMetadataBuilder internal constructor() {
            private var thumb64: Boolean? = null
            private var thumb80: Boolean? = null
            private var thumb160: Boolean? = null
            private var originalWidth: Int? = null
            private var originalHeight: Int? = null
            private var thumb360Width: Int? = null
            private var thumb360Height: Int? = null
            private var format: String? = null
            private var extension: String? = null
            private var rotation: Int? = null
            private var thumbTiny: String? = null

            fun thumb64(thumb64: Boolean?): AttachmentMetadataBuilder {
                this.thumb64 = thumb64
                return this
            }

            fun thumb80(thumb80: Boolean?): AttachmentMetadataBuilder {
                this.thumb80 = thumb80
                return this
            }

            fun thumb160(thumb160: Boolean?): AttachmentMetadataBuilder {
                this.thumb160 = thumb160
                return this
            }

            fun originalWidth(originalWidth: Int?): AttachmentMetadataBuilder {
                this.originalWidth = originalWidth
                return this
            }

            fun originalHeight(originalHeight: Int?): AttachmentMetadataBuilder {
                this.originalHeight = originalHeight
                return this
            }

            fun thumb360Width(thumb360Width: Int?): AttachmentMetadataBuilder {
                this.thumb360Width = thumb360Width
                return this
            }

            fun thumb360Height(thumb360Height: Int?): AttachmentMetadataBuilder {
                this.thumb360Height = thumb360Height
                return this
            }

            fun format(format: String?): AttachmentMetadataBuilder {
                this.format = format
                return this
            }

            fun extension(extension: String?): AttachmentMetadataBuilder {
                this.extension = extension
                return this
            }

            fun rotation(rotation: Int?): AttachmentMetadataBuilder {
                this.rotation = rotation
                return this
            }

            fun thumbTiny(thumbTiny: String?): AttachmentMetadataBuilder {
                this.thumbTiny = thumbTiny
                return this
            }

            fun build(): AttachmentMetadata {
                return AttachmentMetadata(
                    thumb64,
                    thumb80,
                    thumb160,
                    originalWidth,
                    originalHeight,
                    thumb360Width,
                    thumb360Height,
                    format,
                    extension,
                    rotation,
                    thumbTiny
                )
            }

            override fun toString(): String {
                return "Attachment.AttachmentMetadata.AttachmentMetadataBuilder(thumb64=" + this.thumb64 + ", thumb80=" + this.thumb80 + ", thumb160=" + this.thumb160 + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ", thumb360Width=" + this.thumb360Width + ", thumb360Height=" + this.thumb360Height + ", format=" + this.format + ", extension=" + this.extension + ", rotation=" + this.rotation + ", thumbTiny=" + this.thumbTiny + ")"
            }
        }

        companion object {
            fun builder(): AttachmentMetadataBuilder {
                return AttachmentMetadataBuilder()
            }
        }
    }

    class AttachmentBuilder internal constructor() {
        private var msgSubtype: String? = null
        private var fallback: String? = null
        private var callbackId: String? = null
        private var color: String? = null
        private var pretext: String? = null
        private var serviceUrl: String? = null
        private var serviceName: String? = null
        private var serviceIcon: String? = null
        private var authorName: String? = null
        private var authorLink: String? = null
        private var authorIcon: String? = null
        private var fromUrl: String? = null
        private var originalUrl: String? = null
        private var authorSubname: String? = null
        private var channelId: String? = null
        private var channelName: String? = null
        private var id: Int? = null
        private var botId: String? = null
        private var indent: Boolean? = null
        private var msgUnfurl: Boolean? = null
        private var replyUnfurl: Boolean? = null
        private var threadRootUnfurl: Boolean? = null
        private var appUnfurl: Boolean? = null
        private var appUnfurlUrl: String? = null
        private var title: String? = null
        private var titleLink: String? = null
        private var text: String? = null
        private var fields: Array<Field>? = null
        private var imageUrl: String? = null
        private var imageWidth: Int? = null
        private var imageHeight: Int? = null
        private var imageBytes: Int? = null
        private var thumbUrl: String? = null
        private var thumbWidth: Int? = null
        private var thumbHeight: Int? = null
        private var videoHtml: String? = null
        private var videoHtmlWidth: Int? = null
        private var videoHtmlHeight: Int? = null
        private var footer: String? = null
        private var footerIcon: String? = null
        private var ts: String? = null
        private var mrkdwnIn: Array<String>? = null
        private var actions: Array<Action>? = null
        private var blocks: Array<LayoutBlock>? = null
        private var filename: String? = null
        private var size: Int? = null
        private var mimetype: String? = null
        private var url: String? = null
        private var metadata: AttachmentMetadata? = null

        fun msgSubtype(msgSubtype: String?): AttachmentBuilder {
            this.msgSubtype = msgSubtype
            return this
        }

        fun fallback(fallback: String?): AttachmentBuilder {
            this.fallback = fallback
            return this
        }

        fun callbackId(callbackId: String?): AttachmentBuilder {
            this.callbackId = callbackId
            return this
        }

        fun color(color: String?): AttachmentBuilder {
            this.color = color
            return this
        }

        fun pretext(pretext: String?): AttachmentBuilder {
            this.pretext = pretext
            return this
        }

        fun serviceUrl(serviceUrl: String?): AttachmentBuilder {
            this.serviceUrl = serviceUrl
            return this
        }

        fun serviceName(serviceName: String?): AttachmentBuilder {
            this.serviceName = serviceName
            return this
        }

        fun serviceIcon(serviceIcon: String?): AttachmentBuilder {
            this.serviceIcon = serviceIcon
            return this
        }

        fun authorName(authorName: String?): AttachmentBuilder {
            this.authorName = authorName
            return this
        }

        fun authorLink(authorLink: String?): AttachmentBuilder {
            this.authorLink = authorLink
            return this
        }

        fun authorIcon(authorIcon: String?): AttachmentBuilder {
            this.authorIcon = authorIcon
            return this
        }

        fun fromUrl(fromUrl: String?): AttachmentBuilder {
            this.fromUrl = fromUrl
            return this
        }

        fun originalUrl(originalUrl: String?): AttachmentBuilder {
            this.originalUrl = originalUrl
            return this
        }

        fun authorSubname(authorSubname: String?): AttachmentBuilder {
            this.authorSubname = authorSubname
            return this
        }

        fun channelId(channelId: String?): AttachmentBuilder {
            this.channelId = channelId
            return this
        }

        fun channelName(channelName: String?): AttachmentBuilder {
            this.channelName = channelName
            return this
        }

        fun id(id: Int?): AttachmentBuilder {
            this.id = id
            return this
        }

        fun botId(botId: String?): AttachmentBuilder {
            this.botId = botId
            return this
        }

        fun indent(indent: Boolean?): AttachmentBuilder {
            this.indent = indent
            return this
        }

        fun msgUnfurl(msgUnfurl: Boolean?): AttachmentBuilder {
            this.msgUnfurl = msgUnfurl
            return this
        }

        fun replyUnfurl(replyUnfurl: Boolean?): AttachmentBuilder {
            this.replyUnfurl = replyUnfurl
            return this
        }

        fun threadRootUnfurl(threadRootUnfurl: Boolean?): AttachmentBuilder {
            this.threadRootUnfurl = threadRootUnfurl
            return this
        }

        fun appUnfurl(appUnfurl: Boolean?): AttachmentBuilder {
            this.appUnfurl = appUnfurl
            return this
        }

        fun appUnfurlUrl(appUnfurlUrl: String?): AttachmentBuilder {
            this.appUnfurlUrl = appUnfurlUrl
            return this
        }

        fun title(title: String?): AttachmentBuilder {
            this.title = title
            return this
        }

        fun titleLink(titleLink: String?): AttachmentBuilder {
            this.titleLink = titleLink
            return this
        }

        fun text(text: String?): AttachmentBuilder {
            this.text = text
            return this
        }

        fun fields(fields: Array<Field>?): AttachmentBuilder {
            this.fields = fields
            return this
        }

        fun imageUrl(imageUrl: String?): AttachmentBuilder {
            this.imageUrl = imageUrl
            return this
        }

        fun imageWidth(imageWidth: Int?): AttachmentBuilder {
            this.imageWidth = imageWidth
            return this
        }

        fun imageHeight(imageHeight: Int?): AttachmentBuilder {
            this.imageHeight = imageHeight
            return this
        }

        fun imageBytes(imageBytes: Int?): AttachmentBuilder {
            this.imageBytes = imageBytes
            return this
        }

        fun thumbUrl(thumbUrl: String?): AttachmentBuilder {
            this.thumbUrl = thumbUrl
            return this
        }

        fun thumbWidth(thumbWidth: Int?): AttachmentBuilder {
            this.thumbWidth = thumbWidth
            return this
        }

        fun thumbHeight(thumbHeight: Int?): AttachmentBuilder {
            this.thumbHeight = thumbHeight
            return this
        }

        fun videoHtml(videoHtml: String?): AttachmentBuilder {
            this.videoHtml = videoHtml
            return this
        }

        fun videoHtmlWidth(videoHtmlWidth: Int?): AttachmentBuilder {
            this.videoHtmlWidth = videoHtmlWidth
            return this
        }

        fun videoHtmlHeight(videoHtmlHeight: Int?): AttachmentBuilder {
            this.videoHtmlHeight = videoHtmlHeight
            return this
        }

        fun footer(footer: String?): AttachmentBuilder {
            this.footer = footer
            return this
        }

        fun footerIcon(footerIcon: String?): AttachmentBuilder {
            this.footerIcon = footerIcon
            return this
        }

        fun ts(ts: String?): AttachmentBuilder {
            this.ts = ts
            return this
        }

        fun mrkdwnIn(mrkdwnIn: Array<String>?): AttachmentBuilder {
            this.mrkdwnIn = mrkdwnIn
            return this
        }

        fun actions(actions: Array<Action>?): AttachmentBuilder {
            this.actions = actions
            return this
        }

        fun blocks(blocks: Array<LayoutBlock>?): AttachmentBuilder {
            this.blocks = blocks
            return this
        }

        fun filename(filename: String?): AttachmentBuilder {
            this.filename = filename
            return this
        }

        fun size(size: Int?): AttachmentBuilder {
            this.size = size
            return this
        }

        fun mimetype(mimetype: String?): AttachmentBuilder {
            this.mimetype = mimetype
            return this
        }

        fun url(url: String?): AttachmentBuilder {
            this.url = url
            return this
        }

        fun metadata(metadata: AttachmentMetadata?): AttachmentBuilder {
            this.metadata = metadata
            return this
        }

        fun build(): Attachment {
            return Attachment(
                msgSubtype,
                fallback,
                callbackId,
                color,
                pretext,
                serviceUrl,
                serviceName,
                serviceIcon,
                authorName,
                authorLink,
                authorIcon,
                fromUrl,
                originalUrl,
                authorSubname,
                channelId,
                channelName,
                id,
                botId,
                indent,
                msgUnfurl,
                replyUnfurl,
                threadRootUnfurl,
                appUnfurl,
                appUnfurlUrl,
                title,
                titleLink,
                text,
                fields,
                imageUrl,
                imageWidth,
                imageHeight,
                imageBytes,
                thumbUrl,
                thumbWidth,
                thumbHeight,
                videoHtml,
                videoHtmlWidth,
                videoHtmlHeight,
                footer,
                footerIcon,
                ts,
                mrkdwnIn,
                actions,
                blocks,
                filename,
                size,
                mimetype,
                url,
                metadata
            )
        }

        override fun toString(): String {
            return "Attachment.AttachmentBuilder(msgSubtype=" + this.msgSubtype + ", fallback=" + this.fallback + ", callbackId=" + this.callbackId + ", color=" + this.color + ", pretext=" + this.pretext + ", serviceUrl=" + this.serviceUrl + ", serviceName=" + this.serviceName + ", serviceIcon=" + this.serviceIcon + ", authorName=" + this.authorName + ", authorLink=" + this.authorLink + ", authorIcon=" + this.authorIcon + ", fromUrl=" + this.fromUrl + ", originalUrl=" + this.originalUrl + ", authorSubname=" + this.authorSubname + ", channelId=" + this.channelId + ", channelName=" + this.channelName + ", id=" + this.id + ", botId=" + this.botId + ", indent=" + this.indent + ", msgUnfurl=" + this.msgUnfurl + ", replyUnfurl=" + this.replyUnfurl + ", threadRootUnfurl=" + this.threadRootUnfurl + ", appUnfurl=" + this.appUnfurl + ", appUnfurlUrl=" + this.appUnfurlUrl + ", title=" + this.title + ", titleLink=" + this.titleLink + ", text=" + this.text + ", fields=" + this.fields + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", imageBytes=" + this.imageBytes + ", thumbUrl=" + this.thumbUrl + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", videoHtml=" + this.videoHtml + ", videoHtmlWidth=" + this.videoHtmlWidth + ", videoHtmlHeight=" + this.videoHtmlHeight + ", footer=" + this.footer + ", footerIcon=" + this.footerIcon + ", ts=" + this.ts + ", mrkdwnIn=" + this.mrkdwnIn + ", actions=" + this.actions + ", blocks=" + this.blocks + ", filename=" + this.filename + ", size=" + this.size + ", mimetype=" + this.mimetype + ", url=" + this.url + ", metadata=" + this.metadata + ")"
        }
    }

    companion object {
        fun builder(): AttachmentBuilder {
            return AttachmentBuilder()
        }
    }
}