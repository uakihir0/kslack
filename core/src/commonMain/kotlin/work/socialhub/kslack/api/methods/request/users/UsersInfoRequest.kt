package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.SlackApiRequest

class UsersInfoRequest(
    /**
     * Authentication token. Requires scope: `users:read`
     */
    override var token: String?,
    /**
     * User to get info on
     */
    var user: String?,
    /**
     * Set this to `true` to receive the locale for this user. Defaults to `false`
     */
    var isIncludeLocale: Boolean
) : SlackApiRequest {
    class UsersInfoRequestBuilder() {
        private var token: String? = null
        private var user: String? = null
        private var includeLocale = false

        fun token(token: String?): UsersInfoRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): UsersInfoRequestBuilder {
            this.user = user
            return this
        }

        fun includeLocale(includeLocale: Boolean): UsersInfoRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        fun build(): UsersInfoRequest {
            return UsersInfoRequest(token, user, includeLocale)
        }

        override fun toString(): String {
            return "UsersInfoRequest.UsersInfoRequestBuilder(token=" + this.token + ", user=" + this.user + ", includeLocale=" + this.includeLocale + ")"
        }
    }

    companion object {
        fun builder(): UsersInfoRequestBuilder {
            return UsersInfoRequestBuilder()
        }
    }
}