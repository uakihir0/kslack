package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.dnd.*
import work.socialhub.kslack.api.methods.response.dnd.*
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `dnd.*` API methods.
 *
 * Provides methods for managing Do Not Disturb (DND) settings.
 * Users can set snooze modes and check DND status for themselves or
 * other users in the workspace.
 *
 * # DND Modes
 * - **Snooze** - User-defined duration (e.g., "until 9am")
 * - **Team-set** - Admin-configured DND schedule
 * - **None** - No DND active
 *
 * # Usage Example
 * ```kotlin
 * // End current DND snooze
 * slack.dnd.endSnooze(DndEndSnoozeRequest())
 *
 * // Set a 30-minute snooze
 * slack.dnd.setSnooze(
 *     DndSetSnoozeRequest(numMinutes = 30)
 * )
 *
 * // Get user's DND status
 * val status = slack.dnd.info(
 *     DndInfoRequest(user = "U012AB3CD")
 * )
 *
 * // Get team-wide DND schedule
 * val team = slack.dnd.teamInfo(
 *     DndTeamInfoRequest()
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/dnd.endDnd">dnd.endDnd</a>
 * @see <a href="https://docs.slack.dev/reference/methods/dnd.endSnooze">dnd.endSnooze</a>
 * @see <a href="https://docs.slack.dev/reference/methods/dnd.info">dnd.info</a>
 */
@JsExport
interface DndResource {

    /**
     * Ends the current DND session entirely.
     *
     * This disables DND immediately for the authenticated user.
     * The user can receive messages without DND restrictions.
     *
     * @param req Request (no parameters required)
     * @return Response with updated DND status
     * @see <a href="https://docs.slack.dev/reference/methods/dnd.endDnd">dnd.endDnd</a>
     */
    suspend fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse

    @JsExport.Ignore
    fun dndEndDndBlocking(
        req: DndEndDndRequest
    ): DndEndDndResponse

    suspend fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    @JsExport.Ignore
    fun dndEndSnoozeBlocking(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    suspend fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse

    @JsExport.Ignore
    fun dndInfoBlocking(
        req: DndInfoRequest
    ): DndInfoResponse

    suspend fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    @JsExport.Ignore
    fun dndSetSnoozeBlocking(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    suspend fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse

    @JsExport.Ignore
    fun dndTeamInfoBlocking(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse
}
