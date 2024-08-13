package work.socialhub.kslack.api.methods.response.files.remote

import work.socialhub.kslack.api.model.File

class FilesRemoteListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var files: Array<File>? = null
    var responseMetadata: ResponseMetadata? = null
}