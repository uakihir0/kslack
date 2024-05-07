package work.socialhub.kslack.entity.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/types/user
 * https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/User.java
 */
@JsExport
@Serializable
class Profile {

    @SerialName("guest_channels")
    var guestChannels: String? = null

    @SerialName("guest_invited_by")
    val guestInvitedBy: String? = null

    @SerialName("guest_expiration_ts")
    var guestExpirationTs: Int? = null

    @SerialName("avatar_hash")
    var avatarHash: String? = null

    @SerialName("status_text")
    var statusText: String? = null

    @SerialName("status_text_canonical")
    var statusTextCanonical: String? = null

    @SerialName("status_emoji")
    var statusEmoji: String? = null

    @SerialName("status_emoji_url")
    var statusEmojiUrl: String? = null

    @SerialName("status_expiration")
    var statusExpiration: Int? = null


    @SerialName("display_name")
    var displayName: String? = null

    @SerialName("display_name_normalized")
    var displayNameNormalized: String? = null

    @SerialName("real_name")
    var realName: String? = null

    @SerialName("real_name_normalized")
    var realNameNormalized: String? = null

    @SerialName("bot_id")
    var botId: String? = null


    var title: String? = null
    var email: String? = null
    var skype: String? = null
    var phone: String? = null
    var team: String? = null


    @SerialName("api_app_id")
    var apiAppId: String? = null

    @SerialName("always_active")
    var isAlwaysActive: Boolean = false


    @SerialName("image_original")
    var imageOriginal: String? = null


    @SerialName("image_24")
    var image24: String? = null

    @SerialName("image_32")
    var image32: String? = null

    @SerialName("image_48")
    var image48: String? = null

    @SerialName("image_72")
    var image72: String? = null

    @SerialName("image_192")
    var image192: String? = null

    @SerialName("image_512")
    var image512: String? = null

    @SerialName("image_1024")
    var image1024: String? = null


    @SerialName("is_custom_image")
    var isCustomImage: Boolean = false


    var pronouns: String? = null

    @SerialName("status_emoji_display_info")
    var statusEmojiDisplayInfo: Array<StatusEmojiDisplayInfo>? = null

    @Suppress("NON_EXPORTABLE_TYPE")
    var fields: Map<String, ProfileField>? = null


    @SerialName("huddle_state")
    val huddleState: String? = null // "default_unset" etc.

    @SerialName("huddle_state_expiration_ts")
    val huddleStateExpirationTs: Int? = null


    @SerialName("first_name")
    @Deprecated("")
    var firstName: String? = null

    @SerialName("last_name")
    @Deprecated("")
    var lastName: String? = null
}