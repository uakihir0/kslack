package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import kotlin.js.JsExport

@Deprecated("Use ViewsResource (views.open) for modals instead.")
@JsExport
interface DialogResource {

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    suspend fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    @JsExport.Ignore
    fun dialogOpenBlocking(
        req: DialogOpenRequest
    ): DialogOpenResponse
}
