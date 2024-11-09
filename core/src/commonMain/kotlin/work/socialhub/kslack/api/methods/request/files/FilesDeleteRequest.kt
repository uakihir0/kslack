package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class FilesDeleteRequest(
    /** Authentication token. Requires scope: `files:write:user` */
    override var token: String?,
    /** ID of file to delete. */
    var file: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("file", file)
        }
    }
}