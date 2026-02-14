package work.socialhub.kslack.auth

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import kotlin.test.Test

class AuthTest : AbstractTest() {

    @Test
    fun testGetAuthUrl() {
        val slack = SlackFactory.instance()
        val url = slack.auth().authorizationURL(
            clientId = clientId!!,
            redirectUri = redirectUri!!,
            userScope = "users:read,channels:read,channels:history,chat:write,files:read,files:write,reactions:read,reactions:write,pins:read,pins:write,team:read,emoji:read,bookmarks:read,bookmarks:write,search:read",
        )
        println("Auth URL: $url")
    }

    @Test
    fun testAuthTest() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.auth().authTestBlocking(
            AuthTestRequest(token = userToken)
        )
        println("ok: ${response.isOk}")
        println("url: ${response.url}")
        println("team: ${response.team}")
        println("user: ${response.user}")
        println("teamId: ${response.teamId}")
        println("userId: ${response.userId}")
    }
}
