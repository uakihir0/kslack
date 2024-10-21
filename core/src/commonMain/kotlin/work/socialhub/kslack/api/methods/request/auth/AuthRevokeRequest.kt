package work.socialhub.kslack.api.methods.request.auth

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class AuthRevokeRequest(
    /** Authentication token. Requires scope: `none` */
    override var token: String?,
    /**
     * Setting this parameter to `1` triggers a _testing mode_
     * where the specified token will not actually be revoked.
     */
    var isTest: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("test", isTest)
        }
    }
}