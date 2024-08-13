package work.socialhub.kslack.api.methods.response.groups

import work.socialhub.kslack.api.model.Channel

class GroupsRenameResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var channel: Channel? = null
}