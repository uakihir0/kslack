package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsSetTopicRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Conversation to set the topic of */
    var channel: String?,
    /** The new topic string. Does not support formatting or linkification. */
    var topic: String?
) : SlackApiRequest