package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ImResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.im.*
import work.socialhub.kslack.api.methods.response.im.*
import work.socialhub.kslack.util.toBlocking

class ImResourceImpl(
    token: String?
) : AbstractResourceImpl(token), ImResource {

    override suspend fun imClose(
        req: ImCloseRequest
    ): ImCloseResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_CLOSE,
            getToken(req),
        )
    }

    override fun imCloseBlocking(
        req: ImCloseRequest
    ): ImCloseResponse {
        return toBlocking { imClose(req) }
    }

    override suspend fun imHistory(
        req: ImHistoryRequest
    ): ImHistoryResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_HISTORY,
            getToken(req),
        )
    }

    override fun imHistoryBlocking(
        req: ImHistoryRequest
    ): ImHistoryResponse {
        return toBlocking { imHistory(req) }
    }

    override suspend fun imList(
        req: ImListRequest
    ): ImListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_LIST,
            getToken(req),
        )
    }

    override fun imListBlocking(
        req: ImListRequest
    ): ImListResponse {
        return toBlocking { imList(req) }
    }

    override suspend fun imMark(
        req: ImMarkRequest
    ): ImMarkResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_MARK,
            getToken(req),
        )
    }

    override fun imMarkBlocking(
        req: ImMarkRequest
    ): ImMarkResponse {
        return toBlocking { imMark(req) }
    }

    override suspend fun imOpen(
        req: ImOpenRequest
    ): ImOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_OPEN,
            getToken(req),
        )
    }

    override fun imOpenBlocking(
        req: ImOpenRequest
    ): ImOpenResponse {
        return toBlocking { imOpen(req) }
    }

    override suspend fun imReplies(
        req: ImRepliesRequest
    ): ImRepliesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.IM_REPLIES,
            getToken(req),
        )
    }

    override fun imRepliesBlocking(
        req: ImRepliesRequest
    ): ImRepliesResponse {
        return toBlocking { imReplies(req) }
    }
}
