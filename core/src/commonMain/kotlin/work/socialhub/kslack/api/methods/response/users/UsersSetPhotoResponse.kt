package work.socialhub.kslack.api.methods.response.users

import work.socialhub.kslack.api.model.User

class UsersSetPhotoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var profile: User.Profile? = null
}
