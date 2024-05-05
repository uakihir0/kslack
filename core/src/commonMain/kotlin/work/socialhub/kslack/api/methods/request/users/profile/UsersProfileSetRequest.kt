package com.github.seratch.jslack.api.methods.request.users.profile

import com.github.seratch.jslack.api.model.User

class UsersProfileSetRequest internal constructor(
    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    var token: String?,
    /**
     * ID of user to change. This argument may only be specified by team admins on paid teams.
     */
    var user: String?, profile: User.Profile?, name: String?, value: String?
) : SlackApiRequest {
    /**
     * Collection of key:value pairs presented as a URL-encoded JSON hash.
     */
    private var profile: User.Profile?

    /**
     * Name of a single key to set. Usable only if profile is not passed.
     */
    var name: String?

    /**
     * Value to set a single key to. Usable only if profile is not passed.
     */
    var value: String?

    init {
        this.profile = profile
        this.name = name
        this.value = value
    }

    fun getProfile(): User.Profile? {
        return this.profile
    }

    fun setProfile(profile: User.Profile?) {
        this.profile = profile
    }

    class UsersProfileSetRequestBuilder internal constructor() {
        private var token: String? = null
        private var user: String? = null
        private var profile: User.Profile? = null
        private var name: String? = null
        private var value: String? = null

        fun token(token: String?): UsersProfileSetRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): UsersProfileSetRequestBuilder {
            this.user = user
            return this
        }

        fun profile(profile: User.Profile?): UsersProfileSetRequestBuilder {
            this.profile = profile
            return this
        }

        fun name(name: String?): UsersProfileSetRequestBuilder {
            this.name = name
            return this
        }

        fun value(value: String?): UsersProfileSetRequestBuilder {
            this.value = value
            return this
        }

        fun build(): UsersProfileSetRequest {
            return UsersProfileSetRequest(token, user, profile, name, value)
        }

        override fun toString(): String {
            return "UsersProfileSetRequest.UsersProfileSetRequestBuilder(token=" + this.token + ", user=" + this.user + ", profile=" + this.profile + ", name=" + this.name + ", value=" + this.value + ")"
        }
    }

    companion object {
        fun builder(): UsersProfileSetRequestBuilder {
            return UsersProfileSetRequestBuilder()
        }
    }
}