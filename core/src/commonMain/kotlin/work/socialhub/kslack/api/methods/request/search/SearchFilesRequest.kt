package work.socialhub.kslack.api.methods.request.search

import work.socialhub.kslack.api.methods.SlackApiRequest

class SearchFilesRequest(
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
    class SearchFilesRequestBuilder() {
        private var token: String? = null
        private var sortDir: String? = null
        private var query: String? = null
        private var sort: String? = null
        private var highlight = false
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): SearchFilesRequestBuilder {
            this.token = token
            return this
        }

        fun sortDir(sortDir: String?): SearchFilesRequestBuilder {
            this.sortDir = sortDir
            return this
        }

        fun query(query: String?): SearchFilesRequestBuilder {
            this.query = query
            return this
        }

        fun sort(sort: String?): SearchFilesRequestBuilder {
            this.sort = sort
            return this
        }

        fun highlight(highlight: Boolean): SearchFilesRequestBuilder {
            this.highlight = highlight
            return this
        }

        fun count(count: Int?): SearchFilesRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): SearchFilesRequestBuilder {
            this.page = page
            return this
        }

        fun build(): SearchFilesRequest {
            return SearchFilesRequest(token, sortDir, query, sort, highlight, count, page)
        }

        override fun toString(): String {
            return "SearchFilesRequest.SearchFilesRequestBuilder(token=" + this.token + ", sortDir=" + this.sortDir + ", query=" + this.query + ", sort=" + this.sort + ", highlight=" + this.highlight + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): SearchFilesRequestBuilder {
            return SearchFilesRequestBuilder()
        }
    }
}