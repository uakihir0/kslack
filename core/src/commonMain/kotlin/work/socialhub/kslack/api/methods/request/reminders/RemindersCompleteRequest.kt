package com.github.seratch.jslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersCompleteRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    override var token: String?,
    /**
     * The ID of the reminder to be marked as complete
     */
    var reminder: String?
) : SlackApiRequest {
    class RemindersCompleteRequestBuilder internal constructor() {
        private var token: String? = null
        private var reminder: String? = null

        fun token(token: String?): RemindersCompleteRequestBuilder {
            this.token = token
            return this
        }

        fun reminder(reminder: String?): RemindersCompleteRequestBuilder {
            this.reminder = reminder
            return this
        }

        fun build(): RemindersCompleteRequest {
            return RemindersCompleteRequest(token, reminder)
        }

        override fun toString(): String {
            return "RemindersCompleteRequest.RemindersCompleteRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")"
        }
    }

    companion object {
        fun builder(): RemindersCompleteRequestBuilder {
            return RemindersCompleteRequestBuilder()
        }
    }
}