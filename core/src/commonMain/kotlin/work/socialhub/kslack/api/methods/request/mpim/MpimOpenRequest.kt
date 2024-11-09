package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class MpimOpenRequest(
    /** Authentication token. Requires scope: `mpim:write` */
    override var token: String?,

    /**
     * Comma separated lists of users.
     * The ordering of the users is preserved whenever a MPIM group is returned.
     */
    var users: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            if (users != null) {
                it.addParam("users", users!!.joinToString(","))
            }
        }
    }
}