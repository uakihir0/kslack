package work.socialhub.kslack.entity

import com.github.seratch.jslack.api.model.block.LayoutBlock

class Latest {
    var clientMsgId: String? = null

    var type: String? = null
    var subtype: String? = null
    var team: String? = null
    var user: String? = null
    var username: String? = null
    var text: String? = null
    var topic: String? = null // groups
    var attachments: List<Attachment>? = null
    var blocks: List<LayoutBlock>? = null
    var files: List<File>? = null
    var reactions: List<Reaction>? = null
    var root: Message.MessageRoot? = null
    var isUpload: Boolean = false
    var isDisplayAsBot: Boolean = false
    var botId: String? = null
    var botLink: String? = null
    var threadTs: String? = null
    var ts: String? = null
    var icons: Message.Icons? = null
    var xFiles: List<String>? = null
}
