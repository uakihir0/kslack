package com.github.seratch.jslack.api.methods.request.files

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesSharedPublicURLRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * File to share
     */
    var file: String?
) : SlackApiRequest {
    class FilesSharedPublicURLRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null

        fun token(token: String?): FilesSharedPublicURLRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesSharedPublicURLRequestBuilder {
            this.file = file
            return this
        }

        fun build(): FilesSharedPublicURLRequest {
            return FilesSharedPublicURLRequest(token, file)
        }

        override fun toString(): String {
            return "FilesSharedPublicURLRequest.FilesSharedPublicURLRequestBuilder(token=" + this.token + ", file=" + this.file + ")"
        }
    }

    companion object {
        fun builder(): FilesSharedPublicURLRequestBuilder {
            return FilesSharedPublicURLRequestBuilder()
        }
    }
}