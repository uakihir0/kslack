package work.socialhub.kslack.api.methods.response.usergroups

import work.socialhub.kslack.api.model.Usergroup

class UsergroupsEnableResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var usergroup: Usergroup? = null
}