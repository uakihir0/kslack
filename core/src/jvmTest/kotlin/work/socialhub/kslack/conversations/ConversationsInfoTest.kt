package work.socialhub.kslack.conversations

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.conversations.ConversationsInfoRequest
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ConversationsInfoTest : AbstractTest() {

    @Test
    fun testConversationsInfo() {
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

        val response = slack.conversations().conversationsInfoBlocking(
            ConversationsInfoRequest(
                token = null,
                channel = channelId,
                isIncludeLocale = false,
                isIncludeNumMembers = true
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.channel)
        println("channel: id=${response.channel?.id} name=${response.channel?.name}")
    }
}
