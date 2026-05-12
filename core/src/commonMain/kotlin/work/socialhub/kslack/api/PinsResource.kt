package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsDeleteRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.response.pins.PinsAddResponse
import work.socialhub.kslack.api.methods.response.pins.PinsDeleteResponse
import work.socialhub.kslack.api.methods.response.pins.PinsListResponse
import work.socialhub.kslack.api.methods.response.pins.PinsRemoveResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `pins.*` API methods.
 *
 * Provides methods for managing pinned items (messages and files) within Slack channels.
 * Pinned items are accessible to all members of a channel via the Slack web interface
 * and the `pins.list` API method.
 *
 * # Usage Example
 * ```kotlin
 * // Pin a message to a channel
 * val pinned = slack.pins.add(
 *     PinsAddRequest(
 *         channel = "C012AB3CD",
 *         timestamp = "1234567890.123456"
 *     )
 * )
 *
 * // List all pinned items in a channel
 * val items = slack.pins.list(
 *     PinsListRequest(channel = "C012AB3CD")
 * )
 * ```
 *
 * Pinned items are scoped to a single channel - there is no global pinning.
 * A channel can have up to 100 pinned items.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/pins.add">pins.add</a>
 * @see <a href="https://docs.slack.dev/reference/methods/pins.list">pins.list</a>
 */
@JsExport
interface PinsResource {

    /**
     * Adds a pinned item (message or file) to a channel.
     *
     * Only messages sent after March 2022 can be pinned. Each channel can have up to 100 pinned items.
     *
     * @param req Request containing the channel ID and message timestamp
     * @return Response indicating whether the item was pinned successfully
     * @see <a href="https://docs.slack.dev/reference/methods/pins.add">pins.add</a>
     */
    suspend fun pinsAdd(
        req: PinsAddRequest
    ): PinsAddResponse

    @JsExport.Ignore
    fun pinsAddBlocking(
        req: PinsAddRequest
    ): PinsAddResponse

    suspend fun pinsList(
        req: PinsListRequest
    ): PinsListResponse

    @JsExport.Ignore
    fun pinsListBlocking(
        req: PinsListRequest
    ): PinsListResponse

    suspend fun pinsRemove(
        req: PinsRemoveRequest
    ): PinsRemoveResponse

    @JsExport.Ignore
    fun pinsRemoveBlocking(
        req: PinsRemoveRequest
    ): PinsRemoveResponse

    suspend fun pinsDelete(
        req: PinsDeleteRequest
    ): PinsDeleteResponse

    @JsExport.Ignore
    fun pinsDeleteBlocking(
        req: PinsDeleteRequest
    ): PinsDeleteResponse
}
