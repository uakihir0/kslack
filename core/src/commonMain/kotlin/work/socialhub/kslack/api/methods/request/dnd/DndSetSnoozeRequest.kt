package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.SlackApiRequest

class DndSetSnoozeRequest(
    /** Authentication token. Requires scope: `dnd:write` */
    override var token: String?,
    /** Number of minutes, from now, to snooze until. */
    var numMinutes: Int?
) : SlackApiRequest