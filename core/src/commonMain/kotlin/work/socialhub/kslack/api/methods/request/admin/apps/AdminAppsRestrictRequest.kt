package work.socialhub.kslack.api.methods.request.admin.apps

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.apps.restrict
 */
class AdminAppsRestrictRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** The id of the app to approve. */
    var appId: String?,
    /** The id of the request to approve. */
    var requestId: String?,
    /** Workspace Id */
    var teamId: String?
) : SlackApiRequest
