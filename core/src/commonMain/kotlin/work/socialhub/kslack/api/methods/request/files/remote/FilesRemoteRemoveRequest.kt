package com.github.seratch.jslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesRemoteRemoveRequest internal constructor(
    /**
     * Authentication token. Requires scope: `remote_files:write`
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
    class FilesRemoteRemoveRequestBuilder internal constructor() {
        private var token: String? = null
        private var externalId: String? = null
        private var file: String? = null

        fun token(token: String?): FilesRemoteRemoveRequestBuilder {
            this.token = token
            return this
        }

        fun externalId(externalId: String?): FilesRemoteRemoveRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun file(file: String?): FilesRemoteRemoveRequestBuilder {
            this.file = file
            return this
        }

        fun build(): FilesRemoteRemoveRequest {
            return FilesRemoteRemoveRequest(token, externalId, file)
        }

        override fun toString(): String {
            return "FilesRemoteRemoveRequest.FilesRemoteRemoveRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteRemoveRequestBuilder {
            return FilesRemoteRemoveRequestBuilder()
        }
    }
}