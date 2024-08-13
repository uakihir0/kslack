package work.socialhub.kslack.api.methods.response.search

import work.socialhub.kslack.api.model.SearchResult

class SearchFilesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var query: String? = null
    var files: SearchResult? = null
}