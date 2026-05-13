package work.socialhub.kslack.emoji

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class EmojiListTest : AbstractTest() {

    @Test
    fun testEmojiList() {
        val slack = SlackFactory.instance(userToken!!)
        val response = slack.emoji().emojiListBlocking(
            EmojiListRequest(token = null)
        )
        assertTrue(response.isOk, "error: ${response.error}")
        assertNotNull(response.emoji)
        println("emoji count: ${response.emoji?.size}")
    }
}
