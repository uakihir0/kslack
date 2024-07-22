package com.github.seratch.jslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsAddRequest internal constructor(
    /**
     * Authentication token. Requires scope: `stars:write`
     */
    override var token: String?,
    /**
     * File to add star to.
     */
    var file: String?,
    /**
     * File comment to add star to.
     */
    var fileComment: String?,
    /**
     * Channel to add star to, or channel where the message to add star to was posted (used with `timestamp`).
     */
    var channel: String?,
    /**
     * Timestamp of the message to add star to.
     */
    var timestamp: String?
) : SlackApiRequest {
    class StarsAddRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var channel: String? = null
        private var timestamp: String? = null

        fun token(token: String?): StarsAddRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): StarsAddRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): StarsAddRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun channel(channel: String?): StarsAddRequestBuilder {
            this.channel = channel
            return this
        }

        fun timestamp(timestamp: String?): StarsAddRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): StarsAddRequest {
            return StarsAddRequest(token, file, fileComment, channel, timestamp)
        }

        override fun toString(): String {
            return "StarsAddRequest.StarsAddRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): StarsAddRequestBuilder {
            return StarsAddRequestBuilder()
        }
    }
}