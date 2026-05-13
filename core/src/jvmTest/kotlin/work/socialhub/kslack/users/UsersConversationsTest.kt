package work.socialhub.kslack.users

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.users.UsersConversationsRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class UsersConversationsTest : AbstractTest() {

    @Test
    fun testUsersConversations() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.users().usersConversationsBlocking(
            UsersConversationsRequest(
                token = null,
                user = null,
                cursor = null,
                isExcludeArchived = true,
                limit = 10,
                types = null
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.channels)
        println("conversations count: ${response.channels?.size}")
    }
}
