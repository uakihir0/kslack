package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsOpenRequest(
    /** Authentication token. Requires scope: `conversations:write` */
    override var token: String?,
    /** Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead. */
    var channel: String?,
    /** Boolean, indicates you want the full IM channel definition in the response. */
    var isReturnIm: Boolean,

    /**
     * Comma separated lists of users. If only one user is included, this creates a 1:1 DM.
     * The ordering of the users is preserved whenever a multi-person direct message is returned.
     * Supply a `channel` when not supplying `users`.
     */
    var users: Array<String>?
) : SlackApiRequest