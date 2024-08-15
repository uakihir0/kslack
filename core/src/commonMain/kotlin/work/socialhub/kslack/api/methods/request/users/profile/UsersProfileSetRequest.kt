package work.socialhub.kslack.api.methods.request.users.profile

import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.user.Profile

class UsersProfileSetRequest(
    /** Authentication token. Requires scope: `users.profile:write` */
    override var token: String?,
    /** ID of user to change. This argument may only be specified by team admins on paid teams. */
    var user: String?,
    /** Collection of key:value pairs presented as a URL-encoded JSON hash. */
    var profile: Profile?,
    /** Name of a single key to set. Usable only if profile is not passed. */
    var name: String?,
    /** Value to set a single key to. Usable only if profile is not passed. */
    var value: String?
) : SlackApiRequest
