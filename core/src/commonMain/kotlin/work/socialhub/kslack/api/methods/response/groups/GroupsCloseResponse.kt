package work.socialhub.kslack.api.methods.response.groups

import work.socialhub.kslack.api.methods.SlackApiResponse

class GroupsCloseResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var isNoOp: Boolean = false
    var isAlreadyClosed: Boolean = false
}