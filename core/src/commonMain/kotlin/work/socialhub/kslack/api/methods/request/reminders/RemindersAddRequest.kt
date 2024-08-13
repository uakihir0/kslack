package work.socialhub.kslack.api.methods.request.reminders

import work.socialhub.kslack.api.methods.SlackApiRequest

class RemindersAddRequest(
    /**
     * Authentication token. Requires scope: `reminders:write`
     */
    override var token: String?,
    /**
     * The content of the reminder
     */
    var text: String?,
    /**
     * When this reminder should happen: the Unix timestamp (up to five years from now),
     * the number of seconds until the reminder (if within 24 hours), or a natural language description
     * (Ex. \"in 15 minutes,\" or \"every Thursday\")
     */
    var time: String?,
    /**
     * The user who will receive the reminder. If no user is specified, the reminder will go to user who created it.
     */
    var user: String?
) : SlackApiRequest {
    class RemindersAddRequestBuilder() {
        private var token: String? = null
        private var text: String? = null
        private var time: String? = null
        private var user: String? = null

        fun token(token: String?): RemindersAddRequestBuilder {
            this.token = token
            return this
        }

        fun text(text: String?): RemindersAddRequestBuilder {
            this.text = text
            return this
        }

        fun time(time: String?): RemindersAddRequestBuilder {
            this.time = time
            return this
        }

        fun user(user: String?): RemindersAddRequestBuilder {
            this.user = user
            return this
        }

        fun build(): RemindersAddRequest {
            return RemindersAddRequest(token, text, time, user)
        }

        override fun toString(): String {
            return "RemindersAddRequest.RemindersAddRequestBuilder(token=" + this.token + ", text=" + this.text + ", time=" + this.time + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): RemindersAddRequestBuilder {
            return RemindersAddRequestBuilder()
        }
    }
}