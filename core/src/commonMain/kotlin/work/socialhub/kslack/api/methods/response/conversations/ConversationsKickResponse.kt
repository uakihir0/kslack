package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.methods.SlackApiResponse

class ConversationsKickResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}
