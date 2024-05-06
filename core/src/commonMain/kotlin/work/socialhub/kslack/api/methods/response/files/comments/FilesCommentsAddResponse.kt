package com.github.seratch.jslack.api.methods.response.files.comments

import com.github.seratch.jslack.api.model.FileComment

class FilesCommentsAddResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var reqMethod: String? = null

    var comment: FileComment? = null
}