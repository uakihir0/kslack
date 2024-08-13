package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimListRequest(
    /**
     * Authentication token. Requires scope: `mpim:read`
     */
    override var token: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    var limit: Int?, var getLatest: Boolean?
) : SlackApiRequest {
    class MpimListRequestBuilder() {
        private var token: String? = null
        private var cursor: String? = null
        private var limit: Int? = null
        private var getLatest: Boolean? = null

        fun token(token: String?): MpimListRequestBuilder {
            this.token = token
            return this
        }

        fun cursor(cursor: String?): MpimListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): MpimListRequestBuilder {
            this.limit = limit
            return this
        }

        fun getLatest(getLatest: Boolean?): MpimListRequestBuilder {
            this.getLatest = getLatest
            return this
        }

        fun build(): MpimListRequest {
            return MpimListRequest(token, cursor, limit, getLatest)
        }

        override fun toString(): String {
            return "MpimListRequest.MpimListRequestBuilder(token=" + this.token + ", cursor=" + this.cursor + ", limit=" + this.limit + ", getLatest=" + this.getLatest + ")"
        }
    }

    companion object {
        fun builder(): MpimListRequestBuilder {
            return MpimListRequestBuilder()
        }
    }
}