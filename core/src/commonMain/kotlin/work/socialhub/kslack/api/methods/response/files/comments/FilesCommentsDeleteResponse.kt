package work.socialhub.kslack.api.methods.response.files.comments

import work.socialhub.kslack.api.methods.SlackApiResponse

class FilesCommentsDeleteResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}