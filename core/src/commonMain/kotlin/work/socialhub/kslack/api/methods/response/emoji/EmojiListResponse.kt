package work.socialhub.kslack.api.methods.response.emoji

import work.socialhub.kslack.api.methods.SlackApiResponse

class EmojiListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var emoji: Map<String, String>? = null
    var cacheTs: String? = null
}