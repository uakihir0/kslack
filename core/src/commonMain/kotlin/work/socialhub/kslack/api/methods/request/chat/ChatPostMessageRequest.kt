package com.github.seratch.jslack.api.methods.request.chat

import com.github.seratch.jslack.api.model.Attachment

/**
 * https://api.slack.com/methods/chat.postMessage
 */
class ChatPostMessageRequest internal constructor(
    /**
     * Authentication token. Requires scope: `chat:write`
     */
    var token: String?,
    /**
     * aSet your bot's user name.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    var username: String?,
    /**
     * Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
     */
    var threadTs: String?,
    /**
     * Channel, private group, or IM channel to send message to.
     * Can be an encoded ID, or a name. See [below](#channels) for more details.
     */
    var channel: String?,
    /**
     * Text of the message to send. See below for an explanation of [formatting](#formatting).
     * This field is usually required, unless you're providing only `attachments` instead.
     */
    var text: String?,
    /**
     * Change how messages are treated. Defaults to `none`. See [below](#formatting).
     */
    var parse: String?,
    /**
     * Find and link channel names and usernames.
     */
    var isLinkNames: Boolean,
    blocks: Array<LayoutBlock>?,
    blocksAsString: String?,
    attachments: Array<Attachment>?,
    attachmentsAsString: String?,
    unfurlLinks: Boolean,
    unfurlMedia: Boolean,
    asUser: Boolean?,
    mrkdwn: Boolean,
    iconUrl: String?,
    iconEmoji: String?,
    replyBroadcast: Boolean
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
     * Pass true to enable unfurling of primarily text-based content.
     */
    var isUnfurlLinks: Boolean

    /**
     * Pass false to disable unfurling of media content.
     */
    var isUnfurlMedia: Boolean

    // NOTE: The default value is intentionally null to support workplace apps.
    // NOTE: The default value is intentionally null to support workplace apps.
    /**
     * Pass true to post the message as the authed user, instead of as a bot.
     * Defaults to false. See [authorship](#authorship) below.
     *
     *
     * NOTE: The default value is intentionally null to support workplace apps.
     */
    var isAsUser: Boolean?

    /**
     * Disable Slack markup parsing by setting to `false`. Enabled by default.
     */
    var isMrkdwn: Boolean = true

    /**
     * URL to an image to use as the icon for this message.
     * Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
     */
    var iconUrl: String?

    /**
     * Emoji to use as the icon for this message. Overrides `icon_url`.
     * Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
     */
    var iconEmoji: String?

    /**
     * Used in conjunction with `thread_ts` and indicates whether reply should be made visible to
     * everyone in the channel or conversation. Defaults to `false`.
     */
    var isReplyBroadcast: Boolean

    init {
        this.blocks = blocks
        this.blocksAsString = blocksAsString
        this.attachments = attachments
        this.attachmentsAsString = attachmentsAsString
        this.isUnfurlLinks = unfurlLinks
        this.isUnfurlMedia = unfurlMedia
        this.isAsUser = asUser
        this.isMrkdwn = mrkdwn
        this.iconUrl = iconUrl
        this.iconEmoji = iconEmoji
        this.isReplyBroadcast = replyBroadcast
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

    class ChatPostMessageRequestBuilder internal constructor() {
        private var token: String? = null
        private var username: String? = null
        private var threadTs: String? = null
        private var channel: String? = null
        private var text: String? = null
        private var parse: String? = null
        private var linkNames = false
        private var blocks: Array<LayoutBlock>? = null
        private var blocksAsString: String? = null
        private var attachments: Array<Attachment>? = null
        private var attachmentsAsString: String? = null
        private var unfurlLinks = false
        private var unfurlMedia = false
        private var asUser: Boolean? = null
        private var mrkdwn = false
        private var iconUrl: String? = null
        private var iconEmoji: String? = null
        private var replyBroadcast = false

        fun token(token: String?): ChatPostMessageRequestBuilder {
            this.token = token
            return this
        }

        fun username(username: String?): ChatPostMessageRequestBuilder {
            this.username = username
            return this
        }

        fun threadTs(threadTs: String?): ChatPostMessageRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun channel(channel: String?): ChatPostMessageRequestBuilder {
            this.channel = channel
            return this
        }

        fun text(text: String?): ChatPostMessageRequestBuilder {
            this.text = text
            return this
        }

        fun parse(parse: String?): ChatPostMessageRequestBuilder {
            this.parse = parse
            return this
        }

        fun linkNames(linkNames: Boolean): ChatPostMessageRequestBuilder {
            this.linkNames = linkNames
            return this
        }

        fun blocks(blocks: Array<LayoutBlock>?): ChatPostMessageRequestBuilder {
            this.blocks = blocks
            return this
        }

        fun blocksAsString(blocksAsString: String?): ChatPostMessageRequestBuilder {
            this.blocksAsString = blocksAsString
            return this
        }

        fun attachments(attachments: Array<Attachment>?): ChatPostMessageRequestBuilder {
            this.attachments = attachments
            return this
        }

        fun attachmentsAsString(attachmentsAsString: String?): ChatPostMessageRequestBuilder {
            this.attachmentsAsString = attachmentsAsString
            return this
        }

        fun unfurlLinks(unfurlLinks: Boolean): ChatPostMessageRequestBuilder {
            this.unfurlLinks = unfurlLinks
            return this
        }

        fun unfurlMedia(unfurlMedia: Boolean): ChatPostMessageRequestBuilder {
            this.unfurlMedia = unfurlMedia
            return this
        }

        fun asUser(asUser: Boolean?): ChatPostMessageRequestBuilder {
            this.asUser = asUser
            return this
        }

        fun mrkdwn(mrkdwn: Boolean): ChatPostMessageRequestBuilder {
            this.mrkdwn = mrkdwn
            return this
        }

        fun iconUrl(iconUrl: String?): ChatPostMessageRequestBuilder {
            this.iconUrl = iconUrl
            return this
        }

        fun iconEmoji(iconEmoji: String?): ChatPostMessageRequestBuilder {
            this.iconEmoji = iconEmoji
            return this
        }

        fun replyBroadcast(replyBroadcast: Boolean): ChatPostMessageRequestBuilder {
            this.replyBroadcast = replyBroadcast
            return this
        }

        fun build(): ChatPostMessageRequest {
            return ChatPostMessageRequest(
                token,
                username,
                threadTs,
                channel,
                text,
                parse,
                linkNames,
                blocks,
                blocksAsString,
                attachments,
                attachmentsAsString,
                unfurlLinks,
                unfurlMedia,
                asUser,
                mrkdwn,
                iconUrl,
                iconEmoji,
                replyBroadcast
            )
        }

        override fun toString(): String {
            return "ChatPostMessageRequest.ChatPostMessageRequestBuilder(token=" + this.token + ", username=" + this.username + ", threadTs=" + this.threadTs + ", channel=" + this.channel + ", text=" + this.text + ", parse=" + this.parse + ", linkNames=" + this.linkNames + ", blocks=" + this.blocks + ", blocksAsString=" + this.blocksAsString + ", attachments=" + this.attachments + ", attachmentsAsString=" + this.attachmentsAsString + ", unfurlLinks=" + this.unfurlLinks + ", unfurlMedia=" + this.unfurlMedia + ", asUser=" + this.asUser + ", mrkdwn=" + this.mrkdwn + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", replyBroadcast=" + this.replyBroadcast + ")"
        }
    }

    companion object {
        fun builder(): ChatPostMessageRequestBuilder {
            return ChatPostMessageRequestBuilder()
        }
    }
}
