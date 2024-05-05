package work.socialhub.kslack.entity.event

/**
 * The file_unshared event is sent when a file is unshared.
 * It is sent to all connected clients for all users that had permission to see the file.
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the unshared file, use the files.info API method.
 *
 *
 * https://api.slack.com/events/goodbye
 */
class GoodbyeEvent : Event {
    override val type: String = TYPE_NAME

    companion object {
        const val TYPE_NAME: String = "goodbye"
    }
}