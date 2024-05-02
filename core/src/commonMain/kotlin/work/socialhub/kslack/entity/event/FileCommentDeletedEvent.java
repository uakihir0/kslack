package work.socialhub.kslack.entity.event;

/**
 * The file_comment_deleted event is sent when a file comment is deleted.
 * It is sent to all connected clients for users who can see the file.
 * Clients can use this notification to update comments in real-time for open files.
 * <p>
 * The file property includes the file ID, as well as a top-level file_id.
 * To obtain additional information about the file, use the files.info API method.
 * <p>
 * Unlike file_comment_added and file_comment_edited the comment property only contains the ID of the deleted comment,
 * not the full comment object.
 * <p>
 * https://api.slack.com/events/file_comment_deleted
 */
@Deprecated // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
public class FileCommentDeletedEvent implements Event {

    public static final String TYPE_NAME = "file_comment_deleted";

    private final String type = TYPE_NAME;
    private String comment;
    private String fileId;
    private File file;

    public String getType() {
        return this.type;
    }

    public String getComment() {
        return this.comment;
    }

    public String getFileId() {
        return this.fileId;
    }

    public File getFile() {
        return this.file;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public static class File {
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}