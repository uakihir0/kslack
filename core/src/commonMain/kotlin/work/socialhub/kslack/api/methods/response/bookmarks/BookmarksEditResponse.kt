package work.socialhub.kslack.api.methods.response.bookmarks

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Bookmark
import kotlin.js.JsExport

@JsExport
@Serializable
class BookmarksEditResponse : SlackApiResponse() {
    var bookmark: Bookmark? = null
}
