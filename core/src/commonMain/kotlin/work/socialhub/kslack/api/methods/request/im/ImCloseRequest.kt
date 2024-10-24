package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ImCloseRequest(
    /* Authentication token. Requires scope: `im:write` */
    override var token: String?,
    /** Direct message channel to close. */
    var channel: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
        }
    }
}