package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersInfoRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,
    /** User to get info on */
    var user: String?,
    /** Set this to `true` to receive the locale for this user. Defaults to `false` */
    var isIncludeLocale: Boolean
) : SlackApiRequest