package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.model.Message

class ConversationsRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: Array<Message>? = null
    var isHasMore: Boolean = false
    var responseMetadata: ResponseMetadata? = null
}
