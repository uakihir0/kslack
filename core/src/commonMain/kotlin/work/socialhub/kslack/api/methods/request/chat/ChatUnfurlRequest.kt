package com.github.seratch.jslack.api.methods.request.chat

import com.github.seratch.jslack.api.model.Action

/**
 * Provide custom unfurl behavior for user-posted URLs
 */
class ChatUnfurlRequest internal constructor(
    /**
     * Authentication token. Requires scope: `links:write`
     */
    var token: String?,
    /**
     * Provide a simply-formatted string to send as an ephemeral message to the user
     * as invitation to authenticate further and enable full unfurling behavior
     */
    var userAuthMessage: String?,
    /**
     * Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
     */
    var isUserAuthRequired: Boolean,
    /**
     * URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl message attachments.
     */
    var rawUnfurls: String?, var unfurls: Map<String, UnfurlDetail>?,
    /**
     * Timestamp of the message to add unfurl behavior to.
     */
    var ts: String?,
    /**
     * Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling.
     * Value should be properly URL-encoded.
     */
    var userAuthUrl: String?,
    /**
     * Channel ID of the message
     */
    var channel: String?
) : SlackApiRequest {
    // https://api.slack.com/docs/message-link-unfurling#unfurls_parameter
    class UnfurlDetail {
        var title: String? = null
        var text: String? = null
        var callbackId: String? = null
        var attachmentType: String? = null
        var fallback: String? = null
        var actions: List<Action>? = null

        var blocks: List<LayoutBlock>? = null
    }

    class ChatUnfurlRequestBuilder internal constructor() {
        private var token: String? = null
        private var userAuthMessage: String? = null
        private var userAuthRequired = false
        private var rawUnfurls: String? = null
        private var unfurls: Map<String, UnfurlDetail>? = null
        private var ts: String? = null
        private var userAuthUrl: String? = null
        private var channel: String? = null

        fun token(token: String?): ChatUnfurlRequestBuilder {
            this.token = token
            return this
        }

        fun userAuthMessage(userAuthMessage: String?): ChatUnfurlRequestBuilder {
            this.userAuthMessage = userAuthMessage
            return this
        }

        fun userAuthRequired(userAuthRequired: Boolean): ChatUnfurlRequestBuilder {
            this.userAuthRequired = userAuthRequired
            return this
        }

        fun rawUnfurls(rawUnfurls: String?): ChatUnfurlRequestBuilder {
            this.rawUnfurls = rawUnfurls
            return this
        }

        fun unfurls(unfurls: Map<String, UnfurlDetail>?): ChatUnfurlRequestBuilder {
            this.unfurls = unfurls
            return this
        }

        fun ts(ts: String?): ChatUnfurlRequestBuilder {
            this.ts = ts
            return this
        }

        fun userAuthUrl(userAuthUrl: String?): ChatUnfurlRequestBuilder {
            this.userAuthUrl = userAuthUrl
            return this
        }

        fun channel(channel: String?): ChatUnfurlRequestBuilder {
            this.channel = channel
            return this
        }

        fun build(): ChatUnfurlRequest {
            return ChatUnfurlRequest(
                token,
                userAuthMessage,
                userAuthRequired,
                rawUnfurls,
                unfurls,
                ts,
                userAuthUrl,
                channel
            )
        }

        override fun toString(): String {
            return "ChatUnfurlRequest.ChatUnfurlRequestBuilder(token=" + this.token + ", userAuthMessage=" + this.userAuthMessage + ", userAuthRequired=" + this.userAuthRequired + ", rawUnfurls=" + this.rawUnfurls + ", unfurls=" + this.unfurls + ", ts=" + this.ts + ", userAuthUrl=" + this.userAuthUrl + ", channel=" + this.channel + ")"
        }
    }

    companion object {
        fun builder(): ChatUnfurlRequestBuilder {
            return ChatUnfurlRequestBuilder()
        }
    }
}
