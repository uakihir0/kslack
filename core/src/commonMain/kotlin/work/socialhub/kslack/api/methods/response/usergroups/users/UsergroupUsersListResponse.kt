package work.socialhub.kslack.api.methods.response.usergroups.users

import work.socialhub.kslack.api.methods.SlackApiResponse

class UsergroupUsersListResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var users: Array<String>? = null
}