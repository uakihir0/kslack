package work.socialhub.kslack.reactions

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import kotlin.test.Test
import kotlin.test.assertTrue

class ReactionsListTest : AbstractTest() {

    @Test
    fun testReactionsList() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.reactions().reactionsListBlocking(
            ReactionsListRequest(
                token = null,
                user = null,
                isFull = false,
                count = null,
                page = null
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        println("reactions items count: ${response.items?.size}")
    }
}
