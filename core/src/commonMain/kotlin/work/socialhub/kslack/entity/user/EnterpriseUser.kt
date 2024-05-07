package work.socialhub.kslack.entity.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class EnterpriseUser {

    @SerialName("id")
    var id: String? = null

    @SerialName("enterprise_id")
    var enterpriseId: String? = null

    @SerialName("enterprise_name")
    var enterpriseName: String? = null

    @SerialName("is_primary_owner")
    var primaryOwner = false

    @SerialName("is_admin")
    var isAdmin: Boolean = false

    @SerialName("is_owner")
    var isOwner: Boolean = false

    @SerialName("teams")
    var teams: Array<String>? = null
}