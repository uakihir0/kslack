package work.socialhub.kslack.entity

import com.github.seratch.jslack.api.model.block.LayoutBlock
import work.socialhub.kslack.entity.message.Message

class Latest {
    var clientMsgId: String? = null

    var type: String? = null
    var subtype: String? = null
    var team: String? = null
    var user: String? = null
    var username: String? = null
    var text: String? = null
    var topic: String? = null // groups
    var attachments: Array<Attachment>? = null
    var blocks: Array<LayoutBlock>? = null
    var files: Array<File>? = null
    var reactions: Array<Reaction>? = null
    var root: Message.MessageRoot? = null
    var isUpload: Boolean = false
    var isDisplayAsBot: Boolean = false
    var botId: String? = null
    var botLink: String? = null
    var threadTs: String? = null
    var ts: String? = null
    var icons: Message.Icons? = null
    var xFiles: Array<String>? = null
}
