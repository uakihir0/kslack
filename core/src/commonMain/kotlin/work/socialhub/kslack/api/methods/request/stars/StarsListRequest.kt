package work.socialhub.kslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsListRequest(
    /** Authentication token. Requires scope: `stars:read` */
    override var token: String?,
    var count: Int?,
    var page: Int?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("count", count)
            it.addParam("page", page)
        }
    }
}