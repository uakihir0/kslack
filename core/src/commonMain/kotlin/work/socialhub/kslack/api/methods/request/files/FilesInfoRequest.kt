package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesInfoRequest(
    /**
     * Authentication token. Requires scope: `files:read`
     */
    override var token: String?,
    /**
     * Specify a file by providing its ID.
     */
    var file: String?, var count: Int?, var page: Int?
) : SlackApiRequest {
    class FilesInfoRequestBuilder() {
        private var token: String? = null
        private var file: String? = null
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): FilesInfoRequestBuilder {
            this.token = token
            return this
        }

        fun file(file: String?): FilesInfoRequestBuilder {
            this.file = file
            return this
        }

        fun count(count: Int?): FilesInfoRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): FilesInfoRequestBuilder {
            this.page = page
            return this
        }

        fun build(): FilesInfoRequest {
            return FilesInfoRequest(token, file, count, page)
        }

        override fun toString(): String {
            return "FilesInfoRequest.FilesInfoRequestBuilder(token=" + this.token + ", file=" + this.file + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): FilesInfoRequestBuilder {
            return FilesInfoRequestBuilder()
        }
    }
}