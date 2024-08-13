package work.socialhub.kslack.api.methods.request.search

import work.socialhub.kslack.api.methods.SlackApiRequest

class SearchAllRequest(
    /**
     * Authentication token. Requires scope: `search:read`
     */
    override var token: String?,
    /**
     * Search query. May contains booleans, etc.
     */
    var query: String?,
    /**
     * Return matches sorted by either `score` or `timestamp`.
     */
    var sort: String?,
    /**
     * Change sort direction to ascending (`asc`) or descending (`desc`).
     */
    var sortDir: String?,
    /**
     * Pass a value of `true` to enable query highlight markers (see below).
     */
    var isHighlight: Boolean, var count: Int?, var page: Int?
) : SlackApiRequest {
    class SearchAllRequestBuilder() {
        private var token: String? = null
        private var query: String? = null
        private var sort: String? = null
        private var sortDir: String? = null
        private var highlight = false
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): SearchAllRequestBuilder {
            this.token = token
            return this
        }

        fun query(query: String?): SearchAllRequestBuilder {
            this.query = query
            return this
        }

        fun sort(sort: String?): SearchAllRequestBuilder {
            this.sort = sort
            return this
        }

        fun sortDir(sortDir: String?): SearchAllRequestBuilder {
            this.sortDir = sortDir
            return this
        }

        fun highlight(highlight: Boolean): SearchAllRequestBuilder {
            this.highlight = highlight
            return this
        }

        fun count(count: Int?): SearchAllRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): SearchAllRequestBuilder {
            this.page = page
            return this
        }

        fun build(): SearchAllRequest {
            return SearchAllRequest(token, query, sort, sortDir, highlight, count, page)
        }

        override fun toString(): String {
            return "SearchAllRequest.SearchAllRequestBuilder(token=" + this.token + ", query=" + this.query + ", sort=" + this.sort + ", sortDir=" + this.sortDir + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): SearchAllRequestBuilder {
            return SearchAllRequestBuilder()
        }
    }
}