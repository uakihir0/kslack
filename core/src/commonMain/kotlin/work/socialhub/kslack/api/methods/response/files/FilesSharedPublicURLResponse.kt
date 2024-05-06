package com.github.seratch.jslack.api.methods.response.files

import com.github.seratch.jslack.api.model.File

class FilesSharedPublicURLResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var file: File? = null
    var comments: List<FileComment>? = null
    var paging: Paging? = null
}