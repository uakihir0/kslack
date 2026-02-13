package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.PinsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.response.pins.PinsAddResponse
import work.socialhub.kslack.api.methods.response.pins.PinsListResponse
import work.socialhub.kslack.api.methods.response.pins.PinsRemoveResponse
import work.socialhub.kslack.util.toBlocking

class PinsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), PinsResource {

    override suspend fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_ADD,
            getToken(req),
        )
    }

    override fun pinsAddBlocking(
        req: PinsAddRequest
    ): PinsAddResponse {
        return toBlocking { pinsAdd(req) }
    }

    override suspend fun pinsList(
        req: PinsListRequest
    ): PinsListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_LIST,
            getToken(req),
        )
    }

    override fun pinsListBlocking(
        req: PinsListRequest
    ): PinsListResponse {
        return toBlocking { pinsList(req) }
    }

    override suspend fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_REMOVE,
            getToken(req),
        )
    }

    override fun pinsRemoveBlocking(
        req: PinsRemoveRequest
    ): PinsRemoveResponse {
        return toBlocking { pinsRemove(req) }
    }
}
