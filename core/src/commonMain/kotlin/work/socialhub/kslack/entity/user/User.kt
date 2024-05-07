package work.socialhub.kslack.entity.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://api.slack.com/types/user
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/User.java
 */
@JsExport
@Serializable
class User {

    var id: String? = null

    @SerialName("team_id")
    var teamId: String? = null

    var name: String? = null

    @SerialName("deleted")
    var isDeleted: Boolean = false

    var color: String? = null

    @SerialName("real_name")
    var realName: String? = null

    var tz: String? = null

    @SerialName("tz_label")
    var tzLabel: String? = null

    @SerialName("tz_offset")
    var tzOffset: Int? = null

    var profile: Profile? = null

    @SerialName("is_admin")
    var isAdmin: Boolean = false

    @SerialName("is_owner")
    var isOwner: Boolean = false

    @SerialName("is_primary_owner")
    var isPrimaryOwner: Boolean = false

    @SerialName("is_invited_user")
    var isInvitedUser = false

    /**
     * is_restricted indicates the user is a multi-channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerialName("is_restricted")
    var isRestricted: Boolean = false

    /**
     * is_ultra_restricted indicates they are a single channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerialName("is_ultra_restricted")
    var isUltraRestricted: Boolean = false

    @SerialName("is_bot")
    var isBot: Boolean = false

    @SerialName("is_connector_bot")
    val isConnectorBot = false

    @SerialName("is_app_user")
    var isAppUser: Boolean = false

    var updated: Int? = null

    @SerialName("has_2fa")
    var isHas2fa: Boolean = false

    @SerialName("is_email_confirmed")
    var isEmailConfirmed: Boolean = false

    var presence: String? = null // away, etc

    @SerialName("enterprise_user")
    var enterpriseUser: EnterpriseUser? = null

    @SerialName("two_factor_type")
    var twoFactorType: String? = null

    @SerialName("has_files")
    var isHasFiles: Boolean = false

    var locale: String? = null

    @SerialName("is_workflow_bot")
    var isWorkflowBot: Boolean = false

    @SerialName("who_can_share_contact_card")
    var whoCanShareContactCard: String? = null
}
