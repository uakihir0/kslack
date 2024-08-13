package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimRepliesRequest(
    /** Authentication token. Requires scope: `mpim:history` */
    override var token: String?,
    /** Multiparty direct message channel to fetch thread from. */
    var channel: String?,
    /** Unique identifier of a thread's parent message. */
    var threadTs: String?
) : SlackApiRequest