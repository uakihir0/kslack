package work.socialhub.kslack.api.methods.request.bookmarks

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class BookmarksRemoveRequest(
    override var token: String?,
    var bookmarkId: String?,
    var channelId: String?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("bookmark_id", bookmarkId)
            it.addParam("channel_id", channelId)
        }
    }
}
