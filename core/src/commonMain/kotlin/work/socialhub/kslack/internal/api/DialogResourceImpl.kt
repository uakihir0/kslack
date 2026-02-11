package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.DialogResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import work.socialhub.kslack.util.toBlocking

@Deprecated("Use ViewsResource (views.open) for modals instead.")
class DialogResourceImpl(
    token: String?
) : AbstractResourceImpl(token), DialogResource {

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    override suspend fun dialogOpen(req: DialogOpenRequest): DialogOpenResponse {
        return postFormWithToken(req.toParams(), Methods.DIALOG_OPEN, getToken(req))
    }

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    override fun dialogOpenBlocking(req: DialogOpenRequest): DialogOpenResponse {
        return toBlocking { dialogOpen(req) }
    }
}
