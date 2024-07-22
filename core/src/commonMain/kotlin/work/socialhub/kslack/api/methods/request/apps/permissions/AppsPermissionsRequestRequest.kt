package work.socialhub.kslack.api.methods.request.apps.permissions

import work.socialhub.kslack.api.methods.SlackApiRequest

class AppsPermissionsRequestRequest (
    /** Authentication token. Requires scope: `none` */
    override var token: String?,
    /** Token used to trigger the permissions API */
    var triggerId: String?,
    /** A comma separated list of scopes to request for */
    var scopes: Array<String>?
) : SlackApiRequest