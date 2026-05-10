package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.chat.*
import work.socialhub.kslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import work.socialhub.kslack.api.methods.response.chat.*
import work.socialhub.kslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse
import kotlin.js.JsExport

/**
 * Resource for Chat APIs - sending, updating, and managing messages.
 *
 * Provides the most frequently used Slack API methods:
 * - [chatPostMessage] - Send a message to a channel (supports text, blocks, attachments)
 * - [chatPostEphemeral] - Send an ephemeral message visible only to a specific user
 * - [chatScheduleMessage] - Schedule a message for future delivery
 * - [chatUpdate] - Update a previously sent message
 * - [chatDelete] - Delete a message
 * - [chatDeleteScheduledMessage] - Delete a scheduled message
 * - [chatUnfurl] - Add/unfurl links in a message
 * - [chatGetPermalink] - Get a permanent link to a message
 * - [chatMeMessage] - Send a "me" message (displays as action)
 * - [chatScheduleMessagesList] - List scheduled messages in a channel
 * - [chatStartStream] / [chatAppendStream] / [chatStopStream] - Chat streaming for real-time message chunks
 *
 * @see <a href="https://api.slack.com/methods/chat.postMessage">chat.postMessage</a>
 * @see <a href="https://api.slack.com/methods/chat.delete">chat.delete</a>
 */
@JsExport
interface ChatResource {

    suspend fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse

    @JsExport.Ignore
    fun chatGetPermalinkBlocking(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse

    suspend fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse

    @JsExport.Ignore
    fun chatDeleteBlocking(
        req: ChatDeleteRequest
    ): ChatDeleteResponse

    suspend fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse

    @JsExport.Ignore
    fun chatDeleteScheduledMessageBlocking(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse

    suspend fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse

    @JsExport.Ignore
    fun chatMeMessageBlocking(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse

    suspend fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse

    @JsExport.Ignore
    fun chatPostEphemeralBlocking(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse

    suspend fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse

    @JsExport.Ignore
    fun chatPostMessageBlocking(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse

    suspend fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse

    @JsExport.Ignore
    fun chatScheduleMessageBlocking(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse

    suspend fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse

    @JsExport.Ignore
    fun chatUpdateBlocking(
        req: ChatUpdateRequest
    ): ChatUpdateResponse

    suspend fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse

    @JsExport.Ignore
    fun chatUnfurlBlocking(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse

    suspend fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse

    @JsExport.Ignore
    fun chatScheduleMessagesListMessageBlocking(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse

    suspend fun chatStartStream(
        req: ChatStartStreamRequest
    ): ChatStartStreamResponse

    @JsExport.Ignore
    fun chatStartStreamBlocking(
        req: ChatStartStreamRequest
    ): ChatStartStreamResponse

    suspend fun chatAppendStream(
        req: ChatAppendStreamRequest
    ): ChatAppendStreamResponse

    @JsExport.Ignore
    fun chatAppendStreamBlocking(
        req: ChatAppendStreamRequest
    ): ChatAppendStreamResponse

    suspend fun chatStopStream(
        req: ChatStopStreamRequest
    ): ChatStopStreamResponse

    @JsExport.Ignore
    fun chatStopStreamBlocking(
        req: ChatStopStreamRequest
    ): ChatStopStreamResponse
}
