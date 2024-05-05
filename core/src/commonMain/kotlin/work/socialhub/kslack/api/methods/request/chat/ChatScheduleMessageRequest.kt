package com.github.seratch.jslack.api.methods.request.chat

import com.github.seratch.jslack.api.model.Attachment

class ChatScheduleMessageRequest internal constructor(
    /**
     * Authentication token. Requires scope: `chat:write`
     */
    var token: String?,
    /**
     * Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See below for more details.
     */
    var channel: String?,
    /**
     * Unix EPOCH timestamp of time in future to send the message.
     */
    var postAt: Int?,
    /**
     * Text of the message to send. See below for an explanation of formatting.
     * This field is usually required, unless you're providing only attachments instead.
     * Provide no more than 40,000 characters or risk truncation.
     */
    var text: String?,
    /**
     * Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See authorship below.
     */
    var isAsUser: Boolean?,
    attachments: List<Attachment>?,
    attachmentsAsString: String?,
    blocks: List<LayoutBlock>?,
    blocksAsString: String?,
    linkNames: Boolean,
    parse: String?,
    replyBroadcast: Boolean,
    threadTs: String?,
    unfurlLinks: Boolean,
    unfurlMedia: Boolean
) : SlackApiRequest {
    // NOTE: The default value is intentionally null to support workplace apps.
    // NOTE: The default value is intentionally null to support workplace apps.

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private var attachments: List<Attachment>?

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    var attachmentsAsString: String?

    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private var blocks: List<LayoutBlock>?

    /**
     * A JSON-based array of structured blocks as a String, presented as a URL-encoded string.
     */
    var blocksAsString: String?

    /**
     * Find and link channel names and usernames.
     */
    var isLinkNames: Boolean

    /**
     * Change how messages are treated. Defaults to none. See below.
     */
    var parse: String?

    /**
     * Used in conjunction with thread_ts and indicates whether reply should be made visible to everyone
     * in the channel or conversation. Defaults to false.
     */
    var isReplyBroadcast: Boolean

    /**
     * Provide another message's ts value to make this message a reply.
     * Avoid using a reply's ts value; use its parent instead.
     */
    var threadTs: String?

    /**
     * Pass true to enable unfurling of primarily text-based content.
     */
    var isUnfurlLinks: Boolean

    /**
     * Pass false to disable unfurling of media content.
     */
    var isUnfurlMedia: Boolean

    init {
        this.attachments = attachments
        this.attachmentsAsString = attachmentsAsString
        this.blocks = blocks
        this.blocksAsString = blocksAsString
        this.isLinkNames = linkNames
        this.parse = parse
        this.isReplyBroadcast = replyBroadcast
        this.threadTs = threadTs
        this.isUnfurlLinks = unfurlLinks
        this.isUnfurlMedia = unfurlMedia
    }

    fun getAttachments(): List<Attachment>? {
        return this.attachments
    }

    fun getBlocks(): List<LayoutBlock>? {
        return this.blocks
    }

    fun setAttachments(attachments: List<Attachment>?) {
        this.attachments = attachments
    }

    fun setBlocks(blocks: List<LayoutBlock>?) {
        this.blocks = blocks
    }

    class ChatScheduleMessageRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var postAt: Int? = null
        private var text: String? = null
        private var asUser: Boolean? = null
        private var attachments: List<Attachment>? = null
        private var attachmentsAsString: String? = null
        private var blocks: List<LayoutBlock>? = null
        private var blocksAsString: String? = null
        private var linkNames = false
        private var parse: String? = null
        private var replyBroadcast = false
        private var threadTs: String? = null
        private var unfurlLinks = false
        private var unfurlMedia = false

        fun token(token: String?): ChatScheduleMessageRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatScheduleMessageRequestBuilder {
            this.channel = channel
            return this
        }

        fun postAt(postAt: Int?): ChatScheduleMessageRequestBuilder {
            this.postAt = postAt
            return this
        }

        fun text(text: String?): ChatScheduleMessageRequestBuilder {
            this.text = text
            return this
        }

        fun asUser(asUser: Boolean?): ChatScheduleMessageRequestBuilder {
            this.asUser = asUser
            return this
        }

        fun attachments(attachments: List<Attachment>?): ChatScheduleMessageRequestBuilder {
            this.attachments = attachments
            return this
        }

        fun attachmentsAsString(attachmentsAsString: String?): ChatScheduleMessageRequestBuilder {
            this.attachmentsAsString = attachmentsAsString
            return this
        }

        fun blocks(blocks: List<LayoutBlock>?): ChatScheduleMessageRequestBuilder {
            this.blocks = blocks
            return this
        }

        fun blocksAsString(blocksAsString: String?): ChatScheduleMessageRequestBuilder {
            this.blocksAsString = blocksAsString
            return this
        }

        fun linkNames(linkNames: Boolean): ChatScheduleMessageRequestBuilder {
            this.linkNames = linkNames
            return this
        }

        fun parse(parse: String?): ChatScheduleMessageRequestBuilder {
            this.parse = parse
            return this
        }

        fun replyBroadcast(replyBroadcast: Boolean): ChatScheduleMessageRequestBuilder {
            this.replyBroadcast = replyBroadcast
            return this
        }

        fun threadTs(threadTs: String?): ChatScheduleMessageRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun unfurlLinks(unfurlLinks: Boolean): ChatScheduleMessageRequestBuilder {
            this.unfurlLinks = unfurlLinks
            return this
        }

        fun unfurlMedia(unfurlMedia: Boolean): ChatScheduleMessageRequestBuilder {
            this.unfurlMedia = unfurlMedia
            return this
        }

        fun build(): ChatScheduleMessageRequest {
            return ChatScheduleMessageRequest(
                token,
                channel,
                postAt,
                text,
                asUser,
                attachments,
                attachmentsAsString,
                blocks,
                blocksAsString,
                linkNames,
                parse,
                replyBroadcast,
                threadTs,
                unfurlLinks,
                unfurlMedia
            )
        }

        override fun toString(): String {
            return "ChatScheduleMessageRequest.ChatScheduleMessageRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", postAt=" + this.postAt + ", text=" + this.text + ", asUser=" + this.asUser + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ", replyBroadcast=" + this.replyBroadcast + ", threadTs=" + this.threadTs + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ")"
        }
    }

    companion object {
        fun builder(): ChatScheduleMessageRequestBuilder {
            return ChatScheduleMessageRequestBuilder()
        }
    }
}