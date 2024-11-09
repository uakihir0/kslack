package work.socialhub.kslack.api.methods.response.files

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Paging
import work.socialhub.kslack.entity.file.File
import work.socialhub.kslack.entity.file.FileComment
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesSharedPublicURLResponse : SlackApiResponse() {
    var file: File? = null
    var comments: Array<FileComment>? = null
    var paging: Paging? = null
}