package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsJoinRequest(
    /** Authentication token. Requires scope: `channels:write` */
    override var token: String?,
    /** ID of conversation to join */
    var channel: String?
) : SlackApiRequest