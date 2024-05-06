package com.github.seratch.jslack.api.methods.response.files.remote

import com.github.seratch.jslack.api.methods.SlackApiResponse

class FilesRemoteRemoveResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null
}