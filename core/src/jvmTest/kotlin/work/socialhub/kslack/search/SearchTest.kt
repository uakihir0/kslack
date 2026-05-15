package work.socialhub.kslack.search

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertTrue

class SearchTest : AbstractTest() {

    @Ignore("Slack API returns rich_text blocks in search matches, but LayoutBlock polymorphic serializer doesn't support rich_text yet")
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
