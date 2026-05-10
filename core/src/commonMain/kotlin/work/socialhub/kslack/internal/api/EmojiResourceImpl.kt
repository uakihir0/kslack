package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.EmojiResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.response.emoji.EmojiListResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [EmojiResource] for Slack's `emoji.list` API method.
 *
 * Handles HTTP POST requests for listing custom emoji available in a workspace.
 * Returns a mapping of custom emoji names to their image URLs.
 *
 * @param token Optional default token provided at factory initialization
 */
class EmojiResourceImpl(
    token: String?
) : AbstractResourceImpl(token), EmojiResource {

    override suspend fun emojiList(req: EmojiListRequest): EmojiListResponse {
        return postFormWithToken(req.toParams(), Methods.EMOJI_LIST, getToken(req))
    }

    override fun emojiListBlocking(req: EmojiListRequest): EmojiListResponse {
        return toBlocking { emojiList(req) }
    }
}
