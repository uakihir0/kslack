package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.EmojiResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.response.emoji.EmojiListResponse
import work.socialhub.kslack.util.toBlocking

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
