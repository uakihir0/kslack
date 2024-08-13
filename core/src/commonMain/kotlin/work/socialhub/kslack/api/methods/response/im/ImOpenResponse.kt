package work.socialhub.kslack.api.methods.response.im

import work.socialhub.kslack.api.model.Channel

class ImOpenResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var isNoOp: Boolean = false
    var isAlreadyOpen: Boolean = false

    var channel: Channel? = null
}