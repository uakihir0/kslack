package work.socialhub.kslack.api.methods.response.mpim

import work.socialhub.kslack.api.model.Group

class MpimListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var groups: Array<Group>? = null
}