package work.socialhub.kslack.entity.event

/**
 * The dnd_updated_user event is sent to all connections for a workspace when a user's Do Not Disturb settings have changed.
 *
 *
 * https://api.slack.com/events/dnd_updated_user
 */
class DndUpdatedUserEvent : Event {
    override val type: String = TYPE_NAME
    var user: String? = null
    var dndStatus: DndStatus? = null

    class DndStatus {
        var isDndEnabled: Boolean = false
        var nextDndStartTs: Int? = null
        var nextDndEndTs: Int? = null
    }

    companion object {
        const val TYPE_NAME: String = "dnd_updated_user"
    }
}