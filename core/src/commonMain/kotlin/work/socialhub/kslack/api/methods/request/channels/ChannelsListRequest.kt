package com.github.seratch.jslack.api.methods.request.channels

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ChannelsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `channels:read`
     */
    override var token: String?,
    /**
     * Exclude the `members` collection from each `channel`
     */
    var isExcludeMembers: Boolean,
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
    var limit: Int?,
    /**
     * Exclude archived channels from the list
     */
    var isExcludeArchived: Boolean
) : SlackApiRequest {
    class ChannelsListRequestBuilder internal constructor() {
        private var token: String? = null
        private var excludeMembers = false
        private var cursor: String? = null
        private var limit: Int? = null
        private var excludeArchived = false

        fun token(token: String?): ChannelsListRequestBuilder {
            this.token = token
            return this
        }

        fun excludeMembers(excludeMembers: Boolean): ChannelsListRequestBuilder {
            this.excludeMembers = excludeMembers
            return this
        }

        fun cursor(cursor: String?): ChannelsListRequestBuilder {
            this.cursor = cursor
            return this
        }

        fun limit(limit: Int?): ChannelsListRequestBuilder {
            this.limit = limit
            return this
        }

        fun excludeArchived(excludeArchived: Boolean): ChannelsListRequestBuilder {
            this.excludeArchived = excludeArchived
            return this
        }

        fun build(): ChannelsListRequest {
            return ChannelsListRequest(token, excludeMembers, cursor, limit, excludeArchived)
        }

        override fun toString(): String {
            return "ChannelsListRequest.ChannelsListRequestBuilder(token=" + this.token + ", excludeMembers=" + this.excludeMembers + ", cursor=" + this.cursor + ", limit=" + this.limit + ", excludeArchived=" + this.excludeArchived + ")"
        }
    }

    companion object {
        fun builder(): ChannelsListRequestBuilder {
            return ChannelsListRequestBuilder()
        }
    }
}