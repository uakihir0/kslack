package work.socialhub.kslack.api.methods.request.auth

import work.socialhub.kslack.api.methods.SlackApiRequest

class AuthTestRequest (
    /** Authentication token. Requires scope: `none` */
    override var token: String?
) : SlackApiRequest