package work.socialhub.kslack.api.methods.response.groups

import work.socialhub.kslack.api.model.Message

class GroupsRepliesResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var messages: Array<Message>? = null
    var threadInfo: ThreadInfo? = null
    var isHasMore: Boolean = false
}
