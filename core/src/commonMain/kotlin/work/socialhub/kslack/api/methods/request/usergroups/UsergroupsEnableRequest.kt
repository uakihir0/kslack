package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsEnableRequest(
    /** Authentication token. Requires scope: `usergroups:write` */
    override var token: String?,
    /** The encoded ID of the User Group to enable. */
    var usergroup: String?,
    /** Include the number of users in the User Group. */
    var isIncludeCount: Boolean
) : SlackApiRequest