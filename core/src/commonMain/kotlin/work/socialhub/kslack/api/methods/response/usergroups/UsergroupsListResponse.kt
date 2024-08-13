package work.socialhub.kslack.api.methods.response.usergroups

import work.socialhub.kslack.api.model.Usergroup

class UsergroupsListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var usergroups: Array<Usergroup>? = null
}