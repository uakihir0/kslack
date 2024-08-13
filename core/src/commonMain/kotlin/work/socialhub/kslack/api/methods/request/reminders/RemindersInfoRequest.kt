package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersInfoRequest(
    /** Authentication token. Requires scope: `reminders:read` */
    override var token: String?,
    /** The ID of the reminder */
    var reminder: String?
) : SlackApiRequest