package work.socialhub.kslack.users

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.users.UsersGetPresenceRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class UsersGetPresenceTest : AbstractTest() {

    @Test
    fun testUsersGetPresence() {
        val slack = SlackFactory.instance(userToken!!)

        val authResponse = slack.auth().authTestBlocking(
            AuthTestRequest(token = userToken)
        )
        assertNotNull(authResponse.userId, "userId should not be null from auth.test")
        val userId = authResponse.userId!!

        val response = slack.users().usersGetPresenceBlocking(
            UsersGetPresenceRequest(
                token = null,
                user = userId
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.presence)
        println("presence: ${response.presence}")
    }
}
