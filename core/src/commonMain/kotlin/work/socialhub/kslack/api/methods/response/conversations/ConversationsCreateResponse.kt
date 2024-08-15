package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.Serializable
import work.socialhub.kmastodon.entity.Conversation
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class ConversationsCreateResponse : SlackApiResponse() {

    // {
    //   "ok": false,
    //   "error": "invalid_name_maxlength",
    //   "detail": "Value passed for `name` exceeded max length."
    // }
    var detail: String? = null

    var channel: Conversation? = null
}
