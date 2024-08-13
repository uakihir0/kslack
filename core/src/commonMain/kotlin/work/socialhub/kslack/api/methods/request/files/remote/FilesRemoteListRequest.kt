package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/files.remote.list
 */
class FilesRemoteListRequest(
    /**
     * Authentication token. Requires scope: `remote_files:read`
     */
    override var token: String?,
    /**
     * Filter files appearing in a specific channel, indicated by its ID.
     */
    var channel: String?,
    /**
     * Paginate through collections of data by setting the cursor parameter to a next_cursor attribute
     * returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection.
     * See pagination for more detail.
     */
    var cursor: String?,
    /**
     * The maximum number of items to return.
     */
    var limit: Int?,
    /**
     * Filter files created after this timestamp (inclusive).
     */
    var tsFrom: String?,
    /**
     * Filter files created before this timestamp (inclusive).
     */
    var tsTo: String?
) : SlackApiRequest {
    class FilesRemoteListRequestBuilder() {
        private var token: String? = null
        private var channel: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var tsFrom: String? = null
        private var tsTo: String? = null

        fun token(token: String?): FilesRemoteListRequestBuilder {
            this.token = token
            return this
        }

        fun channel(channel: String?): FilesRemoteListRequestBuilder {
            this.channel = channel
            return this
        }

        fun cursor(cursor: String?): FilesRemoteListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): FilesRemoteListRequestBuilder {
            this.limit = limit
            return this
        }

        fun tsFrom(tsFrom: String?): FilesRemoteListRequestBuilder {
            this.tsFrom = tsFrom
            return this
        }

        fun tsTo(tsTo: String?): FilesRemoteListRequestBuilder {
            this.tsTo = tsTo
            return this
        }

        fun build(): FilesRemoteListRequest {
            return FilesRemoteListRequest(token, channel, cursor, limit, tsFrom, tsTo)
        }

        override fun toString(): String {
            return "FilesRemoteListRequest.FilesRemoteListRequestBuilder(token=" + this.token + ", channel=" + this.channel + ", cursor=" + this.cursor + ", limit=" + this.limit + ", tsFrom=" + this.tsFrom + ", tsTo=" + this.tsTo + ")"
        }
    }

    companion object {
        fun builder(): FilesRemoteListRequestBuilder {
            return FilesRemoteListRequestBuilder()
        }
    }
}