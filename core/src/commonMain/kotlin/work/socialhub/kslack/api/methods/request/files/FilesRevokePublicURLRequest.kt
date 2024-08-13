package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesRevokePublicURLRequest(

    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** File to revoke */
    var file: String?
) : SlackApiRequest