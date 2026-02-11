package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ChannelsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.channels.*
import work.socialhub.kslack.api.methods.response.channels.*
import work.socialhub.kslack.util.toBlocking

class ChannelsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), ChannelsResource {

    override suspend fun channelsArchive(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_ARCHIVE,
            getToken(req),
        )
    }

    override fun channelsArchiveBlocking(
        req: ChannelsArchiveRequest
    ): ChannelsArchiveResponse {
        return toBlocking { channelsArchive(req) }
    }

    override suspend fun channelsCreate(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_CREATE,
            getToken(req),
        )
    }

    override fun channelsCreateBlocking(
        req: ChannelsCreateRequest
    ): ChannelsCreateResponse {
        return toBlocking { channelsCreate(req) }
    }

    override suspend fun channelsHistory(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_HISTORY,
            getToken(req),
        )
    }

    override fun channelsHistoryBlocking(
        req: ChannelsHistoryRequest
    ): ChannelsHistoryResponse {
        return toBlocking { channelsHistory(req) }
    }

    override suspend fun channelsReplies(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_REPLIES,
            getToken(req),
        )
    }

    override fun channelsRepliesBlocking(
        req: ChannelsRepliesRequest
    ): ChannelsRepliesResponse {
        return toBlocking { channelsReplies(req) }
    }

    override suspend fun channelsInfo(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_INFO,
            getToken(req),
        )
    }

    override fun channelsInfoBlocking(
        req: ChannelsInfoRequest
    ): ChannelsInfoResponse {
        return toBlocking { channelsInfo(req) }
    }

    override suspend fun channelsList(
        req: ChannelsListRequest
    ): ChannelsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_LIST,
            getToken(req),
        )
    }

    override fun channelsListBlocking(
        req: ChannelsListRequest
    ): ChannelsListResponse {
        return toBlocking { channelsList(req) }
    }

    override suspend fun channelsInvite(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_INVITE,
            getToken(req),
        )
    }

    override fun channelsInviteBlocking(
        req: ChannelsInviteRequest
    ): ChannelsInviteResponse {
        return toBlocking { channelsInvite(req) }
    }

    override suspend fun channelsJoin(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_JOIN,
            getToken(req),
        )
    }

    override fun channelsJoinBlocking(
        req: ChannelsJoinRequest
    ): ChannelsJoinResponse {
        return toBlocking { channelsJoin(req) }
    }

    override suspend fun channelsKick(
        req: ChannelsKickRequest
    ): ChannelsKickResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_KICK,
            getToken(req),
        )
    }

    override fun channelsKickBlocking(
        req: ChannelsKickRequest
    ): ChannelsKickResponse {
        return toBlocking { channelsKick(req) }
    }

    override suspend fun channelsLeave(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_LEAVE,
            getToken(req),
        )
    }

    override fun channelsLeaveBlocking(
        req: ChannelsLeaveRequest
    ): ChannelsLeaveResponse {
        return toBlocking { channelsLeave(req) }
    }

    override suspend fun channelsMark(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_MARK,
            getToken(req),
        )
    }

    override fun channelsMarkBlocking(
        req: ChannelsMarkRequest
    ): ChannelsMarkResponse {
        return toBlocking { channelsMark(req) }
    }

    override suspend fun channelsRename(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_RENAME,
            getToken(req),
        )
    }

    override fun channelsRenameBlocking(
        req: ChannelsRenameRequest
    ): ChannelsRenameResponse {
        return toBlocking { channelsRename(req) }
    }

    override suspend fun channelsSetPurpose(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_SET_PURPOSE,
            getToken(req),
        )
    }

    override fun channelsSetPurposeBlocking(
        req: ChannelsSetPurposeRequest
    ): ChannelsSetPurposeResponse {
        return toBlocking { channelsSetPurpose(req) }
    }

    override suspend fun channelsSetTopic(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_SET_TOPIC,
            getToken(req),
        )
    }

    override fun channelsSetTopicBlocking(
        req: ChannelsSetTopicRequest
    ): ChannelsSetTopicResponse {
        return toBlocking { channelsSetTopic(req) }
    }

    override suspend fun channelsUnarchive(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CHANNELS_UNARCHIVE,
            getToken(req),
        )
    }

    override fun channelsUnarchiveBlocking(
        req: ChannelsUnarchiveRequest
    ): ChannelsUnarchiveResponse {
        return toBlocking { channelsUnarchive(req) }
    }
}
