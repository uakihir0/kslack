package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName

/**
 * Represents a [conversation](https://api.slack.com/types/conversation)
 * as used with the `conversations` API
 *
 * @see "https://api.slack.com/docs/conversations-api"
 */
class Conversation {
    var enterpriseId: String? = null
    var id: String? = null
    var name: String? = null
    var created: String? = null
    var creator: String? = null
    var unlinked: Int? = null

    @SerialName("name_normalized")
    var nameNormalized: String? = null

    @SerialName("pending_shared")
    var pendingShared: Array<String>? = null

    @SerialName("last_read")
    var lastRead: String? = null
    var topic: Topic? = null
    var purpose: Purpose? = null

    @SerialName("previous_names")
    var previousNames: Array<String>? = null

    @SerialName("num_members")
    var numOfMembers: Int? = null
    var members: Array<String>? = null
    var latest: Latest? = null
    var locale: String? = null

    @SerialName("unread_count")
    var unreadCount: Int? = null

    @SerialName("unread_count_display")
    var unreadCountDisplay: Int? = null
    var user: String? = null // conversations.open
    var priority: Double? = null

    var sharedTeamIds: Array<String>? = null

    var parentConversation: String? = null
    var pendingConnectedTeamIds: Array<String>? = null

    // shared channels
    var conversationHostId: String? = null
    var internalTeamIds: Array<String>? = null
    var connectedTeamIds: Array<String>? = null

    @SerialName("is_channel")
    var isChannel: Boolean = false

    @SerialName("is_group")
    var isGroup: Boolean = false

    @SerialName("is_im")
    var isIm: Boolean = false

    @SerialName("is_archived")
    var isArchived: Boolean = false

    @SerialName("is_general")
    var isGeneral: Boolean = false

    @SerialName("is_read_only")
    var isReadOnly: Boolean = false

    @SerialName("is_thread_only")
    var isThreadOnly: Boolean = false

    @SerialName("is_non_threadable")
    var isNonThreadable: Boolean = false

    @SerialName("is_shared")
    var isShared: Boolean = false

    @SerialName("is_ext_shared")
    var isExtShared: Boolean = false

    @SerialName("is_org_shared")
    var isOrgShared: Boolean = false

    @SerialName("is_pending_ext_shared")
    var isPendingExtShared: Boolean = false

    @SerialName("is_global_shared")
    var isGlobalShared: Boolean = false

    @SerialName("is_org_default")
    var isOrgDefault: Boolean = false

    @SerialName("is_org_mandatory")
    var isOrgMandatory: Boolean = false

    @SerialName("is_moved")
    var isMoved: Int? = null

    @SerialName("is_member")
    var isMember: Boolean = false

    @SerialName("is_open")
    var isOpen: Boolean = false

    @SerialName("is_private")
    var isPrivate: Boolean = false

    @SerialName("is_mpim")
    var isMpim: Boolean = false
}
