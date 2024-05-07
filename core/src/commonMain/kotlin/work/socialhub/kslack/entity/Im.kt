package work.socialhub.kslack.entity

import com.google.gson.annotations.SerialName

/**
 * https://api.slack.com/types/im
 */
class Im {
    var id: String? = null

    @SerialName("is_im")
    var isIm: Boolean = false
    var user: String? = null
    var created: Int? = null

    @SerialName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerialName("is_user_deleted")
    var isUser_deleted: Boolean = false

    @SerialName("is_archived")
    var isArchived: Boolean = false
    var priority: Double? = null
    var latest: String? = null
}
