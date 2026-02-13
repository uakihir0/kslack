package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.ReactionsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.reactions.ReactionsAddRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsGetRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsRemoveRequest
import work.socialhub.kslack.api.methods.response.reactions.ReactionsAddResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsGetResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsListResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsRemoveResponse
import work.socialhub.kslack.util.toBlocking

class ReactionsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), ReactionsResource {

    override suspend fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_ADD,
            getToken(req),
        )
    }

    override fun reactionsAddBlocking(
        req: ReactionsAddRequest
    ): ReactionsAddResponse {
        return toBlocking { reactionsAdd(req) }
    }

    override suspend fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_GET,
            getToken(req),
        )
    }

    override fun reactionsGetBlocking(
        req: ReactionsGetRequest
    ): ReactionsGetResponse {
        return toBlocking { reactionsGet(req) }
    }

    override suspend fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_LIST,
            getToken(req),
        )
    }

    override fun reactionsListBlocking(
        req: ReactionsListRequest
    ): ReactionsListResponse {
        return toBlocking { reactionsList(req) }
    }

    override suspend fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.REACTIONS_REMOVE,
            getToken(req),
        )
    }

    override fun reactionsRemoveBlocking(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse {
        return toBlocking { reactionsRemove(req) }
    }
}
