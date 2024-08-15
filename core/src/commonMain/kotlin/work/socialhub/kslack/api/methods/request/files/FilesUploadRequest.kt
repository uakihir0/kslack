package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesUploadRequest(

    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,

    /** File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`. */
    var file: ByteArray,
    /** File contents via a POST variable. If omitting this parameter, you must provide a `file`. */
    var content: String?,

    /** A [file type](/types/file#file_types) identifier. */
    var filetype: String?,
    /** Filename of file. */
    var filename: String?,
    /** Title of file. */
    var title: String?,

    /** Initial comment to add to file. */
    var initialComment: String?,
    /** Comma-separated list of channel names or IDs where the file will be shared. */
    var channels: Array<String>?,
    /** Provide another message's ts value to upload this file as a reply. Never use a reply's ts value; use its parent instead. */
    var threadTs: String?,

    ) : SlackApiRequest