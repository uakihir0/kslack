package work.socialhub.kslack.api.methods.request.files.comments

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesCommentsAddRequest(
    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** File to add a comment to. */
    var file: String?,
    /** Text of the comment to add. */
    var comment: String?
) : SlackApiRequest