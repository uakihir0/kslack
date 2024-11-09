package work.socialhub.kslack.entity.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kmastodon.entity.Attachment
import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.Reaction
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.bot.BotProfile
import work.socialhub.kslack.entity.file.File
import kotlin.js.JsExport

@JsExport
@Serializable
class Message {
    var type: String? = null
    var subtype: String? = null

    var team: String? = null // team id
    var channel: String? = null

    var user: String? = null
    var username: String? = null

    var text: String? = null
    var blocks: Array<LayoutBlock>? = null
    var attachments: Array<Attachment>? = null

    var ts: String? = null
    var threadTs: String? = null

    @SerialName("is_intro")
    var isIntro: Boolean = false

    @SerialName("is_starred")
    var isStarred: Boolean = false
    var isWibblr: Boolean = false
    var pinnedTo: Array<String>? = null
    var reactions: Array<Reaction>? = null

    var botId: String? = null
    var botLink: String? = null
    var isDisplayAsBot: Boolean = false

    var botProfile: BotProfile? = null

    var icons: MessageIcons? = null

    var file: File? = null
    var files: Array<File>? = null
    var isUpload: Boolean = false

    var parentUserId: String? = null
    var inviter: String? = null
    var clientMsgId: String? = null

    var comment: MessageItem? = null
    var topic: String? = null // "subtype":"channel_topic"
    var purpose: String? = null // "subtype":"channel_topic"

    // field exists only if the message was edited
    var edited: MessageEdited? = null

    // https://api.slack.com/docs/message-link-unfurling
    var isUnfurlLinks: Boolean = false
    var isUnfurlMedia: Boolean = false

    @SerialName("is_thread_broadcast")
    var isThreadBroadcast: Boolean = false

    var replyCount: Int? = null

    var replyUsers: Array<String>? = null
    var replyUsersCount: Int? = null

    var latestReply: String? = null // ts

    var isSubscribed: Boolean = false

    var xFiles: Array<String>? = null // remote file ids

    var lastRead: String? = null

    // this field exists only when posting the message with "reply_broadcast": true
    var root: MessageRoot? = null

    var itemType: String? = null
    var item: MessageItem? = null
}