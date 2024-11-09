package work.socialhub.kslack.api.methods.response.oauth

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.oauth.OAuthBot
import work.socialhub.kslack.entity.oauth.OAuthIncomingWebhook
import kotlin.js.JsExport

@JsExport
@Serializable
class OAuthAccessResponse : SlackApiResponse() {
    var tokenType: String? = null
    var accessToken: String? = null
    var scope: String? = null
    var enterpriseId: String? = null
    var teamName: String? = null
    var teamId: String? = null
    var userId: String? = null
    var incomingWebhook: OAuthIncomingWebhook? = null
    var bot: OAuthBot? = null

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var authorizingUser: OAuthAuthorizingUser? = null

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var installerUser: OAuthInstallerUser? = null

    @get:Deprecated("")
    @set:Deprecated("")
    @Deprecated("") // for workspace apps
    var scopes: OAuthScopes? = null
}


@JsExport
@Serializable
@Deprecated("")
class OAuthAuthorizingUser {
    var userId: String? = null
    var appHome: String? = null
}

@JsExport
@Serializable
@Deprecated("")
class OAuthInstallerUser {
    var userId: String? = null
    var appHome: String? = null
}

@JsExport
@Serializable
@Deprecated("")
class OAuthScopes {
    var appHome: Array<String>? = null
    var team: Array<String>? = null
    var channel: Array<String>? = null
    var group: Array<String>? = null
    var mpim: Array<String>? = null
    var im: Array<String>? = null
    var user: Array<String>? = null
}