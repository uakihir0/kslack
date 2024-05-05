package com.github.seratch.jslack.api.methods.request.files

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesRevokePublicURLRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * File to revoke
     */
    var file: String?
) : SlackApiRequest {
    class FilesRevokePublicURLRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: String? = null

        fun token(token: String?): FilesRevokePublicURLRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesRevokePublicURLRequestBuilder {
            this.file = file
            return this
        }

        fun build(): FilesRevokePublicURLRequest {
            return FilesRevokePublicURLRequest(token, file)
        }

        override fun toString(): String {
            return "FilesRevokePublicURLRequest.FilesRevokePublicURLRequestBuilder(token=" + this.token + ", file=" + this.file + ")"
        }
    }

    companion object {
        fun builder(): FilesRevokePublicURLRequestBuilder {
            return FilesRevokePublicURLRequestBuilder()
        }
    }
}