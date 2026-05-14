package work.socialhub.kslack.conversations

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import work.socialhub.kslack.api.methods.request.conversations.ConversationsMembersRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ConversationsMembersTest : AbstractTest() {

    @Test
    fun testConversationsMembers() {
        val slack = SlackFactory.instance(userToken!!)

        val listResponse = slack.conversations().conversationsListBlocking(
            ConversationsListRequest(
                token = null,
                cursor = null,
                isExcludeArchived = true,
                limit = null,
                types = null
            )
        )
        assertTrue(listResponse.isOk, "conversations.list failed: ${listResponse.error}")
        val channels = assertNotNull(listResponse.channels, "channels should not be null")
        assertTrue(channels.isNotEmpty(), "channels should not be empty")

        val firstChannel = channels[0]
        val channelId = assertNotNull(firstChannel.id, "first channel id should not be null")
        println("using channel: $channelId name=${firstChannel.name}")

        val response = slack.conversations().conversationsMembersBlocking(
            ConversationsMembersRequest(
                token = null,
                channel = channelId,
                cursor = null,
                limit = 10
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.members)
        assertTrue(response.members!!.isNotEmpty())
        println("members count: ${response.members?.size}")
    }
}
