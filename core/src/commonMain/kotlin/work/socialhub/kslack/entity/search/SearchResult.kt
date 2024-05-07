package work.socialhub.kslack.entity.search

import work.socialhub.kslack.entity.Paging

class SearchResult {
    var total: Int? = null
    var pagination: Pagination? = null
    var paging: Paging? = null
    var matches: Array<MatchedItem>? = null
    var refinements: Array<String>? = null // not sure the type yet

    class Pagination {
        var totalCount: Int? = null
        var page: Int? = null
        var perPage: Int? = null
        var pageCount: Int? = null
        var first: Int? = null
        var last: Int? = null
    }
}
