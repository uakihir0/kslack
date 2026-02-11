package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.MpimResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.mpim.*
import work.socialhub.kslack.api.methods.response.mpim.*
import work.socialhub.kslack.util.toBlocking

class MpimResourceImpl(
    token: String?
) : AbstractResourceImpl(token), MpimResource {

    override suspend fun mpimClose(
        req: MpimCloseRequest
    ): MpimCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_CLOSE,
            getToken(req),
        )
    }

    override fun mpimCloseBlocking(
        req: MpimCloseRequest
    ): MpimCloseResponse {
        return toBlocking { mpimClose(req) }
    }

    override suspend fun mpimHistory(
        req: MpimHistoryRequest
    ): MpimHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_HISTORY,
            getToken(req),
        )
    }

    override fun mpimHistoryBlocking(
        req: MpimHistoryRequest
    ): MpimHistoryResponse {
        return toBlocking { mpimHistory(req) }
    }

    override suspend fun mpimList(
        req: MpimListRequest
    ): MpimListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_LIST,
            getToken(req),
        )
    }

    override fun mpimListBlocking(
        req: MpimListRequest
    ): MpimListResponse {
        return toBlocking { mpimList(req) }
    }

    override suspend fun mpimReplies(
        req: MpimRepliesRequest
    ): MpimRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_REPLIES,
            getToken(req),
        )
    }

    override fun mpimRepliesBlocking(
        req: MpimRepliesRequest
    ): MpimRepliesResponse {
        return toBlocking { mpimReplies(req) }
    }

    override suspend fun mpimMark(
        req: MpimMarkRequest
    ): MpimMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_MARK,
            getToken(req),
        )
    }

    override fun mpimMarkBlocking(
        req: MpimMarkRequest
    ): MpimMarkResponse {
        return toBlocking { mpimMark(req) }
    }

    override suspend fun mpimOpen(
        req: MpimOpenRequest
    ): MpimOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.MPIM_OPEN,
            getToken(req),
        )
    }

    override fun mpimOpenBlocking(
        req: MpimOpenRequest
    ): MpimOpenResponse {
        return toBlocking { mpimOpen(req) }
    }
}
