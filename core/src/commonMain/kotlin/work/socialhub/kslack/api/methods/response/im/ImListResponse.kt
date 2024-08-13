package work.socialhub.kslack.api.methods.response.im

import work.socialhub.kslack.api.model.Im

class ImListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var ims: Array<Im>? = null
    var responseMetadata: ResponseMetadata? = null
}
