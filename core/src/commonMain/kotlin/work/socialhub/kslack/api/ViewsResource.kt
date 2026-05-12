package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.views.ViewsHomeUpdateRequest
import work.socialhub.kslack.api.methods.request.views.ViewsOpenRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPublishRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPushRequest
import work.socialhub.kslack.api.methods.request.views.ViewsUpdateRequest
import work.socialhub.kslack.api.methods.response.views.ViewsHomeUpdateResponse
import work.socialhub.kslack.api.methods.response.views.ViewsOpenResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPublishResponse
import work.socialhub.kslack.api.methods.response.views.ViewsPushResponse
import work.socialhub.kslack.api.methods.response.views.ViewsUpdateResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `views.*` API methods.
 *
 * Provides methods for managing Block Kit views, which include modals,
 * home tabs, and message attachments. Views are interactive UI compositions
 * built with Slack's Block Kit framework.
 *
 * # View Types
 * - **Modals** - Pop-up dialog windows triggered by actions
 * - **Home tab** - The Home surface in Slack apps
 * - **Message attachments** - Views rendered within messages
 *
 * # Usage Example
 * ```kotlin
 * // Open a modal triggered by a block action
 * val opened = slack.views.open(
 *     ViewsOpenRequest(
 *         triggerId = "trigger_abc123",
 *         view = buildView { /* Block Kit composition */ }
 *     )
 * )
 *
 * // Update the home tab
 * val updated = slack.views.homeUpdate(
 *     ViewsHomeUpdateRequest(
 *         view = buildHomeView { /* Block Kit composition */ }
 *     )
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/views.open">views.open</a>
 * @see <a href="https://docs.slack.dev/reference/methods/views.push">views.push</a>
 * @see <a href="https://docs.slack.dev/reference/methods/views.update">views.update</a>
 * @see <a href="https://docs.slack.dev/reference/methods/views.publish">views.publish</a>
 * @see <a href="https://docs.slack.dev/reference/methods/views.home.update">views.home.update</a>
 */
@JsExport
interface ViewsResource {

    /**
     * Opens a modal for the user who triggered an action.
     *
     * Requires a valid `trigger_id` from a recent block action payload.
     * Modals opened via this method appear as overlays on top of the Slack client.
     *
     * @param req Request containing the trigger ID and view definition
     * @return Response with the view update ID for tracking updates
     * @see <a href="https://docs.slack.dev/reference/methods/views.open">views.open</a>
     */
    suspend fun viewsOpen(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    @JsExport.Ignore
    fun viewsOpenBlocking(
        req: ViewsOpenRequest
    ): ViewsOpenResponse

    suspend fun viewsPush(
        req: ViewsPushRequest
    ): ViewsPushResponse

    @JsExport.Ignore
    fun viewsPushBlocking(
        req: ViewsPushRequest
    ): ViewsPushResponse

    suspend fun viewsUpdate(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    @JsExport.Ignore
    fun viewsUpdateBlocking(
        req: ViewsUpdateRequest
    ): ViewsUpdateResponse

    suspend fun viewsPublish(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    @JsExport.Ignore
    fun viewsPublishBlocking(
        req: ViewsPublishRequest
    ): ViewsPublishResponse

    suspend fun viewsHomeUpdate(
        req: ViewsHomeUpdateRequest
    ): ViewsHomeUpdateResponse

    @JsExport.Ignore
    fun viewsHomeUpdateBlocking(
        req: ViewsHomeUpdateRequest
    ): ViewsHomeUpdateResponse
}
