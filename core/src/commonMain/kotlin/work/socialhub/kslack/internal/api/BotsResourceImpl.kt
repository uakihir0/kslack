package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.BotsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.bots.BotsInfoRequest
import work.socialhub.kslack.api.methods.response.bots.BotsInfoResponse
import work.socialhub.kslack.util.toBlocking

class BotsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), BotsResource {

    override suspend fun botsInfo(req: BotsInfoRequest): BotsInfoResponse {
        return postFormWithToken(req.toParams(), Methods.BOTS_INFO, getToken(req))
    }

    override fun botsInfoBlocking(req: BotsInfoRequest): BotsInfoResponse {
        return toBlocking { botsInfo(req) }
    }
}
