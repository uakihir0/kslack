package work.socialhub.kslack.api.methods.request.apps.permissions.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class AppsPermissionsUsersRequestRequest (
    override var token: String?,
    /** A comma separated list of user scopes to request for */
    var scopes: Array<String>?,
    /** Token used to trigger the request */
    var triggerId: String?,
    /** The user this scope is being requested for */
    var user: String?
) : SlackApiRequest