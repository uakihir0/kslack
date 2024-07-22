package com.github.seratch.jslack.api.methods.request.files.comments

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesCommentsDeleteRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * File to delete a comment from.
     */
    var file: String?,
    /**
     * The comment to delete.
     */
    var id: String?
) : SlackApiRequest {
    class FilesCommentsDeleteRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var id: String? = null

        fun token(token: String?): FilesCommentsDeleteRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesCommentsDeleteRequestBuilder {
            this.file = file
            return this
        }

        fun id(id: String?): FilesCommentsDeleteRequestBuilder {
            this.id = id
            return this
        }

        fun build(): FilesCommentsDeleteRequest {
            return FilesCommentsDeleteRequest(token, file, id)
        }

        override fun toString(): String {
            return "FilesCommentsDeleteRequest.FilesCommentsDeleteRequestBuilder(token=" + this.token + ", file=" + this.file + ", id=" + this.id + ")"
        }
    }

    companion object {
        fun builder(): FilesCommentsDeleteRequestBuilder {
            return FilesCommentsDeleteRequestBuilder()
        }
    }
}