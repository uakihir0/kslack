package work.socialhub.kslack.chat

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.chat.ChatPostMessageRequest
import work.socialhub.kslack.api.methods.response.chat.ChatPostMessageResponse
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ChatPostMessageTest : AbstractTest() {

    @Test
    fun postMessageToGeneralChannel() {
        val slack = SlackFactory.instance(userToken!!)
        val configuredChannelName = System.getenv("SLACK_TEST_CHANNEL")
            ?: System.getProperty("SLACK_TEST_CHANNEL")
        val channelCandidates = listOfNotNull(configuredChannelName, "general", "geenral").distinct()

        var successfulResponse: ChatPostMessageResponse? = null
        val failures = mutableListOf<String>()

        for (channel in channelCandidates) {
            try {
                val response = slack.chat().chatPostMessageBlocking(
                    ChatPostMessageRequest(
                        token = null,
                        username = null,
                        threadTs = null,
                        channel = channel,
                        text = "kslack test message at ${System.currentTimeMillis()}",
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

                if (response.isOk) {
                    successfulResponse = response
                    println("posted to channel=$channel ts=${response.ts}")
                    break
                }

                failures += "channel=$channel error=${response.error}"
            } catch (e: Exception) {
                failures += "channel=$channel exception=${e.message}"
            }
        }

        assertNotNull(
            successfulResponse,
            "chat.postMessage failed for all candidates=$channelCandidates failures=$failures"
        )

        assertTrue(successfulResponse.isOk)
        assertNotNull(successfulResponse.channel)
        assertNotNull(successfulResponse.ts)
    }
}
