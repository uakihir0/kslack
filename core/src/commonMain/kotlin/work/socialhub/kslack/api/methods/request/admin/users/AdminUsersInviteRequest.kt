package work.socialhub.kslack.api.methods.request.admin.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.users.invite
 */
class AdminUsersInviteRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** A comma-separated list of channel_ids for this user to join. At least one channel is required. */
    var channelIds: Array<String>?,
    /** The email address of the person to invite. */
    var email: String?,
    /** Workspace Id */
    var teamId: String?,
    /** An optional message to send to the user in the invite email. */
    var customMessage: String?,

    /**
     * Timestamp when guest account should be disabled.
     * Only include this timestamp if you inviting a guest user and you want their account to expire on a certain date.
     */
    var guestExpirationTs: String?,

    /** Is this user a multi-channel guest user? (default: false) */
    var isRestricted: Boolean,
    /** Is this user a single channel guest user? (default: false) */
    var isUltraRestricted: Boolean,
    /** Full name of the user. */
    var realName: String?,
    /** Allow this invite to be resent in the future if a user has not signed up yet. (default: false) */
    var isResend: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel_ids", channelIds!!.joinToString(","))
            it.addParam("email", email)
            it.addParam("team_id", teamId)
            it.addParam("custom_message", customMessage)
            it.addParam("guest_expiration_ts", guestExpirationTs)
            it.addParam("is_restricted", isRestricted)
            it.addParam("is_ultra_restricted", isUltraRestricted)
            it.addParam("real_name", realName)
            it.addParam("resend", isResend)
        }
    }
}