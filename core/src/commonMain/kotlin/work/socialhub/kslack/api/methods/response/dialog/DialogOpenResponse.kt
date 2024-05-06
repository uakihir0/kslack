package com.github.seratch.jslack.api.methods.response.dialog

import com.github.seratch.jslack.api.model.dialog.DialogResponseMetadata

class DialogOpenResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var responseMetadata: DialogResponseMetadata? = null
}
