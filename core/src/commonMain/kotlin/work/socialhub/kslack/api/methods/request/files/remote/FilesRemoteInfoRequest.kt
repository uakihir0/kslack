package com.github.seratch.jslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/files.remote.info
 */
class FilesRemoteInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `remote_files:read`
     */
    override var token: String?,
    /**
     * Creator defined GUID for the file.
     */
    var externalId: String?,
    /**
     * Specify a file by providing its ID.
     */
    var file: String?
) : SlackApiRequest {
    class FilesRemoteInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var externalId: String? = null
        private var file: String? = null

        fun token(token: String?): FilesRemoteInfoRequestBuilder {
            this.token = token
            return this
        }

        fun externalId(externalId: String?): FilesRemoteInfoRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun file(file: String?): FilesRemoteInfoRequestBuilder {
            this.file = file
            return this
        }

        fun build(): FilesRemoteInfoRequest {
            return FilesRemoteInfoRequest(token, externalId, file)
        }

        override fun toString(): String {
            return "FilesRemoteInfoRequest.FilesRemoteInfoRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteInfoRequestBuilder {
            return FilesRemoteInfoRequestBuilder()
        }
    }
}