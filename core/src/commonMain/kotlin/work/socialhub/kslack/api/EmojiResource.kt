package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.response.emoji.EmojiListResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `emoji` API methods.
 *
 * Provides methods for listing custom emoji available in a workspace.
 * Emoji can be either default Slack emoji or custom emoji uploaded
 * by workspace admins.
 *
 * # Usage Example
 * ```kotlin
 * // List all emoji in the workspace
 * val emoji = slack.emoji.list(EmojiListRequest())
 * val customEmoji = emoji.result.emoji?.filterKeys { key ->
 *     !key.startsWith(":") || key in defaultEmoji
 * }
 * ```
 *
 * The response maps custom emoji names to their image URLs.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/emoji.list">emoji.list</a>
 */
@JsExport
interface EmojiResource {

    /**
     * Lists custom emoji in the workspace.
     *
     * Returns a map of custom emoji names to their image URLs.
     * Does not include default Slack emoji.
     *
     * @param req Request (no parameters required, included for API consistency)
     * @return Response with custom emoji name-to-URL mapping
     * @see <a href="https://docs.slack.dev/reference/methods/emoji.list">emoji.list</a>
     */
    suspend fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse

    @JsExport.Ignore
    fun emojiListBlocking(
        req: EmojiListRequest
    ): EmojiListResponse
}
