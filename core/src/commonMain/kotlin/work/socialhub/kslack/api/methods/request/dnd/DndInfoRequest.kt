package com.github.seratch.jslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.SlackApiRequest

class DndInfoRequest internal constructor(
    /**
     * Authentication token. Requires scope: `dnd:read`
     */
    override var token: String?,
    /**
     * User to fetch status for (defaults to current user)
     */
    var user: String?
) : SlackApiRequest {
    class DndInfoRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null

        fun token(token: String?): DndInfoRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): DndInfoRequestBuilder {
            this.user = user
            return this
        }

        fun build(): DndInfoRequest {
            return DndInfoRequest(token, user)
        }

        override fun toString(): String {
            return "DndInfoRequest.DndInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ")"
        }
    }

    companion object {
        fun builder(): DndInfoRequestBuilder {
            return DndInfoRequestBuilder()
        }
    }
}