package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.StarsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.response.stars.StarsAddResponse
import work.socialhub.kslack.api.methods.response.stars.StarsListResponse
import work.socialhub.kslack.api.methods.response.stars.StarsRemoveResponse
import work.socialhub.kslack.util.toBlocking

class StarsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), StarsResource {

    override suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_ADD,
            getToken(req),
        )
    }

    override fun starsAddBlocking(
        req: StarsAddRequest
    ): StarsAddResponse {
        return toBlocking { starsAdd(req) }
    }

    override suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_LIST,
            getToken(req),
        )
    }

    override fun starsListBlocking(
        req: StarsListRequest
    ): StarsListResponse {
        return toBlocking { starsList(req) }
    }

    override suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_REMOVE,
            getToken(req),
        )
    }

    override fun starsRemoveBlocking(
        req: StarsRemoveRequest
    ): StarsRemoveResponse {
        return toBlocking { starsRemove(req) }
    }
}
