package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsUnarchiveRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** ID of conversation to unarchive */
    var channel: String?
) : SlackApiRequest