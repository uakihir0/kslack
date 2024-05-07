package com.github.seratch.jslack.api.methods.request.files.remote

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesRemoteShareRequest internal constructor(
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
    var file: String?,
    /**
     * Comma-separated list of channel IDs where the file will be shared.
     */
    var channels: Array<String>?
) : SlackApiRequest {
    class FilesRemoteShareRequestBuilder internal constructor() {
        private var token: String? = null
        private var externalId: String? = null
        private var file: String? = null
        private var channels: Array<String>? = null

        fun token(token: String?): FilesRemoteShareRequestBuilder {
            this.token = token
            return this
        }

        fun externalId(externalId: String?): FilesRemoteShareRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun file(file: String?): FilesRemoteShareRequestBuilder {
            this.file = file
            return this
        }

        fun channels(channels: Array<String>?): FilesRemoteShareRequestBuilder {
            this.channels = channels
            return this
        }

        fun build(): FilesRemoteShareRequest {
            return FilesRemoteShareRequest(token, externalId, file, channels)
        }

        override fun toString(): String {
            return "FilesRemoteShareRequest.FilesRemoteShareRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", file=" + this.file + ", channels=" + this.channels + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteShareRequestBuilder {
            return FilesRemoteShareRequestBuilder()
        }
    }
}