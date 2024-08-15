package work.socialhub.kslack.api.methods.request.usergroups.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupUsersListRequest(
    /** Authentication token. Requires scope: `usergroups:read` */
    override var token: String?,
    /** The encoded ID of the User Group to update. */
    var usergroup: String?,
    /** Allow results that involve disabled User Groups. */
    var isIncludeDisabled: Boolean
) : SlackApiRequest