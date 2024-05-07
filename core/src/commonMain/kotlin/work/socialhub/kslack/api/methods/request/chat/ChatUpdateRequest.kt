package com.github.seratch.jslack.api.methods.request.chat

import com.github.seratch.jslack.api.model.Attachment

class ChatUpdateRequest internal constructor(
    /**
     * Authentication token. Requires scope: `chat:write`
     */
    var token: String?,
    /**
     * Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
     */
    var channel: String?,
    /**
     * Timestamp of the message to be updated.
     */
    var ts: String?,
    /**
     * Text of the message to send.
     * See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    var text: String?,
    /**
     * `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
     */
    var user: String?,
    /**
     * Pass true to post the message as the authed bot. Defaults to false.
     */
    var isAsUser: Boolean,
    blocks: Array<LayoutBlock>?,
    blocksAsString: String?,
    attachments: Array<Attachment>?,
    attachmentsAsString: String?,
    linkNames: Boolean,
    parse: String?
) : SlackApiRequest {
    /**
     * A JSON-based array of structured blocks, presented as a URL-encoded string.
     */
    private var blocks: Array<LayoutBlock>?

    /**
     * A JSON-based array of structured blocks as a String, presented as a URL-encoded string.
     */
    var blocksAsString: String?

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    private var attachments: Array<Attachment>?

    /**
     * A JSON-based array of structured attachments, presented as a URL-encoded string.
     */
    var attachmentsAsString: String?

    /**
     * Find and link channel names and usernames.
     */
    var isLinkNames: Boolean

    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    var parse: String?

    init {
        this.blocks = blocks
        this.blocksAsString = blocksAsString
        this.attachments = attachments
        this.attachmentsAsString = attachmentsAsString
        this.isLinkNames = linkNames
        this.parse = parse
    }

    fun getBlocks(): Array<LayoutBlock>? {
        return this.blocks
    }

    fun getAttachments(): Array<Attachment>? {
        return this.attachments
    }

    fun setBlocks(blocks: Array<LayoutBlock>?) {
        this.blocks = blocks
    }

    fun setAttachments(attachments: Array<Attachment>?) {
        this.attachments = attachments
    }

    class ChatUpdateRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var ts: String? = null
        private var text: String? = null
        private var user: String? = null
        private var asUser = false
        private var blocks: Array<LayoutBlock>? = null
        private var blocksAsString: String? = null
        private var attachments: Array<Attachment>? = null
        private var attachmentsAsString: String? = null
        private var linkNames = false
        private var parse: String? = null

        fun token(token: String?): ChatUpdateRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): ChatUpdateRequestBuilder {
            this.channel = channel
            return this
        }

        fun ts(ts: String?): ChatUpdateRequestBuilder {
            this.ts = ts
            return this
        }

        fun text(text: String?): ChatUpdateRequestBuilder {
            this.text = text
            return this
        }

        fun user(user: String?): ChatUpdateRequestBuilder {
            this.user = user
            return this
        }

        fun asUser(asUser: Boolean): ChatUpdateRequestBuilder {
            this.asUser = asUser
            return this
        }

        fun blocks(blocks: Array<LayoutBlock>?): ChatUpdateRequestBuilder {
            this.blocks = blocks
            return this
        }

        fun blocksAsString(blocksAsString: String?): ChatUpdateRequestBuilder {
            this.blocksAsString = blocksAsString
            return this
        }

        fun attachments(attachments: Array<Attachment>?): ChatUpdateRequestBuilder {
            this.attachments = attachments
            return this
        }

        fun attachmentsAsString(attachmentsAsString: String?): ChatUpdateRequestBuilder {
            this.attachmentsAsString = attachmentsAsString
            return this
        }

        fun linkNames(linkNames: Boolean): ChatUpdateRequestBuilder {
            this.linkNames = linkNames
            return this
        }

        fun parse(parse: String?): ChatUpdateRequestBuilder {
            this.parse = parse
            return this
        }

        fun build(): ChatUpdateRequest {
            return ChatUpdateRequest(
                token,
                channel,
                ts,
                text,
                user,
                asUser,
                blocks,
                blocksAsString,
                attachments,
                attachmentsAsString,
                linkNames,
                parse
            )
        }

        override fun toString(): String {
            return "ChatUpdateRequest.ChatUpdateRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", ts=" + this.ts + ", text=" + this.text + ", user=" + this.user + ", asUser=" + this.asUser + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", linkNames=" + this.linkNames + ", parse=" + this.parse + ")"
        }
    }

    companion object {
        fun builder(): ChatUpdateRequestBuilder {
            return ChatUpdateRequestBuilder()
        }
    }
}