package work.socialhub.kslack.entity.event

/**
 * The dnd_updated event is sent to the current user when their Do Not Disturb settings have changed.
 *
 *
 * This event is not available to bot user subscriptions in the Events API.
 *
 *
 * https://api.slack.com/events/dnd_updated
 */
class DndUpdatedEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var dndStatus: DndStatus? = null

    class DndStatus {
        var isDndEnabled: Boolean = false
        var nextDndStartTs: Int? = null
        var nextDndEndTs: Int? = null
        var isSnoozeEnabled: Boolean = false
        var snoozeEndtime: Int? = null
    }

    companion object {
        const val TYPE_NAME: String = "dnd_updated"
    }
}