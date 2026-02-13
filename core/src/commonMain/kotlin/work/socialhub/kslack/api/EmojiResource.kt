package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.response.emoji.EmojiListResponse
import kotlin.js.JsExport

@JsExport
interface EmojiResource {

    suspend fun emojiList(
        req: EmojiListRequest
    ): EmojiListResponse

    @JsExport.Ignore
    fun emojiListBlocking(
        req: EmojiListRequest
    ): EmojiListResponse
}
