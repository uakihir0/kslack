package com.github.seratch.jslack.api.methods.response.apps.permissions.resources

import com.github.seratch.jslack.api.model.ResponseMetadata

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