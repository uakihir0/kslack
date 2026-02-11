package work.socialhub.kslack.auth

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import kotlin.test.Test

class AuthTest : AbstractTest() {

    @Test
    fun testGetAuthUrl() {
        val slack = SlackFactory.instance()
        val url = slack.auth().authorizationURL(
            clientId = "test-client-id",
            redirectUri = "https://example.com/callback",
            scope = "channels:read",
        )
        println("Auth URL: $url")
    }
}
