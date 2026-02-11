package work.socialhub.kslack.api.methods.response.files

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesGetUploadURLExternalResponse : SlackApiResponse() {
    var uploadUrl: String? = null
    var fileId: String? = null
}
