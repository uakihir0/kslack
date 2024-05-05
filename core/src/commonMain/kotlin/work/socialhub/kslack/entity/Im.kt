package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * https://api.slack.com/types/im
 */
class Im {
    var id: String? = null

    @SerializedName("is_im")
    var isIm: Boolean = false
    var user: String? = null
    var created: Int? = null

    @SerializedName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerializedName("is_user_deleted")
    var isUser_deleted: Boolean = false

    @SerializedName("is_archived")
    var isArchived: Boolean = false
    var priority: Double? = null
    var latest: String? = null
}
