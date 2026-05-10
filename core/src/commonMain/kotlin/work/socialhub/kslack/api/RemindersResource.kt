package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.reminders.*
import work.socialhub.kslack.api.methods.response.reminders.*
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `reminders.*` API methods.
 *
 * Provides methods for creating, listing, retrieving, completing, and deleting
 * reminders in Slack. Reminders allow users to set notifications for specific
 * times and receive a message when the reminder fires.
 *
 * # Usage Example
 * ```kotlin
 * // Create a reminder
 * val added = slack.reminders.add(
 *     RemindersAddRequest(
 *         text = "Submit weekly report",
 *        提醒time = "2024-01-15T10:00:00"
 *     )
 * )
 *
 * // List all reminders
 * val list = slack.reminders.list(RemindersListRequest())
 *
 * // Complete a reminder
 * val completed = slack.reminders.complete(
 *     RemindersCompleteRequest(id = added.result.id)
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/reminders.add">reminders.add</a>
 * @see <a href="https://docs.slack.dev/reference/methods/reminders.list">reminders.list</a>
 * @see <a href="https://docs.slack.dev/reference/methods/reminders.info">reminders.info</a>
 */
@JsExport
interface RemindersResource {

    /**
     * Creates a new reminder for the authenticated user.
     *
     * When the reminder time is reached, the user receives a Slack notification
     * with the reminder text.
     *
     * @param req Request containing the reminder text and reminder time
     * @return Response with the created reminder's ID and details
     * @see <a href="https://docs.slack.dev/reference/methods/reminders.add">reminders.add</a>
     */
    suspend fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse

    @JsExport.Ignore
    fun remindersAddBlocking(
        req: RemindersAddRequest
    ): RemindersAddResponse

    suspend fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    @JsExport.Ignore
    fun remindersCompleteBlocking(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    suspend fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    @JsExport.Ignore
    fun remindersDeleteBlocking(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    suspend fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    @JsExport.Ignore
    fun remindersInfoBlocking(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    suspend fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse

    @JsExport.Ignore
    fun remindersListBlocking(
        req: RemindersListRequest
    ): RemindersListResponse
}
