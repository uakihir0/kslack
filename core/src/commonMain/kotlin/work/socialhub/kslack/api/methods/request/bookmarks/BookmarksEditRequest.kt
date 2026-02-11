package work.socialhub.kslack.api.methods.request.bookmarks

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class BookmarksEditRequest(
    override var token: String?,
    var bookmarkId: String?,
    var channelId: String?,
    var emoji: String? = null,
    var link: String? = null,
    var title: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("bookmark_id", bookmarkId)
            it.addParam("channel_id", channelId)
            it.addParam("emoji", emoji)
            it.addParam("link", link)
            it.addParam("title", title)
        }
    }
}
