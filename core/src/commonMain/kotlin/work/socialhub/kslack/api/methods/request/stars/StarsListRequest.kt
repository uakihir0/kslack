package com.github.seratch.jslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `stars:read`
     */
    override var token: String?, var count: Int?, var page: Int?
) : SlackApiRequest {
    class StarsListRequestBuilder internal constructor() {
        private var token: String? = null
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): StarsListRequestBuilder {
            this.token = token
            return this
        }

        fun count(count: Int?): StarsListRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): StarsListRequestBuilder {
            this.page = page
            return this
        }

        fun build(): StarsListRequest {
            return StarsListRequest(token, count, page)
        }

        override fun toString(): String {
            return "StarsListRequest.StarsListRequestBuilder(token=" + this.token + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): StarsListRequestBuilder {
            return StarsListRequestBuilder()
        }
    }
}