package work.socialhub.kslack.users

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.users.UsersListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class UsersListTest : AbstractTest() {

    @Test
    fun testUsersList() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.users().usersListBlocking(
            UsersListRequest(
                token = null,
                cursor = null,
                limit = 10,
                isIncludeLocale = false,
                isPresence = false
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.members)
        assertTrue(response.members!!.isNotEmpty())
        println("users count: ${response.members?.size}")
    }
}
