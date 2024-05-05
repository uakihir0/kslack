package work.socialhub.kslack.entity.event

/**
 * The file_created event is sent to all connected clients for a user when that user uploads a file to Slack.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 *
 *
 * When a file is shared with other members of the workspace (which can happen at upload time)
 * a file_shared event will also be sent.
 *
 *
 * https://api.slack.com/events/file_created
 */
class FileCreatedEvent : Event {
    override val type: String = TYPE_NAME
    var fileId: String? = null
    var file: File? = null

    class File {
        var id: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "file_created"
    }
}