package work.socialhub.kslack.users

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.users.UsersInfoRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class UsersInfoTest : AbstractTest() {

    @Test
    fun testUsersInfo() {
        val slack = SlackFactory.instance(userToken!!)

        val authResponse = slack.auth().authTestBlocking(
            AuthTestRequest(token = userToken)
        )
        assertNotNull(authResponse.userId, "userId should not be null from auth.test")
        val userId = authResponse.userId!!

        val response = slack.users().usersInfoBlocking(
            UsersInfoRequest(
                token = null,
                user = userId,
                isIncludeLocale = false
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.user)
        println("user: id=${response.user?.id} name=${response.user?.name}")
    }
}
