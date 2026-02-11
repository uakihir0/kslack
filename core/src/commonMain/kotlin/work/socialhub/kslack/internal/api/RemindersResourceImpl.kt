package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.RemindersResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.reminders.*
import work.socialhub.kslack.api.methods.response.reminders.*
import work.socialhub.kslack.util.toBlocking

class RemindersResourceImpl(
    token: String?
) : AbstractResourceImpl(token), RemindersResource {

    override suspend fun remindersAdd(req: RemindersAddRequest): RemindersAddResponse {
        return postFormWithToken(req.toParams(), Methods.REMINDERS_ADD, getToken(req))
    }

    override fun remindersAddBlocking(req: RemindersAddRequest): RemindersAddResponse {
        return toBlocking { remindersAdd(req) }
    }

    override suspend fun remindersComplete(req: RemindersCompleteRequest): RemindersCompleteResponse {
        return postFormWithToken(req.toParams(), Methods.REMINDERS_COMPLETE, getToken(req))
    }

    override fun remindersCompleteBlocking(req: RemindersCompleteRequest): RemindersCompleteResponse {
        return toBlocking { remindersComplete(req) }
    }

    override suspend fun remindersDelete(req: RemindersDeleteRequest): RemindersDeleteResponse {
        return postFormWithToken(req.toParams(), Methods.REMINDERS_DELETE, getToken(req))
    }

    override fun remindersDeleteBlocking(req: RemindersDeleteRequest): RemindersDeleteResponse {
        return toBlocking { remindersDelete(req) }
    }

    override suspend fun remindersInfo(req: RemindersInfoRequest): RemindersInfoResponse {
        return postFormWithToken(req.toParams(), Methods.REMINDERS_INFO, getToken(req))
    }

    override fun remindersInfoBlocking(req: RemindersInfoRequest): RemindersInfoResponse {
        return toBlocking { remindersInfo(req) }
    }

    override suspend fun remindersList(req: RemindersListRequest): RemindersListResponse {
        return postFormWithToken(req.toParams(), Methods.REMINDERS_LIST, getToken(req))
    }

    override fun remindersListBlocking(req: RemindersListRequest): RemindersListResponse {
        return toBlocking { remindersList(req) }
    }
}
