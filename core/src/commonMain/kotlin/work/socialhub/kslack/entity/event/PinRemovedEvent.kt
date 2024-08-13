package work.socialhub.kslack.entity.event

import work.socialhub.kslack.api.model.Attachment

/**
 * When an item is un-pinned from a channel, the pin_removed event is sent to all members of that channel.
 *
 *
 * The has_pins property indicates that there are other pinned items in that channel.
 *
 *
 * https://api.slack.com/events/pin_removed
 */
class PinRemovedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var channelId: String? = null
    var item: Item? = null
    var isHasPins: Boolean = false
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
        const val TYPE_NAME: String = "pin_removed"
    }
}