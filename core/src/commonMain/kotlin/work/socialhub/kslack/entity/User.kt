package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * - https://api.slack.com/types/user
 * - https://api.slack.com/changelog/2017-09-the-one-about-usernames
 */
class User {
    var id: String? = null
    var teamId: String? = null
    var name: String? = null
    var isDeleted: Boolean = false
    var color: String? = null
    var realName: String? = null
    var tz: String? = null
    var tzLabel: String? = null
    var tzOffset: Int? = null
    var profile: Profile? = null

    @SerializedName("is_admin")
    var isAdmin: Boolean = false

    @SerializedName("is_owner")
    var isOwner: Boolean = false

    @SerializedName("is_primary_owner")
    var isPrimaryOwner: Boolean = false

    /**
     * is_restricted indicates the user is a multi-channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerializedName("is_restricted")
    var isRestricted: Boolean = false

    /**
     * is_ultra_restricted indicates they are a single channel guest.
     * see also: https://get.slack.help/hc/en-us/articles/201314026-roles-and-permissions-in-slack
     */
    @SerializedName("is_ultra_restricted")
    var isUltraRestricted: Boolean = false

    @SerializedName("is_bot")
    var isBot: Boolean = false

    @SerializedName("is_stranger")
    var isStranger: Boolean = false

    @SerializedName("is_app_user")
    var isAppUser: Boolean = false
    var updated: Long? = null

    @SerializedName("has_2fa")
    var isHas2fa: Boolean = false
    var presence: String? = null // away, etc
    var enterpriseUser: EnterpriseUser? = null
    var twoFactorType: String? = null
    var isHasFiles: Boolean = false
    var locale: String? = null

    @SerializedName("is_workflow_bot")
    var isWorkflowBot: Boolean = false


    class Profile {
        var guestChannels: String? = null
        var guestInvitedBy: String? = null
        var avatarHash: String? = null
        var statusText: String? = null
        var statusTextCanonical: String? = null
        var statusEmoji: String? = null
        var statusExpiration: Long? = null

        var displayName: String? = null
        var displayNameNormalized: String? = null
        var realName: String? = null
        var realNameNormalized: String? = null
        var botId: String? = null

        var title: String? = null
        var email: String? = null
        var skype: String? = null
        var phone: String? = null
        var team: String? = null

        var apiAppId: String? = null
        var isAlwaysActive: Boolean = false

        var imageOriginal: String? = null

        @SerializedName("image_24")
        var image24: String? = null

        @SerializedName("image_32")
        var image32: String? = null

        @SerializedName("image_48")
        var image48: String? = null

        @SerializedName("image_72")
        var image72: String? = null

        @SerializedName("image_192")
        var image192: String? = null

        @SerializedName("image_512")
        var image512: String? = null

        @SerializedName("image_1024")
        var image1024: String? = null

        @SerializedName("is_custom_image")
        var isCustomImage: Boolean = false

        var fields: Map<String, Field>? = null

        class Field {
            var value: String? = null
            var alt: String? = null
            var label: String? = null
        }

        @get:Deprecated("")
        @set:Deprecated("")
        @Deprecated("")
        var firstName: String? = null

        @get:Deprecated("")
        @set:Deprecated("")
        @Deprecated("")
        var lastName: String? = null
    }

    class EnterpriseUser {
        var id: String? = null
        var enterpriseId: String? = null
        var enterpriseName: String? = null

        @SerializedName("is_admin")
        var isAdmin: Boolean = false

        @SerializedName("is_owner")
        var isOwner: Boolean = false
        var teams: List<String>? = null
    }
}
