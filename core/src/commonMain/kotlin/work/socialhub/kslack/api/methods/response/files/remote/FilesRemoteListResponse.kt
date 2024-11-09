package work.socialhub.kslack.api.methods.response.files.remote

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.file.File
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesRemoteListResponse : SlackApiResponse() {
    var files: Array<File>? = null
    var responseMetadata: ResponseMetadata? = null
}