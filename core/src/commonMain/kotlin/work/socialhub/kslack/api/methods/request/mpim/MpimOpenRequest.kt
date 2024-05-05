package com.github.seratch.jslack.api.methods.request.mpim

import com.github.seratch.jslack.api.methods.SlackApiRequest

class MpimOpenRequest internal constructor(
    /**
     * Authentication token. Requires scope: `mpim:write`
     */
    override var token: String?,
    /**
     * Comma separated lists of users.
     * The ordering of the users is preserved whenever a MPIM group is returned.
     */
    var users: List<String>?
) : SlackApiRequest {
    class MpimOpenRequestBuilder internal constructor() {
        private var token: String? = null
        private var users: List<String>? = null

        fun token(token: String?): MpimOpenRequestBuilder {
            this.token = token
            return this
        }

        fun users(users: List<String>?): MpimOpenRequestBuilder {
            this.users = users
            return this
        }

        fun build(): MpimOpenRequest {
            return MpimOpenRequest(token, users)
        }

        override fun toString(): String {
            return "MpimOpenRequest.MpimOpenRequestBuilder(token=" + this.token + ", users=" + this.users + ")"
        }
    }

    companion object {
        fun builder(): MpimOpenRequestBuilder {
            return MpimOpenRequestBuilder()
        }
    }
}