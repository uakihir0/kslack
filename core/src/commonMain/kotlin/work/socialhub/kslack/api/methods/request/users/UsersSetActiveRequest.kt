package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersSetActiveRequest(
    /** Authentication token. Requires scope: `users:write` */
    override var token: String?
) : SlackApiRequest