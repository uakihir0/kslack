package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersIdentityRequest(
    /** Authentication token. Requires scope: `identity.basic` */
    override var token: String?
) : SlackApiRequest
