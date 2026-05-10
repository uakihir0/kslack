package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.reactions.ReactionsAddRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsGetRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsRemoveRequest
import work.socialhub.kslack.api.methods.response.reactions.ReactionsAddResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsGetResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsListResponse
import work.socialhub.kslack.api.methods.response.reactions.ReactionsRemoveResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `reactions.*` API methods.
 *
 * Provides methods for adding, retrieving, listing, and removing emoji
 * reactions on messages, files, and file comments.
 *
 * # Usage Example
 * ```kotlin
 * // Add a reaction to a message
 * slack.reactions.add(
 *     ReactionsAddRequest(
 *         name = "thumbsup",
 *         timestamp = "1234567890.123456"
 *     )
 * )
 *
 * // List all reactions for a message
 * val reactions = slack.reactions.get(
 *     ReactionsGetRequest(
 *         full = true,
 *         timestamp = "1234567890.123456"
 *     )
 * )
 *
 * // List all reactions across the workspace
 * val allReactions = slack.reactions.list(ReactionsListRequest())
 *
 * // Remove a reaction
 * slack.reactions.remove(
 *     ReactionsRemoveRequest(
 *         name = "thumbsup",
 *         timestamp = "1234567890.123456"
 *     )
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/reactions.add">reactions.add</a>
 * @see <a href="https://docs.slack.dev/reference/methods/reactions.get">reactions.get</a>
 * @see <a href="https://docs.slack.dev/reference/methods/reactions.list">reactions.list</a>
 */
@JsExport
interface ReactionsResource {

    /**
     * Adds an emoji reaction to an item.
     *
     * Items can be messages in a channel, files, or file comments.
     * The emoji name should match one of Slack's supported emoji.
     *
     * @param req Request containing the emoji name and item identifier
     * @return Response indicating whether the reaction was added successfully
     * @see <a href="https://docs.slack.dev/reference/methods/reactions.add">reactions.add</a>
     */
    suspend fun reactionsAdd(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    @JsExport.Ignore
    fun reactionsAddBlocking(
        req: ReactionsAddRequest
    ): ReactionsAddResponse

    suspend fun reactionsGet(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    @JsExport.Ignore
    fun reactionsGetBlocking(
        req: ReactionsGetRequest
    ): ReactionsGetResponse

    suspend fun reactionsList(
        req: ReactionsListRequest
    ): ReactionsListResponse

    @JsExport.Ignore
    fun reactionsListBlocking(
        req: ReactionsListRequest
    ): ReactionsListResponse

    suspend fun reactionsRemove(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse

    @JsExport.Ignore
    fun reactionsRemoveBlocking(
        req: ReactionsRemoveRequest
    ): ReactionsRemoveResponse
}
