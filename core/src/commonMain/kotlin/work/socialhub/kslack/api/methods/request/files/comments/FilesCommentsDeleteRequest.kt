package work.socialhub.kslack.api.methods.request.files.comments

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesCommentsDeleteRequest(
    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** File to delete a comment from. */
    var file: String?,
    /** The comment to delete. */
    var id: String?
) : SlackApiRequest