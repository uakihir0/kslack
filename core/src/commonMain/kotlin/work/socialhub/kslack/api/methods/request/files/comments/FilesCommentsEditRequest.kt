package com.github.seratch.jslack.api.methods.request.files.comments

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesCommentsEditRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * File containing the comment to edit.
     */
    var file: String?,
    /**
     * The comment to edit.
     */
    var id: String?,
    /**
     * Text of the comment to edit.
     */
    var comment: String?
) : SlackApiRequest {
    class FilesCommentsEditRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null
        private var id: String? = null
        private var comment: String? = null

        fun token(token: String?): FilesCommentsEditRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesCommentsEditRequestBuilder {
            this.file = file
            return this
        }

        fun id(id: String?): FilesCommentsEditRequestBuilder {
            this.id = id
            return this
        }

        fun comment(comment: String?): FilesCommentsEditRequestBuilder {
            this.comment = comment
            return this
        }

        fun build(): FilesCommentsEditRequest {
            return FilesCommentsEditRequest(token, file, id, comment)
        }

        override fun toString(): String {
            return "FilesCommentsEditRequest.FilesCommentsEditRequestBuilder(token=" + this.token + ", file=" + this.file + ", id=" + this.id + ", comment=" + this.comment + ")"
        }
    }

    companion object {
        fun builder(): FilesCommentsEditRequestBuilder {
            return FilesCommentsEditRequestBuilder()
        }
    }
}