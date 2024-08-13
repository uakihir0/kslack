package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.SlackApiRequest

class GroupsRenameRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** Private channel to rename */
    var channel: String?,
    /** New name for private channel. */
    var name: String?,
    /** Whether to return errors on invalid channel name instead of modifying it to meet the specified criteria. */
    var isValidate: Boolean
) : SlackApiRequest