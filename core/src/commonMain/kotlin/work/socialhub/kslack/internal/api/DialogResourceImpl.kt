package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.DialogResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.response.dialog.DialogOpenResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [DialogResource] for Slack's legacy `dialog.open` API method.
 *
 * Handles HTTP POST requests for opening dialog forms. Dialogs are the legacy
 * approach for form-based interactions in Slack, replaced by Block Kit modals.
 *
 * @deprecated Use [ViewsResourceImpl] with `views.open` instead.
 *
 * @param token Optional default token provided at factory initialization
 */
@Deprecated("Use ViewsResource (views.open) for modals instead.")
class DialogResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), DialogResource {

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    override suspend fun dialogOpen(req: DialogOpenRequest): DialogOpenResponse {
        return postFormWithToken(req.toParams(), Methods.DIALOG_OPEN, getToken(req))
    }

    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    override fun dialogOpenBlocking(req: DialogOpenRequest): DialogOpenResponse {
        return toBlocking { dialogOpen(req) }
    }
}
