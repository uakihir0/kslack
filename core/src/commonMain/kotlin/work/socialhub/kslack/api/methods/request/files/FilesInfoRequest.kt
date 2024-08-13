package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesInfoRequest(
    /** Authentication token. Requires scope: `files:read` */
    override var token: String?,
    /** Specify a file by providing its ID. */
    var file: String?,
    var count: Int?,
    var page: Int?
) : SlackApiRequest