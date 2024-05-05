package work.socialhub.kslack.entity.event

/**
 * When a reaction is removed from an item the reaction_removed event is sent to all connected clients
 * for users who can see the content that had the reaction.
 *
 *
 * The user field indicates the ID of the user who performed this event.
 * The item_user field represents the ID of the user that created the original item that has been reacted to.
 *
 *
 * Some messages aren't authored by "users," like those created by incoming webhooks.
 * reaction_removed events related to these messages will not include an item_user.
 *
 *
 * The item field is a brief reference to what the reaction was attached to.
 * The above example describes a reaction being removed from a message.
 *
 *
 * https://api.slack.com/events/reaction_removed
 */
class ReactionRemovedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var reaction: String? = null
    var itemUser: String? = null
    var item: Item? = null
    var eventTs: String? = null

    class Item {
        var type: String? = null
        var channel: String? = null
        var ts: String? = null

        var file: String? = null // "type": "file" or "type": "file_comment"
        var fileComment: String? = null // "type": "file_comment"
    }

    companion object {
        const val TYPE_NAME: String = "reaction_removed"
    }
}