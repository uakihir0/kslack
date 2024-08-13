package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimOpenRequest(
    /** Authentication token. Requires scope: `mpim:write` */
    override var token: String?,

    /**
     * Comma separated lists of users.
     * The ordering of the users is preserved whenever a MPIM group is returned.
     */
    var users: Array<String>?
) : SlackApiRequest