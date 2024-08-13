package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsLeaveRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Conversation to leave */
    var channel: String?
) : SlackApiRequest