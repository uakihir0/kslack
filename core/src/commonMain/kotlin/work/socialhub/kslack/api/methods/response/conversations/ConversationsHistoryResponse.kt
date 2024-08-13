package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.model.Message

class ConversationsHistoryResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var latest: String? = null
    var messages: Array<Message>? = null
    var isHasMore: Boolean = false
    var pinCount: Int? = null
    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null
    var responseMetadata: ResponseMetadata? = null
}
