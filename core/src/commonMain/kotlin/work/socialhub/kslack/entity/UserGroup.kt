package work.socialhub.kslack.entity

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
    var teamId: String? = null
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

    var isAutoProvision: Boolean = false
    var dateCreate: Int? = null
    var dateUpdate: Int? = null
    var dateDelete: Int? = null
    var autoType: String? = null
    var createdBy: String? = null
    var updatedBy: String? = null
    var deletedBy: String? = null
    var prefs: Prefs? = null
    var users: Array<String>? = null
    var userCount: Int? = null
}