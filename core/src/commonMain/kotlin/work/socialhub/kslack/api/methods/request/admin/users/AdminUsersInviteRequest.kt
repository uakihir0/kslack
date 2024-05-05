package com.github.seratch.jslack.api.methods.request.admin.users

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.invite
 */
class AdminUsersInviteRequest internal constructor(
    /**
     * Authentication token bearing required scopes.
     */
    override var token: String?,
    /**
     * A comma-separated list of channel_ids for this user to join. At least one channel is required.
     */
    var channelIds: List<String>?,
    /**
     * The email address of the person to invite.
     */
    var email: String?,
    /**
     * Workspace Id
     */
    var teamId: String?,
    /**
     * An optional message to send to the user in the invite email.
     */
    var customMessage: String?,
    /**
     * Timestamp when guest account should be disabled.
     * Only include this timestamp if you inviting a guest user and you want their account to expire on a certain date.
     */
    var guestExpirationTs: String?,
    /**
     * Is this user a multi-channel guest user? (default: false)
     */
    var isRestricted: Boolean,
    /**
     * Is this user a single channel guest user? (default: false)
     */
    var isUltraRestricted: Boolean,
    /**
     * Full name of the user.
     */
    var realName: String?,
    /**
     * Allow this invite to be resent in the future if a user has not signed up yet. (default: false)
     */
    var isResend: Boolean
) : SlackApiRequest {
    class AdminUsersInviteRequestBuilder internal constructor() {
        private var token: String? = null
        private var channelIds: List<String>? = null
        private var email: String? = null
        private var teamId: String? = null
        private var customMessage: String? = null
        private var guestExpirationTs: String? = null
        private var isRestricted = false
        private var isUltraRestricted = false
        private var realName: String? = null
        private var resend = false

        fun token(token: String?): AdminUsersInviteRequestBuilder {
            this.token = token
            return this
        }

        fun channelIds(channelIds: List<String>?): AdminUsersInviteRequestBuilder {
            this.channelIds = channelIds
            return this
        }

        fun email(email: String?): AdminUsersInviteRequestBuilder {
            this.email = email
            return this
        }

        fun teamId(teamId: String?): AdminUsersInviteRequestBuilder {
            this.teamId = teamId
            return this
        }

        fun customMessage(customMessage: String?): AdminUsersInviteRequestBuilder {
            this.customMessage = customMessage
            return this
        }

        fun guestExpirationTs(guestExpirationTs: String?): AdminUsersInviteRequestBuilder {
            this.guestExpirationTs = guestExpirationTs
            return this
        }

        fun isRestricted(isRestricted: Boolean): AdminUsersInviteRequestBuilder {
            this.isRestricted = isRestricted
            return this
        }

        fun isUltraRestricted(isUltraRestricted: Boolean): AdminUsersInviteRequestBuilder {
            this.isUltraRestricted = isUltraRestricted
            return this
        }

        fun realName(realName: String?): AdminUsersInviteRequestBuilder {
            this.realName = realName
            return this
        }

        fun resend(resend: Boolean): AdminUsersInviteRequestBuilder {
            this.resend = resend
            return this
        }

        fun build(): AdminUsersInviteRequest {
            return AdminUsersInviteRequest(
                token,
                channelIds,
                email,
                teamId,
                customMessage,
                guestExpirationTs,
                isRestricted,
                isUltraRestricted,
                realName,
                resend
            )
        }

        override fun toString(): String {
            return "AdminUsersInviteRequest.AdminUsersInviteRequestBuilder(token=" + this.token + ", channelIds=" + this.channelIds + ", email=" + this.email + ", teamId=" + this.teamId + ", customMessage=" + this.customMessage + ", guestExpirationTs=" + this.guestExpirationTs + ", isRestricted=" + this.isRestricted + ", isUltraRestricted=" + this.isUltraRestricted + ", realName=" + this.realName + ", resend=" + this.resend + ")"
        }
    }

    companion object {
        fun builder(): AdminUsersInviteRequestBuilder {
            return AdminUsersInviteRequestBuilder()
        }
    }
}
