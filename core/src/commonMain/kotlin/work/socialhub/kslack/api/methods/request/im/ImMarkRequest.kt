package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImMarkRequest(
    /** Authentication token. Requires scope: `im:write` */
    override var token: String?,
    /** Direct message channel to set reading cursor in. */
    var channel: String?,
    /** Timestamp of the most recently seen message. */
    var ts: String?
) : SlackApiRequest