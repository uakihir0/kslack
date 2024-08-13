package work.socialhub.kslack.api.methods.request.users.profile

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersProfileGetRequest(
    /**
     * Authentication token. Requires scope: `users.profile:read`
     */
    override var token: String?,
    /**
     * User to retrieve profile info for
     */
    var user: String?,
    /**
     * Include labels for each ID in custom profile fields
     */
    var isIncludeLabels: Boolean
) : SlackApiRequest {
    class UsersProfileGetRequestBuilder() {
        private var token: String? = null
        private var user: String? = null
        private var includeLabels = false

        fun token(token: String?): UsersProfileGetRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): UsersProfileGetRequestBuilder {
            this.user = user
            return this
        }

        fun includeLabels(includeLabels: Boolean): UsersProfileGetRequestBuilder {
            this.includeLabels = includeLabels
            return this
        }

        fun build(): UsersProfileGetRequest {
            return UsersProfileGetRequest(token, user, includeLabels)
        }

        override fun toString(): String {
            return "UsersProfileGetRequest.UsersProfileGetRequestBuilder(token=" + this.token + ", user=" + this.user + ", includeLabels=" + this.includeLabels + ")"
        }
    }

    companion object {
        fun builder(): UsersProfileGetRequestBuilder {
            return UsersProfileGetRequestBuilder()
        }
    }
}