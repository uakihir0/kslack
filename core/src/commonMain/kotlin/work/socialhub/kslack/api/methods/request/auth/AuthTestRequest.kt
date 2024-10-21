package work.socialhub.kslack.api.methods.request.auth

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class AuthTestRequest(
    /** Authentication token. Requires scope: `none` */
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mapOf()
    }
}