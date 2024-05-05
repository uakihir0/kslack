package com.github.seratch.jslack.api.methods.request.dnd

import com.github.seratch.jslack.api.methods.SlackApiRequest

class DndSetSnoozeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    override var token: String?,
    /**
     * Number of minutes, from now, to snooze until.
     */
    var numMinutes: Int?
) : SlackApiRequest {
    class DndSetSnoozeRequestBuilder internal constructor() {
        private var token: String? = null
        private var numMinutes: Int? = null

        fun token(token: String?): DndSetSnoozeRequestBuilder {
            this.token = token
            return this
        }

        fun numMinutes(numMinutes: Int?): DndSetSnoozeRequestBuilder {
            this.numMinutes = numMinutes
            return this
        }

        fun build(): DndSetSnoozeRequest {
            return DndSetSnoozeRequest(token, numMinutes)
        }

        override fun toString(): String {
            return "DndSetSnoozeRequest.DndSetSnoozeRequestBuilder(token=" + this.token + ", numMinutes=" + this.numMinutes + ")"
        }
    }

    companion object {
        fun builder(): DndSetSnoozeRequestBuilder {
            return DndSetSnoozeRequestBuilder()
        }
    }
}