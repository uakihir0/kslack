package work.socialhub.kslack.api.methods.response.conversations

import work.socialhub.kslack.api.model.Conversation

class ConversationsCreateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null

    // {
    //   "ok": false,
    //   "error": "invalid_name_maxlength",
    //   "detail": "Value passed for `name` exceeded max length."
    // }
    var detail: String? = null

    var needed: String? = null
    var provided: String? = null

    var channel: Conversation? = null
}
