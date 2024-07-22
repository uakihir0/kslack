package com.github.seratch.jslack.api.methods.response.reminders

import work.socialhub.kslack.api.methods.SlackApiResponse

class RemindersDeleteResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}