package work.socialhub.kslack.api.methods.response.chat

import work.socialhub.kslack.api.model.Message

class ChatUpdateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channel: String? = null
    var ts: String? = null
    var text: String? = null
    var message: Message? = null
}