package com.github.seratch.jslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reminders:read`
     */
    override var token: String?,
    /**
     * The ID of the reminder
     */
    var reminder: String?
) : SlackApiRequest {
    class RemindersInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var reminder: String? = null

        fun token(token: String?): RemindersInfoRequestBuilder {
            this.token = token
            return this
        }

        fun reminder(reminder: String?): RemindersInfoRequestBuilder {
            this.reminder = reminder
            return this
        }

        fun build(): RemindersInfoRequest {
            return RemindersInfoRequest(token, reminder)
        }

        override fun toString(): String {
            return "RemindersInfoRequest.RemindersInfoRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")"
        }
    }

    companion object {
        fun builder(): RemindersInfoRequestBuilder {
            return RemindersInfoRequestBuilder()
        }
    }
}