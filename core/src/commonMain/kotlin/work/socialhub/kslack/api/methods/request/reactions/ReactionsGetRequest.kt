package com.github.seratch.jslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsGetRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reactions:read`
     */
    override var token: String?,
    /**
     * File to get reactions for.
     */
    var file: String?,
    /**
     * File comment to get reactions for.
     */
    var fileComment: String?,
    /**
     * Channel where the message to get reactions for was posted.
     */
    var channel: String?,
    /**
     * Timestamp of the message to get reactions for.
     */
    var timestamp: String?,
    /**
     * If true always return the complete reaction list.
     */
    var isFull: Boolean
) : SlackApiRequest {
    class ReactionsGetRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var channel: String? = null
        private var timestamp: String? = null
        private var full = false

        fun token(token: String?): ReactionsGetRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): ReactionsGetRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): ReactionsGetRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun channel(channel: String?): ReactionsGetRequestBuilder {
            this.channel = channel
            return this
        }

        fun timestamp(timestamp: String?): ReactionsGetRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun full(full: Boolean): ReactionsGetRequestBuilder {
            this.full = full
            return this
        }

        fun build(): ReactionsGetRequest {
            return ReactionsGetRequest(token, file, fileComment, channel, timestamp, full)
        }

        override fun toString(): String {
            return "ReactionsGetRequest.ReactionsGetRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ", full=" + this.full + ")"
        }
    }

    companion object {
        fun builder(): ReactionsGetRequestBuilder {
            return ReactionsGetRequestBuilder()
        }
    }
}