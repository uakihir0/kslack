package com.github.seratch.jslack.api.methods.response.files

import com.github.seratch.jslack.api.model.File

class FilesListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var files: Array<File>? = null
    var paging: Paging? = null
}