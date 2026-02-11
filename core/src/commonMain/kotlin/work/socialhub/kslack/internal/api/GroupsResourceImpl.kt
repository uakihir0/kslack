package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.GroupsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.groups.*
import work.socialhub.kslack.api.methods.response.groups.*
import work.socialhub.kslack.util.toBlocking

class GroupsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), GroupsResource {

    override suspend fun groupsArchive(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_ARCHIVE,
            getToken(req),
        )
    }

    override fun groupsArchiveBlocking(
        req: GroupsArchiveRequest
    ): GroupsArchiveResponse {
        return toBlocking { groupsArchive(req) }
    }

    override suspend fun groupsCreateChild(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_CREATE_CHILD,
            getToken(req),
        )
    }

    override fun groupsCreateChildBlocking(
        req: GroupsCreateChildRequest
    ): GroupsCreateChildResponse {
        return toBlocking { groupsCreateChild(req) }
    }

    override suspend fun groupsCreate(
        req: GroupsCreateRequest
    ): GroupsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_CREATE,
            getToken(req),
        )
    }

    override fun groupsCreateBlocking(
        req: GroupsCreateRequest
    ): GroupsCreateResponse {
        return toBlocking { groupsCreate(req) }
    }

    override suspend fun groupsHistory(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_HISTORY,
            getToken(req),
        )
    }

    override fun groupsHistoryBlocking(
        req: GroupsHistoryRequest
    ): GroupsHistoryResponse {
        return toBlocking { groupsHistory(req) }
    }

    override suspend fun groupsInfo(
        req: GroupsInfoRequest
    ): GroupsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_INFO,
            getToken(req),
        )
    }

    override fun groupsInfoBlocking(
        req: GroupsInfoRequest
    ): GroupsInfoResponse {
        return toBlocking { groupsInfo(req) }
    }

    override suspend fun groupsInvite(
        req: GroupsInviteRequest
    ): GroupsInviteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_INVITE,
            getToken(req),
        )
    }

    override fun groupsInviteBlocking(
        req: GroupsInviteRequest
    ): GroupsInviteResponse {
        return toBlocking { groupsInvite(req) }
    }

    override suspend fun groupsKick(
        req: GroupsKickRequest
    ): GroupsKickResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_KICK,
            getToken(req),
        )
    }

    override fun groupsKickBlocking(
        req: GroupsKickRequest
    ): GroupsKickResponse {
        return toBlocking { groupsKick(req) }
    }

    override suspend fun groupsLeave(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_LEAVE,
            getToken(req),
        )
    }

    override fun groupsLeaveBlocking(
        req: GroupsLeaveRequest
    ): GroupsLeaveResponse {
        return toBlocking { groupsLeave(req) }
    }

    override suspend fun groupsList(
        req: GroupsListRequest
    ): GroupsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_LIST,
            getToken(req),
        )
    }

    override fun groupsListBlocking(
        req: GroupsListRequest
    ): GroupsListResponse {
        return toBlocking { groupsList(req) }
    }

    override suspend fun groupsMark(
        req: GroupsMarkRequest
    ): GroupsMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_MARK,
            getToken(req),
        )
    }

    override fun groupsMarkBlocking(
        req: GroupsMarkRequest
    ): GroupsMarkResponse {
        return toBlocking { groupsMark(req) }
    }

    override suspend fun groupsOpen(
        req: GroupsOpenRequest
    ): GroupsOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_OPEN,
            getToken(req),
        )
    }

    override fun groupsOpenBlocking(
        req: GroupsOpenRequest
    ): GroupsOpenResponse {
        return toBlocking { groupsOpen(req) }
    }

    override suspend fun groupsRename(
        req: GroupsRenameRequest
    ): GroupsRenameResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_RENAME,
            getToken(req),
        )
    }

    override fun groupsRenameBlocking(
        req: GroupsRenameRequest
    ): GroupsRenameResponse {
        return toBlocking { groupsRename(req) }
    }

    override suspend fun groupsSetPurpose(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_SET_PURPOSE,
            getToken(req),
        )
    }

    override fun groupsSetPurposeBlocking(
        req: GroupsSetPurposeRequest
    ): GroupsSetPurposeResponse {
        return toBlocking { groupsSetPurpose(req) }
    }

    override suspend fun groupsSetTopic(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_SET_TOPIC,
            getToken(req),
        )
    }

    override fun groupsSetTopicBlocking(
        req: GroupsSetTopicRequest
    ): GroupsSetTopicResponse {
        return toBlocking { groupsSetTopic(req) }
    }

    override suspend fun groupsUnarchive(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_UNARCHIVE,
            getToken(req),
        )
    }

    override fun groupsUnarchiveBlocking(
        req: GroupsUnarchiveRequest
    ): GroupsUnarchiveResponse {
        return toBlocking { groupsUnarchive(req) }
    }

    override suspend fun groupsReplies(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.GROUPS_REPLIES,
            getToken(req),
        )
    }

    override fun groupsRepliesBlocking(
        req: GroupsRepliesRequest
    ): GroupsRepliesResponse {
        return toBlocking { groupsReplies(req) }
    }
}
