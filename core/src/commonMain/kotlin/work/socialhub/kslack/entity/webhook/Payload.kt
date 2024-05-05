package com.github.seratch.jslack.api.webhook

import com.github.seratch.jslack.api.model.Attachment
import com.github.seratch.jslack.api.model.block.LayoutBlock

/**
 * https://api.slack.com/incoming-webhooks
 *
 *
 * Implementation of [RTMMessage Payloads](https://api.slack.com/reference/messaging/payload)
 */
class Payload internal constructor(
    /**
     * You can add the thread_ts parameter to your POST request
     * in order to make your message appear as a reply in a thread.
     */
    var threadTs: String?,
    /**
     * The first step is to prepare this message as a key/value pair in JSON.
     * For a simple message, your JSON payload only needs to define a text property, containing the text that will be posted to the channel.
     */
    var text: String?,
    @field
    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     *
     *
     * Incoming webhooks output to a default channel and can only send messages to a single channel at a time.
     * You can override a custom integration's configured channel by specifying the channel field in your JSON payload.
     *
     *
     * Specify a Slack channel by name with "channel": "#other-channel", or send a Slackbot message to a specific user with "channel": "@username".
     */
    :Deprecated("") @set:Deprecated("") @get:Deprecated("") var channel: String?,
    @field
    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     *
     *
     * Incoming webhooks originate from a default identity you configured when originally creating your webhook.
     * You can override a custom integration's configured name with the username field in your JSON payload.
     */
    :Deprecated(
        ""
    ) @set:Deprecated("") @get:Deprecated("") var username: String?,
    @field
    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     *
     *
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    :Deprecated("") @set:Deprecated("") @get:Deprecated("") var iconUrl: String?,
    @field
    /**
     * NOTE: No longer works if your webhook is managed in a Slack app
     *
     *
     * You can also override the bot icon either with icon_url or icon_emoji.
     */
    :Deprecated(
        ""
    ) @set:Deprecated("") @get:Deprecated("") var iconEmoji: String?,
    blocks: List<LayoutBlock>?,
    attachments: List<Attachment>?
) {
    /**
     * An array of [layout blocks][LayoutBlock] in the same format as described in the
     * [layout block guide](https://api.slack.com/messaging/composing/layouts#getting-started).
     */
    private var blocks: List<LayoutBlock>?

    /**
     * An array of legacy secondary attachments. We recommend you use [.blocks] instead.
     */
    private var attachments: List<Attachment>?

    init {
        this.blocks = blocks
        this.attachments = attachments
    }

    fun getBlocks(): List<LayoutBlock>? {
        return this.blocks
    }

    fun getAttachments(): List<Attachment>? {
        return this.attachments
    }

    fun setBlocks(blocks: List<LayoutBlock>?) {
        this.blocks = blocks
    }

    fun setAttachments(attachments: List<Attachment>?) {
        this.attachments = attachments
    }

    class PayloadBuilder internal constructor() {
        private var threadTs: String? = null
        private var text: String? = null
        private var channel: String? = null
        private var username: String? = null
        private var iconUrl: String? = null
        private var iconEmoji: String? = null
        private var blocks: List<LayoutBlock>? = null
        private var attachments: List<Attachment>? = null

        fun threadTs(threadTs: String?): PayloadBuilder {
            this.threadTs = threadTs
            return this
        }

        fun text(text: String?): PayloadBuilder {
            this.text = text
            return this
        }

        @Deprecated("")
        fun channel(channel: String?): PayloadBuilder {
            this.channel = channel
            return this
        }

        @Deprecated("")
        fun username(username: String?): PayloadBuilder {
            this.username = username
            return this
        }

        @Deprecated("")
        fun iconUrl(iconUrl: String?): PayloadBuilder {
            this.iconUrl = iconUrl
            return this
        }

        @Deprecated("")
        fun iconEmoji(iconEmoji: String?): PayloadBuilder {
            this.iconEmoji = iconEmoji
            return this
        }

        fun blocks(blocks: List<LayoutBlock>?): PayloadBuilder {
            this.blocks = blocks
            return this
        }

        fun attachments(attachments: List<Attachment>?): PayloadBuilder {
            this.attachments = attachments
            return this
        }

        fun build(): Payload {
            return Payload(threadTs, text, channel, username, iconUrl, iconEmoji, blocks, attachments)
        }

        override fun toString(): String {
            return "Payload.PayloadBuilder(threadTs=" + this.threadTs + ", text=" + this.text + ", channel=" + this.channel + ", username=" + this.username + ", iconUrl=" + this.iconUrl + ", iconEmoji=" + this.iconEmoji + ", blocks=" + this.blocks + ", attachments=" + this.attachments + ")"
        }
    }

    companion object {
        fun builder(): PayloadBuilder {
            return PayloadBuilder()
        }
    }
}
