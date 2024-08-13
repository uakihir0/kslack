package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsRepliesRequest(
    /** Authentication token. Requires scope: `groups:history` */
    override var token: String?,
    /** Private channel to fetch thread from */
    var channel: String?,
    /** Unique identifier of a thread's parent message */
    var threadTs: String?
) : SlackApiRequest