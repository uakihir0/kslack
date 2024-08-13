package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/files.remote.info
 */
class FilesRemoteInfoRequest(
    /** Authentication token. Requires scope: `remote_files:read` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** Specify a file by providing its ID. */
    var file: String?
) : SlackApiRequest