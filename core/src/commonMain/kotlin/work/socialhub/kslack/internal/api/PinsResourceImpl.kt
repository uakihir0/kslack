package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.PinsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsDeleteRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.response.pins.PinsAddResponse
import work.socialhub.kslack.api.methods.response.pins.PinsDeleteResponse
import work.socialhub.kslack.api.methods.response.pins.PinsListResponse
import work.socialhub.kslack.api.methods.response.pins.PinsRemoveResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [PinsResource] for Slack's `pins.*` API methods.
 *
 * Handles HTTP POST requests for managing pinned messages and files within channels.
 * All pin operations are channel-scoped.
 *
 * @param token Optional default token provided at factory initialization
 */
class PinsResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), PinsResource {

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

    override suspend fun pinsDelete(
        req: PinsDeleteRequest
    ): PinsDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.PINS_REMOVE,
            getToken(req),
        )
    }

    override fun pinsDeleteBlocking(
        req: PinsDeleteRequest
    ): PinsDeleteResponse {
        return toBlocking { pinsDelete(req) }
    }
}
