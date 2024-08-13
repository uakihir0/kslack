package work.socialhub.kslack.api.methods.response.usergroups

import work.socialhub.kslack.api.model.Usergroup

class UsergroupsCreateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null // "usergroups:write"
    var provided: String? = null // some permissions

    var usergroup: Usergroup? = null
}