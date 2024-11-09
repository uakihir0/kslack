package work.socialhub.kslack.api.methods.response.files.remote

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.file.File
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesRemoteShareResponse : SlackApiResponse() {
    var file: File? = null
}