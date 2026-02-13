package work.socialhub.kslack.api.methods.request.files

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class FilesGetUploadURLExternalRequest(
    /** Authentication token. Requires scope: `files:write` */
    override var token: String?,
    /** Name of the file being uploaded. */
    var filename: String?,
    /** Size in bytes of the file being uploaded. */
    var length: Int?,
    /** Description of image for screen-reader. */
    var altTxt: String? = null,
    /** Syntax type of the snippet being uploaded. */
    var snippetType: String? = null,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("filename", filename)
            it.addParam("length", length?.toString())
            it.addParam("alt_txt", altTxt)
            it.addParam("snippet_type", snippetType)
        }
    }
}
