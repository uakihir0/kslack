package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.model.ResponseMetadata

class ConversationsMembersResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var members: Array<String>? = null
    var responseMetadata: ResponseMetadata? = null
}
