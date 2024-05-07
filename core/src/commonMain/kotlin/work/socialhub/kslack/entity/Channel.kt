package work.socialhub.kslack.entity

import com.google.gson.annotations.SerialName

class Channel {
    var enterpriseId: String? = null
    var id: String? = null
    var name: String? = null
    var nameNormalized: String? = null
    var created: Int? = null
    var creator: String? = null

    @SerialName("is_read_only")
    var isReadOnly: Boolean = false

    @SerialName("is_thread_only")
    var isThreadOnly: Boolean = false

    @SerialName("is_archived")
    var isArchived: Boolean = false

    @SerialName("is_member")
    var isMember: Boolean = false

    @SerialName("is_general")
    var isGeneral: Boolean = false

    @SerialName("is_channel")
    var isChannel: Boolean = false

    @SerialName("is_group")
    var isGroup: Boolean = false

    @SerialName("is_im")
    var isIm: Boolean = false

    @SerialName("is_private")
    var isPrivateChannel: Boolean = false

    @SerialName("is_mpim")
    var isMpim: Boolean = false

    @SerialName("is_shared")
    var isShared: Boolean = false

    @SerialName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerialName("is_global_shared")
    var isGlobalShared: Boolean = false

    @SerialName("is_org_default")
    var isOrgDefault: Boolean = false

    @SerialName("is_org_mandatory")
    var isOrgMandatory: Boolean = false

    @SerialName("is_moved")
    var isMoved: Int? = null

    @SerialName("is_ext_shared") // search result
    var isExtShared: Boolean = false

    @SerialName("is_pending_ext_shared") // search result
    var isPendingExtShared: Boolean = false
    var pendingShared: Array<String>? = null // search result

    var lastRead: String? = null
    var latest: Latest? = null
    var unreadCount: Int? = null
    var unreadCountDisplay: Int? = null
    var unlinked: Int? = null
    var members: Array<String>? = null
    var topic: Topic? = null
    var purpose: Purpose? = null
    var user: String? = null
    var previousNames: Array<String>? = null
    var numMembers: Int? = null
    var priority: Double? = null
}
