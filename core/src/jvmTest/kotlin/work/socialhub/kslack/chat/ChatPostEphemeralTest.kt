package work.socialhub.kslack.chat

import work.socialhub.kslack.AbstractTest
import work.socialhub.kslack.SlackFactory
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.chat.ChatPostEphemeralRequest
import work.socialhub.kslack.api.methods.response.chat.ChatPostEphemeralResponse
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ChatPostEphemeralTest : AbstractTest() {

    @Test
    fun postEphemeralMessage() {
        val slack = SlackFactory.instance(userToken!!)

        val authResponse = slack.auth().authTestBlocking(
            AuthTestRequest(token = userToken)
        )
        assertNotNull(authResponse.userId, "userId should not be null from auth.test")
        val currentUserId = authResponse.userId!!

        val configuredChannel = System.getenv("SLACK_TEST_CHANNEL")
            ?: System.getProperty("SLACK_TEST_CHANNEL")
        val channelCandidates = listOfNotNull(configuredChannel, "general").distinct()

        var successfulResponse: ChatPostEphemeralResponse? = null
        val failures = mutableListOf<String>()

        for (channel in channelCandidates) {
            try {
                val response = slack.chat().chatPostEphemeralBlocking(
                    ChatPostEphemeralRequest(
                        token = null,
                        channel = channel,
                        text = "kslack ephemeral test at ${System.currentTimeMillis()}",
                        user = currentUserId,
                        isAsUser = false,
                        blocks = null,
                        blocksAsString = null,
                        attachments = null,
                        attachmentsAsString = null,
                        isLinkNames = false,
                        parse = null,
                    )
                )

                if (response.isOk) {
                    successfulResponse = response
                    println("ephemeral posted to channel=$channel ts=${response.messageTs}")
                    break
                }

                failures += "channel=$channel error=${response.error}"
            } catch (e: Exception) {
                failures += "channel=$channel exception=${e.message}"
            }
        }

        assertNotNull(
            successfulResponse,
            "chat.postEphemeral failed for all candidates=$channelCandidates failures=$failures"
        )

        assertTrue(successfulResponse.isOk)
        assertNotNull(successfulResponse.messageTs)
    }
}
