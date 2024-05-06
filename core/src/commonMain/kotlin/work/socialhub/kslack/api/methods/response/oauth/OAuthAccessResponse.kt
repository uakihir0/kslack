package com.github.seratch.jslack.api.methods.response.oauth

import com.github.seratch.jslack.api.methods.SlackApiResponse

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
        var appHome: List<String>? = null
        var team: List<String>? = null
        var channel: List<String>? = null
        var group: List<String>? = null
        var mpim: List<String>? = null
        var im: List<String>? = null
        var user: List<String>? = null
    }
}
