package work.socialhub.kslack.entity.message

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * The root message information of a "thread_broadcast" message.
 */
@JsExport
@Serializable
class MessageRoot {
    var text: String? = null
    var username: String? = null
    var botId: String? = null
    var isMrkdwn: Boolean = false
    var type: String? = null
    var subtype: String? = null
    var threadTs: String? = null

    var replyCount: Int? = null
    var replyUsers: Array<String>? = null
    var replyUsersCount: Int? = null
    var latestReply: String? = null // ts

    var isSubscribed: Boolean = false
    var lastRead: String? = null
    var unreadCount: Int? = null
    var ts: String? = null
}