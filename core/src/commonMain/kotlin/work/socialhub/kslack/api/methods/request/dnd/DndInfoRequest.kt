package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.SlackApiRequest

class DndInfoRequest(
    /** Authentication token. Requires scope: `dnd:read` */
    override var token: String?,
    /** User to fetch status for (defaults to current user) */
    var user: String?
) : SlackApiRequest