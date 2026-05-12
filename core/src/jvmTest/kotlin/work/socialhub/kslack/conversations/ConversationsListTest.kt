package work.socialhub.kslack.conversations

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import work.socialhub.kslack.api.methods.response.conversations.ConversationsListResponse
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ConversationsListTest : AbstractTest() {

    @Test
    fun listChannels() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.conversations().conversationsListBlocking(
            ConversationsListRequest(
                token = null,
                cursor = null,
                isExcludeArchived = true,
                limit = null,
                types = null,
            )
        )

        assertNotNull(
            response,
            "conversations.list should not return null"
        )

        assertTrue(response.isOk, "conversations.list should succeed, error: ${response.error}")
        assertNotNull(response.channels, "channels list should not be null")
        assertTrue(
            response.channels!!.isNotEmpty(),
            "channels list should contain at least one channel"
        )

        val firstChannel = response.channels!![0]
        println("found channel: id=${firstChannel.id} name=${firstChannel.name}")
        assertNotNull(firstChannel.id)
        assertNotNull(firstChannel.name)
    }
}
