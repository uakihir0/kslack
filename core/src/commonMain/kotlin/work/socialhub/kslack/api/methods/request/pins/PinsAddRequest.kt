package com.github.seratch.jslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsAddRequest internal constructor(
    /**
     * Authentication token. Requires scope: `pins:write`
     */
    override var token: String?,
    /**
     * Channel to pin the item in.
     */
    var channel: String?,
    /**
     * File to pin.
     */
    var file: String?,
    /**
     * File comment to pin.
     */
    var fileComment: String?,
    /**
     * Timestamp of the message to pin.
     */
    var timestamp: String?
) : SlackApiRequest {
    class PinsAddRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var timestamp: String? = null

        fun token(token: String?): PinsAddRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): PinsAddRequestBuilder {
            this.channel = channel
            return this
        }

        fun file(file: String?): PinsAddRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): PinsAddRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun timestamp(timestamp: String?): PinsAddRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): PinsAddRequest {
            return PinsAddRequest(token, channel, file, fileComment, timestamp)
        }

        override fun toString(): String {
            return "PinsAddRequest.PinsAddRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", file=" + this.file + ", fileComment=" + this.fileComment + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): PinsAddRequestBuilder {
            return PinsAddRequestBuilder()
        }
    }
}