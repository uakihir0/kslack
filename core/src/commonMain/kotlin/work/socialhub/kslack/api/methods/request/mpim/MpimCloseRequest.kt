package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimCloseRequest(
    /** Authentication token. Requires scope: `mpim:write` */
    override var token: String?,
    /** MPIM to close. */
    var channel: String?
) : SlackApiRequest