package work.socialhub.kslack.api.methods.request.chat

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChatDeleteScheduledMessageRequest(
    override var token: String?,
    /** The channel the scheduled_message is posting to */
    var channel: String?,
    /** scheduled_message_id returned from call to chat.scheduleMessage */
    var scheduledMessageId: String?,

    /**
     * Pass true to delete the message as the authed user with chat:write:user scope.
     * Bot users in this context are considered authed users.
     * If unused or false, the message will be deleted with chat:write:bot scope.
     */
    var isAsUser: Boolean?
) : SlackApiRequest