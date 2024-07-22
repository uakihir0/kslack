package com.github.seratch.jslack.api.methods.request.files.comments

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesCommentsAddRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * File to add a comment to.
     */
    var file: String?,
    /**
     * Text of the comment to add.
     */
    var comment: String?
) : SlackApiRequest {
    class FilesCommentsAddRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var comment: String? = null

        fun token(token: String?): FilesCommentsAddRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesCommentsAddRequestBuilder {
            this.file = file
            return this
        }

        fun comment(comment: String?): FilesCommentsAddRequestBuilder {
            this.comment = comment
            return this
        }

        fun build(): FilesCommentsAddRequest {
            return FilesCommentsAddRequest(token, file, comment)
        }

        override fun toString(): String {
            return "FilesCommentsAddRequest.FilesCommentsAddRequestBuilder(token=" + this.token + ", file=" + this.file + ", comment=" + this.comment + ")"
        }
    }

    companion object {
        fun builder(): FilesCommentsAddRequestBuilder {
            return FilesCommentsAddRequestBuilder()
        }
    }
}