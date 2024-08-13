package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamAccessLogsRequest(
    /**
     * Authentication token. Requires scope: `admin`
     */
    override var token: String?,
    /**
     * End of time range of logs to include in results (inclusive).
     */
    var before: Int?, var count: Int?, var page: Int?
) : SlackApiRequest {
    class TeamAccessLogsRequestBuilder() {
        private var token: String? = null
        private var before: Int? = null
        private var count: Int? = null
        private var page: Int? = null

        fun token(token: String?): TeamAccessLogsRequestBuilder {
            this.token = token
            return this
        }

        fun before(before: Int?): TeamAccessLogsRequestBuilder {
            this.before = before
            return this
        }

        fun count(count: Int?): TeamAccessLogsRequestBuilder {
            this.count = count
            return this
        }

        fun page(page: Int?): TeamAccessLogsRequestBuilder {
            this.page = page
            return this
        }

        fun build(): TeamAccessLogsRequest {
            return TeamAccessLogsRequest(token, before, count, page)
        }

        override fun toString(): String {
            return "TeamAccessLogsRequest.TeamAccessLogsRequestBuilder(token=" + this.token + ", before=" + this.before + ", count=" + this.count + ", page=" + this.page + ")"
        }
    }

    companion object {
        fun builder(): TeamAccessLogsRequestBuilder {
            return TeamAccessLogsRequestBuilder()
        }
    }
}