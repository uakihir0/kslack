package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

class Channel {
    var enterpriseId: String? = null
    var id: String? = null
    var name: String? = null
    var nameNormalized: String? = null
    var created: Int? = null
    var creator: String? = null

    @SerializedName("is_read_only")
    var isReadOnly: Boolean = false

    @SerializedName("is_thread_only")
    var isThreadOnly: Boolean = false

    @SerializedName("is_archived")
    var isArchived: Boolean = false

    @SerializedName("is_member")
    var isMember: Boolean = false

    @SerializedName("is_general")
    var isGeneral: Boolean = false

    @SerializedName("is_channel")
    var isChannel: Boolean = false

    @SerializedName("is_group")
    var isGroup: Boolean = false

    @SerializedName("is_im")
    var isIm: Boolean = false

    @SerializedName("is_private")
    var isPrivateChannel: Boolean = false

    @SerializedName("is_mpim")
    var isMpim: Boolean = false

    @SerializedName("is_shared")
    var isShared: Boolean = false

    @SerializedName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerializedName("is_global_shared")
    var isGlobalShared: Boolean = false

    @SerializedName("is_org_default")
    var isOrgDefault: Boolean = false

    @SerializedName("is_org_mandatory")
    var isOrgMandatory: Boolean = false

    @SerializedName("is_moved")
    var isMoved: Int? = null

    @SerializedName("is_ext_shared") // search result
    var isExtShared: Boolean = false

    @SerializedName("is_pending_ext_shared") // search result
    var isPendingExtShared: Boolean = false
    var pendingShared: List<String>? = null // search result

    var lastRead: String? = null
    var latest: Latest? = null
    var unreadCount: Int? = null
    var unreadCountDisplay: Int? = null
    var unlinked: Int? = null
    var members: List<String>? = null
    var topic: Topic? = null
    var purpose: Purpose? = null
    var user: String? = null
    var previousNames: List<String>? = null
    var numMembers: Int? = null
    var priority: Double? = null
}
