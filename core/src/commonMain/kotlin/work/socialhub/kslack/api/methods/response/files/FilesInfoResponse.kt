package com.github.seratch.jslack.api.methods.response.files

import com.github.seratch.jslack.api.model.File

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

    @SerializedName("is_truncated")
    var isTruncated: Boolean = false
    var comments: List<FileComment>? = null
    var paging: Paging? = null
}