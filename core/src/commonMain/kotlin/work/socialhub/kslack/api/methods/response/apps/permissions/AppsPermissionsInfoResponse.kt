package com.github.seratch.jslack.api.methods.response.apps.permissions

import work.socialhub.kslack.api.methods.SlackApiResponse

class AppsPermissionsInfoResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var info: Info? = null

    class Info {
        var team: Permissions? = null
        var channel: Permissions? = null
        var group: Permissions? = null
        var mpim: Permissions? = null
        var im: Permissions? = null
        var appHome: Permissions? = null

        class Permissions {
            var scopes: Array<String>? = null
            var resources: Resources? = null

            class Resources {
                var ids: Array<String>? = null
                var isWildcard: Boolean = false
                var excludedIds: Array<String>? = null
            }
        }
    }
}