package work.socialhub.kslack.api.methods.request.bookmarks

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/bookmarks.delete
 */
@JsExport
class BookmarksDeleteRequest(
    override var token: String?,
    /** The channel ID for the channel. */
    var channelId: String,
    /** The bookmark ID to be deleted. */
    var bookmarkId: String
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("bookmark_id", bookmarkId)
        }
    }
}
