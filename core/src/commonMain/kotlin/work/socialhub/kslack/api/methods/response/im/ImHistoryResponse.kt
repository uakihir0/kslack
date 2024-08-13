package work.socialhub.kslack.api.methods.response.im

import work.socialhub.kslack.api.model.Message

class ImHistoryResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var latest: String? = null
    var messages: Array<Message>? = null
    var isHasMore: Boolean = false
    var channelActionsTs: String? = null
    var channelActionsCount: Int? = null
}