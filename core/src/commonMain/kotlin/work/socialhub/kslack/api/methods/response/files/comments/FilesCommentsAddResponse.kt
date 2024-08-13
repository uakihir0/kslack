package work.socialhub.kslack.api.methods.response.files.comments

import work.socialhub.kslack.api.model.FileComment

class FilesCommentsAddResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var reqMethod: String? = null

    var comment: FileComment? = null
}