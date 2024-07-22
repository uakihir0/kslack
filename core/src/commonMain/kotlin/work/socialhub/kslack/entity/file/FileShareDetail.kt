package work.socialhub.kslack.entity.file

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class FileShareDetail {
    var replyUsers: Array<String>? = null
    var replyUsersCount: Int? = null
    var replyCount: Int? = null
    var ts: String? = null
    var threadTs: String? = null
    var latestReply: String? = null
    var channelName: String? = null
    var teamId: String? = null
}