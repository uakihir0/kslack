package com.github.seratch.jslack.api.methods.response.files.remote

import com.github.seratch.jslack.api.model.File

class FilesRemoteListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var files: Array<File>? = null
    var responseMetadata: ResponseMetadata? = null
}