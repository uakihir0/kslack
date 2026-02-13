package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.CallsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.calls.*
import work.socialhub.kslack.api.methods.request.calls.participants.*
import work.socialhub.kslack.api.methods.response.calls.*
import work.socialhub.kslack.api.methods.response.calls.participants.*
import work.socialhub.kslack.util.toBlocking

class CallsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), CallsResource {

    override suspend fun callsAdd(
        req: CallsAddRequest
    ): CallsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_ADD,
            getToken(req),
        )
    }

    override fun callsAddBlocking(
        req: CallsAddRequest
    ): CallsAddResponse {
        return toBlocking { callsAdd(req) }
    }

    override suspend fun callsEnd(
        req: CallsEndRequest
    ): CallsEndResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_END,
            getToken(req),
        )
    }

    override fun callsEndBlocking(
        req: CallsEndRequest
    ): CallsEndResponse {
        return toBlocking { callsEnd(req) }
    }

    override suspend fun callsInfo(
        req: CallsInfoRequest
    ): CallsInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_INFO,
            getToken(req),
        )
    }

    override fun callsInfoBlocking(
        req: CallsInfoRequest
    ): CallsInfoResponse {
        return toBlocking { callsInfo(req) }
    }

    override suspend fun callsUpdate(
        req: CallsUpdateRequest
    ): CallsUpdateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_UPDATE,
            getToken(req),
        )
    }

    override fun callsUpdateBlocking(
        req: CallsUpdateRequest
    ): CallsUpdateResponse {
        return toBlocking { callsUpdate(req) }
    }

    override suspend fun callsParticipantsAdd(
        req: CallsParticipantsAddRequest
    ): CallsParticipantsAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_PARTICIPANTS_ADD,
            getToken(req),
        )
    }

    override fun callsParticipantsAddBlocking(
        req: CallsParticipantsAddRequest
    ): CallsParticipantsAddResponse {
        return toBlocking { callsParticipantsAdd(req) }
    }

    override suspend fun callsParticipantsRemove(
        req: CallsParticipantsRemoveRequest
    ): CallsParticipantsRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.CALLS_PARTICIPANTS_REMOVE,
            getToken(req),
        )
    }

    override fun callsParticipantsRemoveBlocking(
        req: CallsParticipantsRemoveRequest
    ): CallsParticipantsRemoveResponse {
        return toBlocking { callsParticipantsRemove(req) }
    }
}
