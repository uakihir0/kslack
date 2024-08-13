package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImRepliesRequest(
    /** Authentication token. Requires scope: `im:history` */
    override var token: String?,
    /** Direct message channel to fetch thread from. */
    var channel: String?,
    /** Unique identifier of a thread's parent message. */
    var threadTs: String?
) : SlackApiRequest