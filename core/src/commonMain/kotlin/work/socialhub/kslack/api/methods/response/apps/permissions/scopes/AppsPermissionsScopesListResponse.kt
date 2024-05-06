package com.github.seratch.jslack.api.methods.response.apps.permissions.scopes

import com.github.seratch.jslack.api.methods.SlackApiResponse

class AppsPermissionsScopesListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var scopes: List<Scope>? = null

    class Scope {
        var appHome: List<String>? = null
        var team: List<String>? = null
        var channel: List<String>? = null
        var group: List<String>? = null
        var mpim: List<String>? = null
        var im: List<String>? = null
        var user: List<String>? = null
    }
}