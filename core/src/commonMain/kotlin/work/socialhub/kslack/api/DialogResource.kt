package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's legacy `dialog.open` API method.
 *
 * Opens a dialog form for the user. Dialogs are the legacy way to create
 * form-based interactions in Slack.
 *
 * @deprecated Use [ViewsResource][work.socialhub.kslack.api.ViewsResource] with `views.open`
 * for modals instead. Dialogs are deprecated by Slack and may be removed in the future.
 * Block Kit modals offer more flexible and modern form interactions.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/dialog.open">dialog.open</a>
 */
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
