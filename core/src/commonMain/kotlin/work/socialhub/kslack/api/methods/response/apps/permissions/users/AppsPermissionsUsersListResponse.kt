package com.github.seratch.jslack.api.methods.response.apps.permissions.users

import com.github.seratch.jslack.api.model.ResponseMetadata

class AppsPermissionsUsersListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var resources: List<Resource>? = null
    var responseMetadata: ResponseMetadata? = null

    class Resource {
        var id: String? = null
        var type: String? = null
        var scopes: List<String>? = null
    }
}