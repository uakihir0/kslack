package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesSharedPublicURLRequest(

    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** File to share */
    var file: String?
) : SlackApiRequest