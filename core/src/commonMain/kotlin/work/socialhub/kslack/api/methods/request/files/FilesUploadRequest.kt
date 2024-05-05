package com.github.seratch.jslack.api.methods.request.files

import com.github.seratch.jslack.api.methods.SlackApiRequest

class FilesUploadRequest internal constructor(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    file: java.io.File?,
    filestream: java.io.InputStream?,
    content: String?,
    filetype: String?,
    filename: String?,
    title: String?,
    initialComment: String?,
    channels: List<String>?,
    threadTs: String?
) : SlackApiRequest {
    /**
     * File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
     */
    private var file: java.io.File?
    private var filestream: java.io.InputStream?

    /**
     * File contents via a POST variable. If omitting this parameter, you must provide a `file`.
     */
    var content: String?

    /**
     * A [file type](/types/file#file_types) identifier.
     */
    var filetype: String?

    /**
     * Filename of file.
     */
    var filename: String?

    /**
     * Title of file.
     */
    var title: String?

    /**
     * Initial comment to add to file.
     */
    var initialComment: String?

    /**
     * Comma-separated list of channel names or IDs where the file will be shared.
     */
    var channels: List<String>?

    /**
     * Provide another message's ts value to upload this file as a reply. Never use a reply's ts value; use its parent instead.
     */
    var threadTs: String?

    init {
        this.file = file
        this.filestream = filestream
        this.content = content
        this.filetype = filetype
        this.filename = filename
        this.title = title
        this.initialComment = initialComment
        this.channels = channels
        this.threadTs = threadTs
    }

    fun getFile(): java.io.File? {
        return this.file
    }

    fun getFilestream(): java.io.InputStream? {
        return this.filestream
    }

    fun setFile(file: java.io.File?) {
        this.file = file
    }

    fun setFilestream(filestream: java.io.InputStream?) {
        this.filestream = filestream
    }

    class FilesUploadRequestBuilder internal constructor() {
        private var token: String? = null
        private var file: java.io.File? = null
        private var filestream: java.io.InputStream? = null
        private var content: String? = null
        private var filetype: String? = null
        private var filename: String? = null
        private var title: String? = null
        private var initialComment: String? = null
        private var channels: List<String>? = null
        private var threadTs: String? = null

        fun token(token: String?): FilesUploadRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: java.io.File?): FilesUploadRequestBuilder {
            this.file = file
            return this
        }

        fun filestream(filestream: java.io.InputStream?): FilesUploadRequestBuilder {
            this.filestream = filestream
            return this
        }

        fun content(content: String?): FilesUploadRequestBuilder {
            this.content = content
            return this
        }

        fun filetype(filetype: String?): FilesUploadRequestBuilder {
            this.filetype = filetype
            return this
        }

        fun filename(filename: String?): FilesUploadRequestBuilder {
            this.filename = filename
            return this
        }

        fun title(title: String?): FilesUploadRequestBuilder {
            this.title = title
            return this
        }

        fun initialComment(initialComment: String?): FilesUploadRequestBuilder {
            this.initialComment = initialComment
            return this
        }

        fun channels(channels: List<String>?): FilesUploadRequestBuilder {
            this.channels = channels
            return this
        }

        fun threadTs(threadTs: String?): FilesUploadRequestBuilder {
            this.threadTs = threadTs
            return this
        }

        fun build(): FilesUploadRequest {
            return FilesUploadRequest(
                token,
                file,
                filestream,
                content,
                filetype,
                filename,
                title,
                initialComment,
                channels,
                threadTs
            )
        }

        override fun toString(): String {
            return "FilesUploadRequest.FilesUploadRequestBuilder(token=" + this.token + ", file=" + this.file + ", filestream=" + this.filestream + ", content=" + this.content + ", filetype=" + this.filetype + ", filename=" + this.filename + ", title=" + this.title + ", initialComment=" + this.initialComment + ", channels=" + this.channels + ", threadTs=" + this.threadTs + ")"
        }
    }

    companion object {
        fun builder(): FilesUploadRequestBuilder {
            return FilesUploadRequestBuilder()
        }
    }
}