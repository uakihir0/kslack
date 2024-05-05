package com.github.seratch.jslack.api.methods.request.files.remote

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/files.remote.add
 */
class FilesRemoteAddRequest internal constructor(
    /**
     * Authentication token. Requires scope: `remote_files:write`
     */
    override var token: String?,
    /**
     * Creator defined GUID for the file.
     */
    var externalId: String?,
    /**
     * URL of the remote file.
     */
    var externalUrl: String?,
    /**
     * Title of the file being shared.
     */
    var title: String?,
    /**
     * type of file
     */
    var filetype: String?,
    /**
     * File containing contents that can be used to improve searchability for the remote file.
     */
    var indexableFileContents: ByteArray,
    /**
     * Preview of the document via multipart/form-data.
     */
    var previewImage: ByteArray
) : SlackApiRequest {
    class FilesRemoteAddRequestBuilder internal constructor() {
        private var token: String? = null
        private var externalId: String? = null
        private var externalUrl: String? = null
        private var title: String? = null
        private var filetype: String? = null
        private var indexableFileContents: ByteArray
        private var previewImage: ByteArray

        fun token(token: String?): FilesRemoteAddRequestBuilder {
            this.token = token
            return this
        }

        fun externalId(externalId: String?): FilesRemoteAddRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun externalUrl(externalUrl: String?): FilesRemoteAddRequestBuilder {
            this.externalUrl = externalUrl
            return this
        }

        fun title(title: String?): FilesRemoteAddRequestBuilder {
            this.title = title
            return this
        }

        fun filetype(filetype: String?): FilesRemoteAddRequestBuilder {
            this.filetype = filetype
            return this
        }

        fun indexableFileContents(indexableFileContents: ByteArray): FilesRemoteAddRequestBuilder {
            this.indexableFileContents = indexableFileContents
            return this
        }

        fun previewImage(previewImage: ByteArray): FilesRemoteAddRequestBuilder {
            this.previewImage = previewImage
            return this
        }

        fun build(): FilesRemoteAddRequest {
            return FilesRemoteAddRequest(
                token,
                externalId,
                externalUrl,
                title,
                filetype,
                indexableFileContents,
                previewImage
            )
        }

        override fun toString(): String {
            return "FilesRemoteAddRequest.FilesRemoteAddRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", externalUrl=" + this.externalUrl + ", title=" + this.title + ", filetype=" + this.filetype + ", indexableFileContents=" + indexableFileContents.contentToString() + ", previewImage=" + previewImage.contentToString() + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteAddRequestBuilder {
            return FilesRemoteAddRequestBuilder()
        }
    }
}