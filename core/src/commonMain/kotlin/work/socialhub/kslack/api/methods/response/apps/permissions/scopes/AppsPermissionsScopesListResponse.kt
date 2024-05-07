package com.github.seratch.jslack.api.methods.response.apps.permissions.scopes

import com.github.seratch.jslack.api.methods.SlackApiResponse

class AppsPermissionsScopesListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var scopes: Array<Scope>? = null

    class Scope {
        var appHome: Array<String>? = null
        var team: Array<String>? = null
        var channel: Array<String>? = null
        var group: Array<String>? = null
        var mpim: Array<String>? = null
        var im: Array<String>? = null
        var user: Array<String>? = null
    }
}