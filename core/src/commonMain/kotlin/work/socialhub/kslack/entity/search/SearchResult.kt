package work.socialhub.kslack.entity.search

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.Paging
import kotlin.js.JsExport

@JsExport
@Serializable
class SearchResult {
    var total: Int? = null
    var pagination: SearchPagination? = null
    var paging: Paging? = null
    var matches: Array<MatchedItem>? = null
    var refinements: Array<String>? = null // not sure the type yet
}

@JsExport
@Serializable
class SearchPagination {
    var totalCount: Int? = null
    var page: Int? = null
    var perPage: Int? = null
    var pageCount: Int? = null
    var first: Int? = null
    var last: Int? = null
}