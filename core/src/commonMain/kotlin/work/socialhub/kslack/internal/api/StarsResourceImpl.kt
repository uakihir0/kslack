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

@Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
class StarsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), StarsResource {

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_ADD,
            getToken(req),
        )
    }

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override fun starsAddBlocking(
        req: StarsAddRequest
    ): StarsAddResponse {
        return toBlocking { starsAdd(req) }
    }

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_LIST,
            getToken(req),
        )
    }

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override fun starsListBlocking(
        req: StarsListRequest
    ): StarsListResponse {
        return toBlocking { starsList(req) }
    }

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.STARS_REMOVE,
            getToken(req),
        )
    }

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    override fun starsRemoveBlocking(
        req: StarsRemoveRequest
    ): StarsRemoveResponse {
        return toBlocking { starsRemove(req) }
    }
}
