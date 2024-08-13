package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesDeleteRequest(
    /**
     * Authentication token. Requires scope: `files:write:user`
     */
    override var token: String?,
    /**
     * ID of file to delete.
     */
    var file: String?
) : SlackApiRequest {
    class FilesDeleteRequestBuilder() {
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