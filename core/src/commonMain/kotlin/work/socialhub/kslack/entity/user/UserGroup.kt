package work.socialhub.kslack.entity.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/types/usergroup
 */
@JsExport
@Serializable
class UserGroup {

    var id: String? = null

    @SerialName("team_id")
    var teamId: String? = null

    @SerialName("enterprise_subteam_id")
    var enterpriseSubteamId: String? = null

    @SerialName("is_usergroup")
    var isUsergroup: Boolean = false

    @SerialName("is_subteam")
    var isSubteam: Boolean = false

    var name: String? = null
    var description: String? = null
    var handle: String? = null

    @SerialName("is_external")
    var isExternal: Boolean = false

    @SerialName("auto_provision")
    var isAutoProvision: Boolean = false

    @SerialName("date_create")
    var dateCreate: Int? = null

    @SerialName("date_update")
    var dateUpdate: Int? = null

    @SerialName("date_delete")
    var dateDelete: Int? = null

    @SerialName("auto_type")
    var autoType: String? = null

    @SerialName("created_by")
    var createdBy: String? = null

    @SerialName("updated_by")
    var updatedBy: String? = null

    @SerialName("deleted_by")
    var deletedBy: String? = null

    var prefs: Prefs? = null
    var users: Array<String>? = null

    @SerialName("user_count")
    var userCount: Int? = null

    @SerialName("channel_count")
    val channelCount: Int? = null
}