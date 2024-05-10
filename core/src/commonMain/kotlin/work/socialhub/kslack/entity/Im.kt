package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/types/im
 */
@JsExport
@Serializable
class Im {

    var id: String? = null

    @SerialName("is_im")
    var im = false

    var user: String? = null
    var created: Int? = null

    @SerialName("is_org_shared")
    var orgShared = false

    @SerialName("is_user_deleted")
    var userDeleted = false

    @SerialName("is_archived")
    var archived = false

    @SerialName("is_shared")
    var shared = false

    @SerialName("is_ext_shared")
    var extShared = false

    var priority: Double? = null
}
