package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsCloseRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Conversation to close. */
    var channel: String?
) : SlackApiRequest
