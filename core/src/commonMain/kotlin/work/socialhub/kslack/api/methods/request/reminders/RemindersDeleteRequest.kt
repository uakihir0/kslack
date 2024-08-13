package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersDeleteRequest(
    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    override var token: String?,
    /**
     * The ID of the reminder
     */
    var reminder: String?
) : SlackApiRequest {
    class RemindersDeleteRequestBuilder() {
        private var token: String? = null
        private var reminder: String? = null

        fun token(token: String?): RemindersDeleteRequestBuilder {
            this.token = token
            return this
        }

        fun reminder(reminder: String?): RemindersDeleteRequestBuilder {
            this.reminder = reminder
            return this
        }

        fun build(): RemindersDeleteRequest {
            return RemindersDeleteRequest(token, reminder)
        }

        override fun toString(): String {
            return "RemindersDeleteRequest.RemindersDeleteRequestBuilder(token=" + this.token + ", reminder=" + this.reminder + ")"
        }
    }

    companion object {
        fun builder(): RemindersDeleteRequestBuilder {
            return RemindersDeleteRequestBuilder()
        }
    }
}