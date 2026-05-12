package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.response.stars.StarsAddResponse
import work.socialhub.kslack.api.methods.response.stars.StarsListResponse
import work.socialhub.kslack.api.methods.response.stars.StarsRemoveResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `stars.*` API methods.
 *
 * Provides methods for adding, listing, and removing stars (bookmarks) on
 * messages and files. Stars appear in the user's "Stars" view in Slack.
 *
 * @deprecated Stars API is functionally deprecated by Slack and replaced by
 * the "Later" view. Prefer using the Slack UI's Later feature instead of
 * this API.
 *
 * # Usage Example
 * ```kotlin
 * // Add a star to a message
 * slack.stars.add(
 *     StarsAddRequest(
 *         file = "F012AB3CD",
 *         timestamp = "1234567890.123456"
 *     )
 * )
 *
 * // List starred items
 * val starred = slack.stars.list(StarsListRequest())
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/stars.add">stars.add</a>
 * @see <a href="https://docs.slack.dev/reference/methods/stars.list">stars.list</a>
 */
@Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
@JsExport
interface StarsResource {

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsAdd(
        req: StarsAddRequest
    ): StarsAddResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsAddBlocking(
        req: StarsAddRequest
    ): StarsAddResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsList(
        req: StarsListRequest
    ): StarsListResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsListBlocking(
        req: StarsListRequest
    ): StarsListResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    suspend fun starsRemove(
        req: StarsRemoveRequest
    ): StarsRemoveResponse

    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    @JsExport.Ignore
    fun starsRemoveBlocking(
        req: StarsRemoveRequest
    ): StarsRemoveResponse
}
