package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.session.reset
 */
class AdminUsersSessionResetRequest internal constructor(
    /**
     * Authentication token bearing required scopes. (admin.users:write)
     */
    override var token: String?,
    /**
     * The ID of the user to wipe sessions for
     */
    var userId: String?,
    /**
     * Only expire mobile sessions (default: false)
     */
    var isMobileOnly: Boolean,
    /**
     * Only expire web sessions (default: false)
     */
    var isWebOnly: Boolean
) : SlackApiRequest {
    class AdminUsersSessionResetRequestBuilder internal constructor() {
        private var token: String? = null
        private var userId: String? = null
        private var mobileOnly = false
        private var webOnly = false

        fun token(token: String?): AdminUsersSessionResetRequestBuilder {
            this.token = token
            return this
        }

        fun userId(userId: String?): AdminUsersSessionResetRequestBuilder {
            this.userId = userId
            return this
        }

        fun mobileOnly(mobileOnly: Boolean): AdminUsersSessionResetRequestBuilder {
            this.mobileOnly = mobileOnly
            return this
        }

        fun webOnly(webOnly: Boolean): AdminUsersSessionResetRequestBuilder {
            this.webOnly = webOnly
            return this
        }

        fun build(): AdminUsersSessionResetRequest {
            return AdminUsersSessionResetRequest(token, userId, mobileOnly, webOnly)
        }

        override fun toString(): String {
            return "AdminUsersSessionResetRequest.AdminUsersSessionResetRequestBuilder(token=" + this.token + ", userId=" + this.userId + ", mobileOnly=" + this.mobileOnly + ", webOnly=" + this.webOnly + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersSessionResetRequestBuilder {
            return AdminUsersSessionResetRequestBuilder()
        }
    }
}