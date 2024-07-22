package com.github.seratch.jslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsAddRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reactions:write`
     */
    override var token: String?,
    /**
     * Reaction (emoji) name.
     */
    var name: String?,
    /**
     * File to add reaction to.
     */
    var file: String?,
    /**
     * File comment to add reaction to.
     */
    var fileComment: String?,
    /**
     * Channel where the message to add reaction to was posted.
     */
    var channel: String?,
    /**
     * Timestamp of the message to add reaction to.
     */
    var timestamp: String?
) : SlackApiRequest {
    class ReactionsAddRequestBuilder internal constructor() {
        private var token: String? = null
        private var name: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var channel: String? = null
        private var timestamp: String? = null

        fun token(token: String?): ReactionsAddRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): ReactionsAddRequestBuilder {
            this.name = name
            return this
        }

        fun file(file: String?): ReactionsAddRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): ReactionsAddRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun channel(channel: String?): ReactionsAddRequestBuilder {
            this.channel = channel
            return this
        }

        fun timestamp(timestamp: String?): ReactionsAddRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): ReactionsAddRequest {
            return ReactionsAddRequest(token, name, file, fileComment, channel, timestamp)
        }

        override fun toString(): String {
            return "ReactionsAddRequest.ReactionsAddRequestBuilder(token=" + this.token + ", name=" + this.name + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): ReactionsAddRequestBuilder {
            return ReactionsAddRequestBuilder()
        }
    }
}