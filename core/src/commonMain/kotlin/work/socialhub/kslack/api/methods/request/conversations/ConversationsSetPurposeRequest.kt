package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsSetPurposeRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Conversation to set the purpose of */
    var channel: String?,
    /** A new, specialer purpose */
    var purpose: String?
) : SlackApiRequest