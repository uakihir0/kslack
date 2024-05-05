package com.github.seratch.jslack.api.methods.request.files

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesDeleteRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * ID of file to delete.
     */
    var file: String?
) : SlackApiRequest {
    class FilesDeleteRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null

        fun token(token: String?): FilesDeleteRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesDeleteRequestBuilder {
            this.file = file
            return this
        }

        fun build(): FilesDeleteRequest {
            return FilesDeleteRequest(token, file)
        }

        override fun toString(): String {
            return "FilesDeleteRequest.FilesDeleteRequestBuilder(token=" + this.token + ", file=" + this.file + ")"
        }
    }

    companion object {
        fun builder(): FilesDeleteRequestBuilder {
            return FilesDeleteRequestBuilder()
        }
    }
}