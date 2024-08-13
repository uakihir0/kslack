package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.SlackApiRequest

class FilesRemoteUpdateRequest(
    /** Authentication token. Requires scope: `remote_files:write` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** URL of the remote file. */
    var externalUrl: String?,
    /** Title of the file being shared. */
    var title: String?,
    /** Type of file */
    var filetype: String?,
    /** File containing contents that can be used to improve searchability for the remote file. */
    var indexableFileContents: ByteArray,
    /** Preview of the document via multipart/form-data. */
    var previewImage: ByteArray
) : SlackApiRequest