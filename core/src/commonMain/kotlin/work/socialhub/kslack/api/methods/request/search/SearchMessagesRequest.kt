package com.github.seratch.jslack.api.methods.request.search

import com.github.seratch.jslack.api.methods.SlackApiRequest

class SearchMessagesRequest internal constructor(
    /**
     * Authentication token. Requires scope: `search:read`
     */
    override var token: String?,
    /**
     * Change sort direction to ascending (`asc`) or descending (`desc`).
     */
    var sortDir: String?,
    /**
     * Search query. May contain booleans, etc.
     */
    var query: String?,
    /**
     * Return matches sorted by either `score` or `timestamp`.
     */
    var sort: String?,
    /**
     * Pass a value of `true` to enable query highlight markers (see below).
     */
    var isHighlight: Boolean, var count: Int?, var page: Int?
) : SlackApiRequest {
    class SearchMessagesRequestBuilder internal constructor() {
        private var token: String? = null
        private var sortDir: String? = null
        private var query: String? = null
        private var sort: String? = null
        private var highlight = false
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): SearchMessagesRequestBuilder {
            this.token = token
            return this
        }

        fun sortDir(sortDir: String?): SearchMessagesRequestBuilder {
            this.sortDir = sortDir
            return this
        }

        fun query(query: String?): SearchMessagesRequestBuilder {
            this.query = query
            return this
        }

        fun sort(sort: String?): SearchMessagesRequestBuilder {
            this.sort = sort
            return this
        }

        fun highlight(highlight: Boolean): SearchMessagesRequestBuilder {
            this.highlight = highlight
            return this
        }

        fun count(count: Int?): SearchMessagesRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): SearchMessagesRequestBuilder {
            this.page = page
            return this
        }

        fun build(): SearchMessagesRequest {
            return SearchMessagesRequest(token, sortDir, query, sort, highlight, count, page)
        }

        override fun toString(): String {
            return "SearchMessagesRequest.SearchMessagesRequestBuilder(token=" + this.token + ", sortDir=" + this.sortDir + ", query=" + this.query + ", sort=" + this.sort + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): SearchMessagesRequestBuilder {
            return SearchMessagesRequestBuilder()
        }
    }
}