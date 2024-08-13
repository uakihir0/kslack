package work.socialhub.kslack.api.methods.response.channels

import work.socialhub.kslack.api.methods.SlackApiResponse

class ChannelsSetPurposeResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var purpose: String? = null
}
