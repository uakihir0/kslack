package work.socialhub.kslack.api.methods.response.search

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.search.SearchResult
import kotlin.js.JsExport

@JsExport
@Serializable
class SearchAllResponse : SlackApiResponse() {
    var query: String? = null
    var messages: SearchResult? = null
    var files: SearchResult? = null
    var posts: Posts? = null

    class Posts {
        var total: Int? = null
        var matches: Array<String>? = null
    }
}