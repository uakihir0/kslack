package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kmastodon.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.bot.BotProfile
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.message.Message
import work.socialhub.kslack.entity.message.MessageIcons
import work.socialhub.kslack.entity.message.MessageRoot
import kotlin.js.JsExport

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
