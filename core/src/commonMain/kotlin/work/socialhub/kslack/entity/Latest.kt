package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.bot.BotProfile
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.message.MessageIcons
import work.socialhub.kslack.entity.message.MessageRoot
import kotlin.js.JsExport

/**
 * Represents the latest message in a channel, including its metadata, content,
 * and associated objects like attachments, blocks, files, and reactions.
 *
 * Used in channel listing responses to provide a preview of the most recent
 * activity. Contains both the message content and flags indicating its type
 * (bot message, upload, thread, etc.).
 *
 * @see <a href="https://api.slack.com/types/message">Message type reference</a>
 */
@JsExport
@Serializable
class Latest {

    @SerialName("client_msg_id")
    var clientMsgId: String? = null

    var type: String? = null
    var subtype: String? = null
    var team: String? = null
    var user: String? = null
    var username: String? = null

    @SerialName("parent_user_id")
    var parentUserId: String? = null

    var text: String? = null
    var topic: String? = null // groups

    var attachments: Array<Attachment>? = null
    var blocks: Array<LayoutBlock>? = null
    var files: Array<File>? = null
    var reactions: Array<Reaction>? = null
    var root: MessageRoot? = null

    @SerialName("upload")
    var isUpload: Boolean = false

    @SerialName("display_as_bot")
    var isDisplayAsBot: Boolean = false

    @SerialName("app_id")
    var appId: String? = null

    @SerialName("bot_id")
    var botId: String? = null

    @SerialName("bot_link")
    var botLink: String? = null

    @SerialName("bot_profile")
    var botProfile: BotProfile? = null

    @SerialName("thread_ts")
    var threadTs: String? = null

    var ts: String? = null
    var icons: MessageIcons? = null

    @SerialName("x_files")
    var xFiles: Array<String>? = null

    var edited: Edited? = null
}
