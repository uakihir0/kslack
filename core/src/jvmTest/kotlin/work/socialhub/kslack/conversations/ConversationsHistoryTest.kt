package work.socialhub.kslack.conversations

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.conversations.ConversationsHistoryRequest
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ConversationsHistoryTest : AbstractTest() {

    @Test
    fun testConversationsHistory() {
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
        assertNotNull(listResponse.channels)
        assertTrue(listResponse.channels!!.isNotEmpty())

        val channelId = listResponse.channels!![0].id!!
        println("using channel: $channelId name=${listResponse.channels!![0].name}")

        val response = slack.conversations().conversationsHistoryBlocking(
            ConversationsHistoryRequest(
                token = null,
                channel = channelId,
                cursor = null,
                isInclusive = false,
                latest = null,
                oldest = null,
                limit = 5
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.messages)
        println("messages count: ${response.messages?.size}")
    }
}
