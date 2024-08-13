package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * Delete the user profile photo
 */
class UsersDeletePhotoRequest(
    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    override var token: String?
) : SlackApiRequest {
    class UsersDeletePhotoRequestBuilder() {
        private var token: String? = null

        fun token(token: String?): UsersDeletePhotoRequestBuilder {
            this.token = token
            return this
        }

        fun build(): UsersDeletePhotoRequest {
            return UsersDeletePhotoRequest(token)
        }

        override fun toString(): String {
            return "UsersDeletePhotoRequest.UsersDeletePhotoRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): UsersDeletePhotoRequestBuilder {
            return UsersDeletePhotoRequestBuilder()
        }
    }
}
