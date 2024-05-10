package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/types/group
 */
@JsExport
@Serializable
class Group {

    var id: String? = null
    var name: String? = null

    @SerialName("name_normalized")
    var nameNormalized: String? = null

    @SerialName("is_group")
    var isGroup: Boolean = false

    var created: Int? = null
    var creator: String? = null

    @SerialName("is_archived")
    var isArchived: Boolean = false

    @SerialName("is_mpim")
    var isMpim: Boolean = false

    @SerialName("is_open")
    var isOpen: Boolean = false

    @SerialName("is_read_only")
    var isReadOnly: Boolean = false

    @SerialName("is_thread_only")
    var isThreadOnly: Boolean = false

    var members: Array<String>? = null

    @SerialName("parent_group")
    var parentGroup: String? = null // group id

    var topic: Topic? = null
    var purpose: Purpose? = null

    @SerialName("last_read")
    var lastRead: String? = null

    var latest: Latest? = null

    @SerialName("unread_count")
    var unreadCount: Int? = null

    @SerialName("unread_count_display")
    var unreadCountDisplay: Int? = null

    var priority: Double? = null
}