package work.socialhub.kslack.pins

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class PinsListTest : AbstractTest() {

    @Test
    fun testPinsList() {
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

        val channelId = assertNotNull(channels[0].id, "first channel id should not be null")
        println("using channel: $channelId")

        val response = slack.pins().pinsListBlocking(
            PinsListRequest(
                token = null,
                channel = channelId
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        println("pins items count: ${response.items?.size}")
    }
}
