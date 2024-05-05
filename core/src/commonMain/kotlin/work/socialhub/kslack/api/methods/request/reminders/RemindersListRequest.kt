package com.github.seratch.jslack.api.methods.request.reminders

import com.github.seratch.jslack.api.methods.SlackApiRequest

class RemindersListRequest internal constructor(
    /**
     * Authentication token. Requires scope: `reminders:read`
     */
    override var token: String?
) : SlackApiRequest {
    class RemindersListRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): RemindersListRequestBuilder {
            this.token = token
            return this
        }

        fun build(): RemindersListRequest {
            return RemindersListRequest(token)
        }

        override fun toString(): String {
            return "RemindersListRequest.RemindersListRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): RemindersListRequestBuilder {
            return RemindersListRequestBuilder()
        }
    }
}