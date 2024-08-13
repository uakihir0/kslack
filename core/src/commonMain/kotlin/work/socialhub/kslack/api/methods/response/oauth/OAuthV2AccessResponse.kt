package work.socialhub.kslack.api.methods.response.oauth

import work.socialhub.kslack.api.methods.SlackApiResponse

/**
 * https://api.slack.com/methods/oauth.v2.access
 */
class OAuthV2AccessResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var appId: String? = null
    var authedUser: AuthedUser? = null
    var scope: String? = null
    var tokenType: String? = null // "bot"
    var accessToken: String? = null // xoxb-xxx-yyy
    var botUserId: String? = null
    var team: Team? = null
    var enterprise: Enterprise? = null
    var incomingWebhook: IncomingWebhook? = null

    class AuthedUser {
        var id: String? = null
        var scope: String? = null
        var tokenType: String? = null // "user"
        var accessToken: String? = null // xoxp-xxx-yyy
    }

    class Team {
        var id: String? = null
        var name: String? = null
    }

    class Enterprise {
        var id: String? = null
        var name: String? = null
    }

    class IncomingWebhook {
        var url: String? = null
        var channel: String? = null
        var channelId: String? = null
        var configurationUrl: String? = null
    }
}
