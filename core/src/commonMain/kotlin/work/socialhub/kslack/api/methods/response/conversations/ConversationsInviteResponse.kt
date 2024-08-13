package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.model.Conversation

class ConversationsInviteResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var errors: Array<Error>? = null
    var needed: String? = null
    var provided: String? = null

    var channel: Conversation? = null

    class Error {
        var isOk: Boolean = false
        var error: String? = null
    }
}
