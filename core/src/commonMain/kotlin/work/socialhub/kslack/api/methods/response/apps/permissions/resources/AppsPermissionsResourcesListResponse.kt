package work.socialhub.kslack.api.methods.response.apps.permissions.resources

import work.socialhub.kslack.api.model.ResponseMetadata

class AppsPermissionsResourcesListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var resources: Array<Resource>? = null
    var responseMetadata: ResponseMetadata? = null

    class Resource {
        var id: String? = null
        var type: String? = null
    }
}