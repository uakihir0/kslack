package work.socialhub.kslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsListRequest(
    /** Authentication token. Requires scope: `pins:read` */
    override var token: String?,
    /** Channel to get pinned items for. */
    var channel: String?
) : SlackApiRequest