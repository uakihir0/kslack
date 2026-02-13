package work.socialhub.kslack.api.methods.request.bookmarks

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class BookmarksAddRequest(
    override var token: String?,
    var channelId: String?,
    var title: String?,
    var type: String?,
    var emoji: String? = null,
    var link: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_id", channelId)
            it.addParam("title", title)
            it.addParam("type", type)
            it.addParam("emoji", emoji)
            it.addParam("link", link)
        }
    }
}
