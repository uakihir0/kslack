package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsDisableRequest(
    /** Authentication token. Requires scope: `usergroups:write` */
    override var token: String?,
    /** The encoded ID of the User Group to disable. */
    var usergroup: String?,
    /** Include the number of users in the User Group. */
    var isIncludeCount: Boolean
) : SlackApiRequest