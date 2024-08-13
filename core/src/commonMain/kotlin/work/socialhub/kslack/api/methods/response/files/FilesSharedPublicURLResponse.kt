package work.socialhub.kslack.api.methods.response.files

import work.socialhub.kslack.api.model.File

class FilesSharedPublicURLResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var file: File? = null
    var comments: Array<FileComment>? = null
    var paging: Paging? = null
}