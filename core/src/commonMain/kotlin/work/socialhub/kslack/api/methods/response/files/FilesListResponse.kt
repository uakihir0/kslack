package work.socialhub.kslack.api.methods.response.files

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Paging
import work.socialhub.kslack.entity.file.File
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesListResponse : SlackApiResponse() {
    var files: Array<File>? = null
    var paging: Paging? = null
}