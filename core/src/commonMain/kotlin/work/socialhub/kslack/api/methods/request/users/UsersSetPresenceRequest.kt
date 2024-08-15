package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersSetPresenceRequest(
    /** Authentication token. Requires scope: `users:write` */
    override var token: String?,
    /** Either `auto` or `away` */
    var presence: String?
) : SlackApiRequest