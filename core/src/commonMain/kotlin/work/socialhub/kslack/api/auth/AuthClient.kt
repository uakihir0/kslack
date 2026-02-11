package work.socialhub.kslack.api.auth

import io.ktor.http.*
import work.socialhub.kslack.Slack.Companion.AUTHORIZE_URL
import kotlin.js.JsExport

@JsExport
class AuthClient {

    fun authorizationURL(
        clientId: String,
        redirectUri: String,
        scope: String,
    ): String {
        val builder = URLBuilder(AUTHORIZE_URL)
        builder.parameters.append("client_id", "")
        builder.parameters.append("redirect_uri", "")
        builder.parameters.append("scope", "")
        return builder.build().toString()
    }
}