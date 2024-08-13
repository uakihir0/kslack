package work.socialhub.kslack.api.methods.response.admin.apps

import work.socialhub.kslack.api.model.ResponseMetadata

class AdminAppsRequestsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var appRequests: Array<AppRequest>? = null
    var responseMetadata: ResponseMetadata? = null
}