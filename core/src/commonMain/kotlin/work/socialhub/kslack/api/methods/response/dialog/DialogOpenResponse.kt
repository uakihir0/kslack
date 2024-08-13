package work.socialhub.kslack.api.methods.response.dialog

import work.socialhub.kslack.api.model.dialog.DialogResponseMetadata

class DialogOpenResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var responseMetadata: DialogResponseMetadata? = null
}
