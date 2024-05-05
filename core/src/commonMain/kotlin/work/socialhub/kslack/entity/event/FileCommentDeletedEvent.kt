package work.socialhub.kslack.entity.event

/**
 * The file_comment_deleted event is sent when a file comment is deleted.
 * It is sent to all connected clients for users who can see the file.
 * Clients can use this notification to update comments in real-time for open files.
 *
 *
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 *
 *
 * Unlike file_comment_added and file_comment_edited the comment property only contains the ID of the deleted comment,
 * not the full comment object.
 *
 *
 * https://api.slack.com/events/file_comment_deleted
 */
@Deprecated("") // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
class FileCommentDeletedEvent : Event {
    override val type: String = TYPE_NAME
    var comment: String? = null
    var fileId: String? = null
    var file: File? = null

    class File {
        var id: String? = null
    }

    companion object {
        const val TYPE_NAME: String = "file_comment_deleted"
    }
}