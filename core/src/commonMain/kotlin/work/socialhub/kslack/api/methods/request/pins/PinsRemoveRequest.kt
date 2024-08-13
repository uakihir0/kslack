package work.socialhub.kslack.api.methods.request.pins

import work.socialhub.kslack.api.methods.SlackApiRequest

class PinsRemoveRequest(
    /** Authentication token. Requires scope: `pins:write` */
    override var token: String?,
    /** Channel where the item is pinned to. */
    var channel: String?,
    /** File to un-pin. */
    var file: String?,
    /** File comment to un-pin. */
    var fileComment: String?,
    /** Timestamp of the message to un-pin. */
    var timestamp: String?
) : SlackApiRequest