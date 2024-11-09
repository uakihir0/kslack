package work.socialhub.kslack.api.methods.response.files.comments

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.file.FileComment
import kotlin.js.JsExport

@JsExport
@Serializable
class FilesCommentsEditResponse : SlackApiResponse() {
    var comment: FileComment? = null
}