package work.socialhub.kslack.bookmarks

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.bookmarks.BookmarksListRequest
import work.socialhub.kslack.api.methods.request.conversations.ConversationsListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class BookmarksListTest : AbstractTest() {

    @Test
    fun testBookmarksList() {
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
        println("using channel: $channelId")

        val response = slack.bookmarks().bookmarksListBlocking(
            BookmarksListRequest(
                token = null,
                channelId = channelId
            )
        )
        assertTrue(response.isOk, "error: ${response.error}")
        println("bookmarks count: ${response.bookmarks?.size}")
    }
}
