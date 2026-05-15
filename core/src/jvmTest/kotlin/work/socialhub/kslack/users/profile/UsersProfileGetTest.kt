package work.socialhub.kslack.users.profile

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class UsersProfileGetTest : AbstractTest() {

    @Test
    fun testUsersProfileGet() {
        val slack = SlackFactory.instance(userToken!!)

        val authResponse = slack.auth().authTestBlocking(
            AuthTestRequest(token = userToken)
        )
        assertNotNull(authResponse.userId, "userId should not be null from auth.test")
        val userId = authResponse.userId!!

        val response = slack.users().usersProfileGetBlocking(
            UsersProfileGetRequest(
                token = null,
                user = userId,
                isIncludeLabels = false
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.profile)
        println("profile: displayName=${response.profile?.displayName}")
    }
}
