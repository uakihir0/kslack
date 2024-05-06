package com.github.seratch.jslack.api.methods.response.oauth

import com.github.seratch.jslack.api.methods.SlackApiResponse

class OAuthTokenResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var accessToken: String? = null
    var scope: String? = null
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
}
