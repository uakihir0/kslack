package com.github.seratch.jslack.api.methods.request.migration

import com.github.seratch.jslack.api.methods.SlackApiRequest

/**
 * For Enterprise Grid workspaces, map local user IDs to global user IDs
 */
class MigrationExchangeRequest internal constructor(
    /**
     * Authentication token. Requires scope: `tokens.basic`
     */
    override var token: String?,
    /**
     * Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.
     */
    var isToOld: Boolean,
    /**
     * A comma-separated list of user ids, up to 400 per request
     */
    var users: Array<String>?
) : SlackApiRequest {
    class MigrationExchangeRequestBuilder internal constructor() {
        private var token: String? = null
        private var toOld = false
        private var users: Array<String>? = null

        fun token(token: String?): MigrationExchangeRequestBuilder {
            this.token = token
            return this
        }

        fun toOld(toOld: Boolean): MigrationExchangeRequestBuilder {
            this.toOld = toOld
            return this
        }

        fun users(users: Array<String>?): MigrationExchangeRequestBuilder {
            this.users = users
            return this
        }

        fun build(): MigrationExchangeRequest {
            return MigrationExchangeRequest(token, toOld, users)
        }

        override fun toString(): String {
            return "MigrationExchangeRequest.MigrationExchangeRequestBuilder(token=" + this.token + ", toOld=" + this.toOld + ", users=" + this.users + ")"
        }
    }

    companion object {
        fun builder(): MigrationExchangeRequestBuilder {
            return MigrationExchangeRequestBuilder()
        }
    }
}