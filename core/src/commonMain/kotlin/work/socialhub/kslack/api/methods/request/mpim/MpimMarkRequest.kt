package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimMarkRequest(
    /** Authentication token. Requires scope: `mpim:write` */
    override var token: String?,
    /** Multiparty direct message channel to set reading cursor in. */
    var channel: String?,
    /** Timestamp of the most recently seen message. */
    var ts: String?
) : SlackApiRequest