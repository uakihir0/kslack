package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesRemoteRemoveRequest(
    /** Authentication token. Requires scope: `remote_files:write` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** Specify a file by providing its ID. */
    var file: String?
) : SlackApiRequest