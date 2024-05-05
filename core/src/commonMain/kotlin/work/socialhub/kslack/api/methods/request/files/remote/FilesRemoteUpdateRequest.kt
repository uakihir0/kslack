package com.github.seratch.jslack.api.methods.request.files.remote

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesRemoteUpdateRequest internal constructor(
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
    class FilesRemoteUpdateRequestBuilder internal constructor() {
        private var token: String? = null
        private var externalId: String? = null
        private var externalUrl: String? = null
        private var title: String? = null
        private var filetype: String? = null
        private var indexableFileContents: ByteArray
        private var previewImage: ByteArray

        fun token(token: String?): FilesRemoteUpdateRequestBuilder {
            this.token = token
            return this
        }

        fun externalId(externalId: String?): FilesRemoteUpdateRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun externalUrl(externalUrl: String?): FilesRemoteUpdateRequestBuilder {
            this.externalUrl = externalUrl
            return this
        }

        fun title(title: String?): FilesRemoteUpdateRequestBuilder {
            this.title = title
            return this
        }

        fun filetype(filetype: String?): FilesRemoteUpdateRequestBuilder {
            this.filetype = filetype
            return this
        }

        fun indexableFileContents(indexableFileContents: ByteArray): FilesRemoteUpdateRequestBuilder {
            this.indexableFileContents = indexableFileContents
            return this
        }

        fun previewImage(previewImage: ByteArray): FilesRemoteUpdateRequestBuilder {
            this.previewImage = previewImage
            return this
        }

        fun build(): FilesRemoteUpdateRequest {
            return FilesRemoteUpdateRequest(
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
            return "FilesRemoteUpdateRequest.FilesRemoteUpdateRequestBuilder(token=" + this.token + ", externalId=" + this.externalId + ", externalUrl=" + this.externalUrl + ", title=" + this.title + ", filetype=" + this.filetype + ", indexableFileContents=" + indexableFileContents.contentToString() + ", previewImage=" + previewImage.contentToString() + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteUpdateRequestBuilder {
            return FilesRemoteUpdateRequestBuilder()
        }
    }
}