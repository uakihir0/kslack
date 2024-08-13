package work.socialhub.kslack.api.methods.response.users

import work.socialhub.kslack.api.model.ResponseMetadata

class UsersListResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var offset: String? = null // user id
    var members: Array<User>? = null
    var cacheTs: String? = null
    var responseMetadata: ResponseMetadata? = null
}
