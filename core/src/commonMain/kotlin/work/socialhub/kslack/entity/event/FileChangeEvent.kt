package work.socialhub.kslack.entity.event

/**
 * The file_change event is sent when any property of a file is changed.
 * It is sent to all connected clients for all users that have permission to see the file.
 *
 *
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 *
 *
 * https://api.slack.com/events/file_change
 */
class FileChangeEvent : Event {
    override val type: String = TYPE_NAME
    var fileId: String? = null
    var file: File? = null

    class File {
        var id: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "file_change"
    }
}