package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesRemoteShareRequest(
    /** Authentication token. Requires scope: `remote_files:write` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** Specify a file by providing its ID. */
    var file: String?,
    /** Comma-separated list of channel IDs where the file will be shared. */
    var channels: Array<String>?
) : SlackApiRequest