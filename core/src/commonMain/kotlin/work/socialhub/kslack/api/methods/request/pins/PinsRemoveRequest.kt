package com.github.seratch.jslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsRemoveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `pins:write`
     */
    override var token: String?,
    /**
     * Channel where the item is pinned to.
     */
    var channel: String?,
    /**
     * File to un-pin.
     */
    var file: String?,
    /**
     * File comment to un-pin.
     */
    var fileComment: String?,
    /**
     * Timestamp of the message to un-pin.
     */
    var timestamp: String?
) : SlackApiRequest {
    class PinsRemoveRequestBuilder internal constructor() {
        private var token: String? = null
        private var channel: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var timestamp: String? = null

        fun token(token: String?): PinsRemoveRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): PinsRemoveRequestBuilder {
            this.channel = channel
            return this
        }

        fun file(file: String?): PinsRemoveRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): PinsRemoveRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun timestamp(timestamp: String?): PinsRemoveRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): PinsRemoveRequest {
            return PinsRemoveRequest(token, channel, file, fileComment, timestamp)
        }

        override fun toString(): String {
            return "PinsRemoveRequest.PinsRemoveRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", file=" + this.file + ", fileComment=" + this.fileComment + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): PinsRemoveRequestBuilder {
            return PinsRemoveRequestBuilder()
        }
    }
}