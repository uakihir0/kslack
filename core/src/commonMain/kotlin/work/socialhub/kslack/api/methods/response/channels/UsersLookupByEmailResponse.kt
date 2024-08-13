package work.socialhub.kslack.api.methods.response.channels

import work.socialhub.kslack.api.model.User

class UsersLookupByEmailResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var user: User? = null
}
