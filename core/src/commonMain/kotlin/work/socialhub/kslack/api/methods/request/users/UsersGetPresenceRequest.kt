package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersGetPresenceRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,
    /** User to get presence info on. Defaults to the authed user. */
    var user: String?
) : SlackApiRequest