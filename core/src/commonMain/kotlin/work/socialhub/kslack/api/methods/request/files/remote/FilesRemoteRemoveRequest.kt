package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class FilesRemoteRemoveRequest(
    /** Authentication token. Requires scope: `remote_files:write` */
    override var token: String?,
    /** Creator defined GUID for the file. */
    var externalId: String?,
    /** Specify a file by providing its ID. */
    var file: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("external_id", externalId)
            it.addParam("file", file)
        }
    }
}