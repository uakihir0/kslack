package work.socialhub.kslack.api.methods.response.files

import work.socialhub.kslack.api.model.File

class FilesInfoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var file: File? = null
    var content: String? = null
    var contentHighlightHtml: String? = null
    var contentHighlightCss: String? = null

    @SerialName("is_truncated")
    var isTruncated: Boolean = false
    var comments: Array<FileComment>? = null
    var paging: Paging? = null
}