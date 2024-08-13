package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesDeleteRequest(
    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** ID of file to delete. */
    var file: String?
) : SlackApiRequest