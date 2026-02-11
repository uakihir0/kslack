package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import kotlin.js.JsExport

@JsExport
interface DialogResource {

    suspend fun dialogOpen(
        req: DialogOpenRequest
    ): DialogOpenResponse

    @JsExport.Ignore
    fun dialogOpenBlocking(
        req: DialogOpenRequest
    ): DialogOpenResponse
}
