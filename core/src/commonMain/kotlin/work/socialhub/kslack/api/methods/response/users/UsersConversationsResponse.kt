package work.socialhub.kslack.api.methods.response.users

import work.socialhub.kslack.api.model.Conversation

class UsersConversationsResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channels: Array<Conversation>? = null
    var responseMetadata: ResponseMetadata? = null
}
