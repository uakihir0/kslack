package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ChannelsInfoRequest(
    /** Authentication token. Requires scope: `channels:read` */
    override var token: String?,
    /** Set this to `true` to receive the locale for this channel. Defaults to `false` */
    var isIncludeLocale: Boolean,
    /** Channel to get info on */
    var channel: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("include_locale", isIncludeLocale)
        }
    }
}