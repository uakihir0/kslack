package work.socialhub.kslack.admin

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.admin.conversations.AdminConversationsCreateRequest
import work.socialhub.kslack.api.methods.response.admin.conversations.AdminConversationsCreateResponse
import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

@Ignore("Requires admin-level OAuth token (admin.conversations:write)")
class AdminConversationsTest : AbstractTest() {

    @Test
    fun createChannel() {
        val slack = SlackFactory.instance(userToken!!)

        val channelName = "kslack-admin-test-${System.currentTimeMillis()}"
        val response = slack.adminConversations().adminConversationsCreateBlocking(
            AdminConversationsCreateRequest(
                token = null,
                isPrivate = false,
                name = channelName,
                workspaceId = null,
                description = "kslack integration test channel",
                purpose = "Testing admin.conversations.create",
                isOrganizational = null,
            )
        )

        assertNotNull(
            response,
            "admin.conversations.create should not return null"
        )

        println("admin.conversations.create result: ok=${response.isOk} error=${response.error}")
    }
}
