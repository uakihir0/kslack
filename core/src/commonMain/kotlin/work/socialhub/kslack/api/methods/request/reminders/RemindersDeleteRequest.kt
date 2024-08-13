package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersDeleteRequest(
    /** Authentication token. Requires scope: `reminders:write` */
    override var token: String?,
    /** The ID of the reminder */
    var reminder: String?
) : SlackApiRequest