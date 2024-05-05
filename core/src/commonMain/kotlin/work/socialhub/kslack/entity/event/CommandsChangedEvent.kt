package work.socialhub.kslack.entity.event

/**
 * The commands_changed event is sent to all connections for a workspace when a slash command for that workspace is added, removed or changed.
 *
 *
 * This functionality is only used by our web client.
 * The other APIs required to support slash command metadata are currently unstable.
 * Until they are released other clients should ignore this event.
 *
 *
 * https://api.slack.com/events/commands_changed
 */
class CommandsChangedEvent : Event {
    override val type: String = TYPE_NAME
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "commands_changed"
    }
}