package work.socialhub.kslack.api.methods.request.apps.permissions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class AppsPermissionsInfoRequest(
    /** Authentication token. Requires scope: `none` */
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf()
    }
}