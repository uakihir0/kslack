package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.DndResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.dnd.*
import work.socialhub.kslack.api.methods.response.dnd.*
import work.socialhub.kslack.util.toBlocking

class DndResourceImpl(
    token: String?
) : AbstractResourceImpl(token), DndResource {

    override suspend fun dndEndDnd(req: DndEndDndRequest): DndEndDndResponse {
        return postFormWithToken(req.toParams(), Methods.DND_END_DND, getToken(req))
    }

    override fun dndEndDndBlocking(req: DndEndDndRequest): DndEndDndResponse {
        return toBlocking { dndEndDnd(req) }
    }

    override suspend fun dndEndSnooze(req: DndEndSnoozeRequest): DndEndSnoozeResponse {
        return postFormWithToken(req.toParams(), Methods.DND_END_SNOOZE, getToken(req))
    }

    override fun dndEndSnoozeBlocking(req: DndEndSnoozeRequest): DndEndSnoozeResponse {
        return toBlocking { dndEndSnooze(req) }
    }

    override suspend fun dndInfo(req: DndInfoRequest): DndInfoResponse {
        return postFormWithToken(req.toParams(), Methods.DND_INFO, getToken(req))
    }

    override fun dndInfoBlocking(req: DndInfoRequest): DndInfoResponse {
        return toBlocking { dndInfo(req) }
    }

    override suspend fun dndSetSnooze(req: DndSetSnoozeRequest): DndSetSnoozeResponse {
        return postFormWithToken(req.toParams(), Methods.DND_SET_SNOOZE, getToken(req))
    }

    override fun dndSetSnoozeBlocking(req: DndSetSnoozeRequest): DndSetSnoozeResponse {
        return toBlocking { dndSetSnooze(req) }
    }

    override suspend fun dndTeamInfo(req: DndTeamInfoRequest): DndTeamInfoResponse {
        return postFormWithToken(req.toParams(), Methods.DND_TEAM_INFO, getToken(req))
    }

    override fun dndTeamInfoBlocking(req: DndTeamInfoRequest): DndTeamInfoResponse {
        return toBlocking { dndTeamInfo(req) }
    }
}
