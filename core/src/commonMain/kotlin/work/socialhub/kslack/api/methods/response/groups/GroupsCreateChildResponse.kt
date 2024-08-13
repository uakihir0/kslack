package work.socialhub.kslack.api.methods.response.groups

import work.socialhub.kslack.api.model.Group

class GroupsCreateChildResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var group: Group? = null
}