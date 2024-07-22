package com.github.seratch.jslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsRemoveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reactions:write`
     */
    override var token: String?,
    /**
     * Reaction (emoji) name.
     */
    var name: String?,
    /**
     * File to remove reaction from.
     */
    var file: String?,
    /**
     * File comment to remove reaction from.
     */
    var fileComment: String?,
    /**
     * Channel where the message to remove reaction from was posted.
     */
    var channel: String?,
    /**
     * Timestamp of the message to remove reaction from.
     */
    var timestamp: String?
) : SlackApiRequest {
    class ReactionsRemoveRequestBuilder internal constructor() {
        private var token: String? = null
        private var name: String? = null
        private var file: String? = null
        private var fileComment: String? = null
        private var channel: String? = null
        private var timestamp: String? = null

        fun token(token: String?): ReactionsRemoveRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): ReactionsRemoveRequestBuilder {
            this.name = name
            return this
        }

        fun file(file: String?): ReactionsRemoveRequestBuilder {
            this.file = file
            return this
        }

        fun fileComment(fileComment: String?): ReactionsRemoveRequestBuilder {
            this.fileComment = fileComment
            return this
        }

        fun channel(channel: String?): ReactionsRemoveRequestBuilder {
            this.channel = channel
            return this
        }

        fun timestamp(timestamp: String?): ReactionsRemoveRequestBuilder {
            this.timestamp = timestamp
            return this
        }

        fun build(): ReactionsRemoveRequest {
            return ReactionsRemoveRequest(token, name, file, fileComment, channel, timestamp)
        }

        override fun toString(): String {
            return "ReactionsRemoveRequest.ReactionsRemoveRequestBuilder(token=" + this.token + ", name=" + this.name + ", file=" + this.file + ", fileComment=" + this.fileComment + ", channel=" + this.channel + ", timestamp=" + this.timestamp + ")"
        }
    }

    companion object {
        fun builder(): ReactionsRemoveRequestBuilder {
            return ReactionsRemoveRequestBuilder()
        }
    }
}