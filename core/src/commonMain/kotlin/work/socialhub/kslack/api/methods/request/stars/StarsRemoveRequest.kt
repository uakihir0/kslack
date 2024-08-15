package work.socialhub.kslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsRemoveRequest(
    /** Authentication token. Requires scope: `stars:write` */
    override var token: String?,
    /** File to remove star from. */
    var file: String?,
    /** File comment to remove star from. */
    var fileComment: String?,
    /** Channel to remove star from, or channel where the message to remove star from was posted (used with `timestamp`). */
    var channel: String?,
    /** Timestamp of the message to remove star from. */
    var timestamp: String?
) : SlackApiRequest