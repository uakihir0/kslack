package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ChatResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.chat.*
import work.socialhub.kslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import work.socialhub.kslack.api.methods.response.chat.*
import work.socialhub.kslack.api.methods.response.chat.scheduled_messages.ChatScheduleMessagesListResponse
import work.socialhub.kslack.util.toBlocking

class ChatResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    ChatResource {

    override suspend fun chatGetPermalink(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_GET_PERMALINK,
            getToken(req),
        )
    }

    override fun chatGetPermalinkBlocking(
        req: ChatGetPermalinkRequest
    ): ChatGetPermalinkResponse {
        return toBlocking { chatGetPermalink(req) }
    }

    override suspend fun chatDelete(
        req: ChatDeleteRequest
    ): ChatDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_DELETE,
            getToken(req),
        )
    }

    override fun chatDeleteBlocking(
        req: ChatDeleteRequest
    ): ChatDeleteResponse {
        return toBlocking { chatDelete(req) }
    }

    override suspend fun chatDeleteScheduledMessage(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_DELETE_SCHEDULED_MESSAGE,
            getToken(req),
        )
    }

    override fun chatDeleteScheduledMessageBlocking(
        req: ChatDeleteScheduledMessageRequest
    ): ChatDeleteScheduledMessageResponse {
        return toBlocking { chatDeleteScheduledMessage(req) }
    }

    override suspend fun chatMeMessage(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_ME_MESSAGE,
            getToken(req),
        )
    }

    override fun chatMeMessageBlocking(
        req: ChatMeMessageRequest
    ): ChatMeMessageResponse {
        return toBlocking { chatMeMessage(req) }
    }

    override suspend fun chatPostEphemeral(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_POST_EPHEMERAL,
            getToken(req),
        )
    }

    override fun chatPostEphemeralBlocking(
        req: ChatPostEphemeralRequest
    ): ChatPostEphemeralResponse {
        return toBlocking { chatPostEphemeral(req) }
    }

    override suspend fun chatPostMessage(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_POST_MESSAGE,
            getToken(req),
        )
    }

    override fun chatPostMessageBlocking(
        req: ChatPostMessageRequest
    ): ChatPostMessageResponse {
        return toBlocking { chatPostMessage(req) }
    }

    override suspend fun chatScheduleMessage(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_SCHEDULE_MESSAGE,
            getToken(req),
        )
    }

    override fun chatScheduleMessageBlocking(
        req: ChatScheduleMessageRequest
    ): ChatScheduleMessageResponse {
        return toBlocking { chatScheduleMessage(req) }
    }

    override suspend fun chatUpdate(
        req: ChatUpdateRequest
    ): ChatUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_UPDATE,
            getToken(req),
        )
    }

    override fun chatUpdateBlocking(
        req: ChatUpdateRequest
    ): ChatUpdateResponse {
        return toBlocking { chatUpdate(req) }
    }

    override suspend fun chatUnfurl(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_UNFURL,
            getToken(req),
        )
    }

    override fun chatUnfurlBlocking(
        req: ChatUnfurlRequest
    ): ChatUnfurlResponse {
        return toBlocking { chatUnfurl(req) }
    }

    override suspend fun chatScheduleMessagesListMessage(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHAT_SCHEDULED_MESSAGES_LIST,
            getToken(req),
        )
    }

    override fun chatScheduleMessagesListMessageBlocking(
        req: ChatScheduleMessagesListRequest
    ): ChatScheduleMessagesListResponse {
        return toBlocking { chatScheduleMessagesListMessage(req) }
    }
}
