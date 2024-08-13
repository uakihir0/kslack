package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsListRequest(
    /** Authentication token. Requires scope: `groups:read` */
    override var token: String?,
    /** Exclude the `members` from each `group` */
    var isExcludeMembers: Boolean,
    /** Don't return archived private channels. */
    var isExcludeArchived: Boolean
) : SlackApiRequest