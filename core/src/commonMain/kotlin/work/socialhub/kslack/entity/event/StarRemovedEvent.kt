package work.socialhub.kslack.entity.event

import com.github.seratch.jslack.api.model.Attachment

/**
 *
 */
class StarRemovedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var item: Item? = null
    var eventTs: String? = null

    class Item {
        var type: String? = null
        var channel: String? = null
        var createdBy: String? = null // user id
        var created: Int? = null

        var message: Message? = null
        var file: File? = null // TODO: correct definition
        var comment: FileComment? = null // TODO: correct definition
    }

    class Message {
        var clientMsgId: String? = null
        var type: String? = null
        var user: String? = null
        var text: String? = null
        var blocks: List<LayoutBlock>? = null
        var attachments: List<Attachment>? = null
        var ts: String? = null
        var pinnedTo: List<String>? = null
        var permalink: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "star_removed"
    }
}