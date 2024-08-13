package work.socialhub.kslack.api.methods.response.files.remote

import work.socialhub.kslack.api.model.File

class FilesRemoteAddResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var file: File? = null
}