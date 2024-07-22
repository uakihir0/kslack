package com.github.seratch.jslack.api.methods.response.oauth

import work.socialhub.kslack.api.methods.SlackApiResponse

class OAuthAccessResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var tokenType: String? = null
    var accessToken: String? = null
    var scope: String? = null
    var enterpriseId: String? = null
    var teamName: String? = null
    var teamId: String? = null
    var userId: String? = null
    var incomingWebhook: IncomingWebhook? = null
    var bot: Bot? = null

    class IncomingWebhook {
        var url: String? = null
        var channel: String? = null
        var channelId: String? = null
        var configurationUrl: String? = null
    }

    class Bot {
        var botUserId: String? = null
        var botAccessToken: String? = null
    }

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var authorizingUser: AuthorizingUser? = null

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var installerUser: InstallerUser? = null

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var scopes: Scopes? = null

    @Deprecated("")
    class AuthorizingUser {
        var userId: String? = null
        var appHome: String? = null
    }

    @Deprecated("")
    class InstallerUser {
        var userId: String? = null
        var appHome: String? = null
    }

    @Deprecated("")
    class Scopes {
        var appHome: Array<String>? = null
        var team: Array<String>? = null
        var channel: Array<String>? = null
        var group: Array<String>? = null
        var mpim: Array<String>? = null
        var im: Array<String>? = null
        var user: Array<String>? = null
    }
}
