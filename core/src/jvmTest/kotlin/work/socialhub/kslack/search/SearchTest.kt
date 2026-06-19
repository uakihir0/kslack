package work.socialhub.kslack.search

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import kotlin.test.Test
import kotlin.test.assertTrue

class SearchTest : AbstractTest() {

    @Test
    fun testSearchMessages() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.search().searchMessagesBlocking(
            SearchMessagesRequest(
                token = null,
                query = "test",
                sort = null,
                sortDir = null,
                isHighlight = false,
                count = null,
                page = null
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        println("search query: ${response.query} messages total: ${response.messages?.total}")
    }
}
