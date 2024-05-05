package com.github.seratch.jslack.api.methods.request.stars

import com.github.seratch.jslack.api.methods.SlackApiRequest

class StarsRemoveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `stars:write`
     */
    override var token: String?,
    /**
     * File to remove star from.
     */
    var file: String?,
    /**
     * File comment to remove star from.
     */
    var fileComment: String?,
    /**
     * Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`).
     */
    var channel: String?,
    /**
     * Timestamp of the message to remove star from.
     */
    var timestamp: String?
) : SlackApiRequest {
    class StarsRemoveRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var channel: String? = null
        private var timestamp: String? = null

        fun token(token: String?): StarsRemoveRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): StarsRemoveRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): StarsRemoveRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun channel(channel: String?): StarsRemoveRequestBuilder {
            this.channel = channel
            return this
        }

        fun timestamp(timestamp: String?): StarsRemoveRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): StarsRemoveRequest {
            return StarsRemoveRequest(token, file, fileComment, channel, timestamp)
        }

        override fun toString(): String {
            return "StarsRemoveRequest.StarsRemoveRequestBuilder(token=" + this.token + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): StarsRemoveRequestBuilder {
            return StarsRemoveRequestBuilder()
        }
    }
}