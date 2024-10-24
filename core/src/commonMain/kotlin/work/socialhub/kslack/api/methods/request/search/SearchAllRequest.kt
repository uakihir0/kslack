package work.socialhub.kslack.api.methods.request.search

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class SearchAllRequest(
    /** Authentication token. Requires scope: `search:read` */
    override var token: String?,
    /** Search query. May contains booleans, etc. */
    var query: String?,
    /** Return matches sorted by either `score` or `timestamp`. */
    var sort: String?,
    /** Change sort direction to ascending (`asc`) or descending (`desc`). */
    var sortDir: String?,
    /** Pass a value of `true` to enable query highlight markers (see below). */
    var isHighlight: Boolean,
    var count: Int?,
    var page: Int?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("query", query)
            it.addParam("sort", sort)
            it.addParam("sort_dir", sortDir)
            it.addParam("highlight", isHighlight)
            it.addParam("count", count)
            it.addParam("page", page)
        }
    }
}