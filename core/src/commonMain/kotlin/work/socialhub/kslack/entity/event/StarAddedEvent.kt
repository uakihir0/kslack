package work.socialhub.kslack.entity.event

import work.socialhub.kslack.entity.Attachment
import work.socialhub.kslack.entity.block.LayoutBlock
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.file.FileComment

/**
 * When an item is starred, the star_added event is sent to all connected clients for the authenticated user who starred the item.
 *
 *
 * See the stars.list method for details of the structure of the item property.
 *
 *
 * https://api.slack.com/events/star_added
 */
class StarAddedEvent : Event {
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
        var blocks: Array<LayoutBlock>? = null
        var attachments: Array<Attachment>? = null
        var ts: String? = null
        var pinnedTo: Array<String>? = null
        var permalink: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "star_added"
    }
}