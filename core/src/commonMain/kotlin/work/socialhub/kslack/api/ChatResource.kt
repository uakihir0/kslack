package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.chat.*
import work.socialhub.kslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import work.socialhub.kslack.api.methods.response.chat.*
import work.socialhub.kslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse
import kotlin.js.JsExport

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
}
