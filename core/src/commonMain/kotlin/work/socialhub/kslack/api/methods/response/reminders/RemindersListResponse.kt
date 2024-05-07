package com.github.seratch.jslack.api.methods.response.reminders

import com.github.seratch.jslack.api.model.Reminder

class RemindersListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var reminders: Array<Reminder>? = null
}