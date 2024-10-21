package work.socialhub.kslack.api.methods.request.apps.permissions.scopes

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class AppsPermissionsScopesListRequest(
    override var token: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mapOf()
    }
}