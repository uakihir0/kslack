package work.socialhub.kslack.api.methods.response.usergroups.users

import work.socialhub.kslack.api.model.Usergroup

class UsergroupUsersUpdateResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var usergroup: Usergroup? = null
}