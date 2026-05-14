package work.socialhub.kslack.chat

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.chat.ChatGetPermalinkRequest
import work.socialhub.kslack.api.methods.request.chat.ChatPostMessageRequest
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ChatGetPermalinkTest : AbstractTest() {

    @Test
    fun testChatGetPermalink() {
        val token = assertNotNull(userToken, "SLACK_USER_TOKEN must be set for this test")
        val slack = SlackFactory.instance(token)
        val configuredChannelName = System.getenv("SLACK_TEST_CHANNEL")
            ?: System.getProperty("SLACK_TEST_CHANNEL")
        val channelCandidates = listOfNotNull(configuredChannelName, "general").distinct()

        var permalink: String? = null
        val failures = mutableListOf<String>()

        for (channel in channelCandidates) {
            try {
                val postResponse = slack.chat().chatPostMessageBlocking(
                    ChatPostMessageRequest(
                        token = null,
                        username = null,
                        threadTs = null,
                        channel = channel,
                        text = "kslack getPermalink test at ${System.currentTimeMillis()}",
                        parse = null,
                        isLinkNames = false,
                        blocks = null,
                        blocksAsString = null,
                        attachments = null,
                        attachmentsAsString = null,
                        isUnfurlLinks = false,
                        isUnfurlMedia = false,
                        isAsUser = null,
                        isMrkdwn = true,
                        iconUrl = null,
                        iconEmoji = null,
                        isReplyBroadcast = false,
                    )
                )

                if (postResponse.isOk) {
                    val ts = postResponse.ts!!
                    val permalinkResponse = slack.chat().chatGetPermalinkBlocking(
                        ChatGetPermalinkRequest(
                            token = null,
                            channel = postResponse.channel,
                            messageTs = ts
                        )
                    )

                    if (permalinkResponse.isOk) {
                        permalink = permalinkResponse.permalink
                        println("permalink: $permalink")
                        break
                    }

                    failures += "channel=$channel permalinkError=${permalinkResponse.error}"
                } else {
                    failures += "channel=$channel postError=${postResponse.error}"
                }
            } catch (e: Exception) {
                failures += "channel=$channel exception=${e.message}"
            }
        }

        val result = assertNotNull(
            permalink,
            "chat.getPermalink failed for all candidates=$channelCandidates failures=$failures"
        )
        assertTrue(result.startsWith("https://"), "permalink should be a URL: $result")
    }
}
