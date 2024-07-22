package com.github.seratch.jslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reactions:read`
     */
    override var token: String?,
    /**
     * Show reactions made by this user. Defaults to the authed user.
     */
    var user: String?,
    /**
     * If true always return the complete reaction list.
     */
    var isFull: Boolean, var count: Int?, var page: Int?
) : SlackApiRequest {
    class ReactionsListRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null
        private var full = false
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): ReactionsListRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): ReactionsListRequestBuilder {
            this.user = user
            return this
        }

        fun full(full: Boolean): ReactionsListRequestBuilder {
            this.full = full
            return this
        }

        fun count(count: Int?): ReactionsListRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): ReactionsListRequestBuilder {
            this.page = page
            return this
        }

        fun build(): ReactionsListRequest {
            return ReactionsListRequest(token, user, full, count, page)
        }

        override fun toString(): String {
            return "ReactionsListRequest.ReactionsListRequestBuilder(token=" + this.token + ", user=" + this.user + ", full=" + this.full + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): ReactionsListRequestBuilder {
            return ReactionsListRequestBuilder()
        }
    }
}