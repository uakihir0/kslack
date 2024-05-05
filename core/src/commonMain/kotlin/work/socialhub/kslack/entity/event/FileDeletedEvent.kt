package work.socialhub.kslack.entity.event

/**
 * The file_deleted event is sent to all connected clients for a workspace when a file is deleted. Unlike most file events,
 * the file property contains a file ID and not a full file object.
 *
 *
 * https://api.slack.com/events/file_deleted
 */
class FileDeletedEvent : Event {
    override val type: String = TYPE_NAME
    var fileId: String? = null
    var eventTs: String? = null

    companion object {
        const val TYPE_NAME: String = "file_deleted"
    }
}