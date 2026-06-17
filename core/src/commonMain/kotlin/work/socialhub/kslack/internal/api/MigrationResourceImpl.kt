package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.MigrationResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.response.migration.MigrationExchangeResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [MigrationResource] for Slack's `migration.exchange` API method.
 *
 * Handles HTTP POST requests for converting legacy user IDs to newer Bot User OAuth format.
 * Used during migration from legacy tokens to the Bot Users system.
 *
 * @param token Optional default token provided at factory initialization
 */
class MigrationResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), MigrationResource {

    override suspend fun migrationExchange(req: MigrationExchangeRequest): MigrationExchangeResponse {
        return postFormWithToken(req.toParams(), Methods.MIGRATION_EXCHANGE, getToken(req))
    }

    override fun migrationExchangeBlocking(req: MigrationExchangeRequest): MigrationExchangeResponse {
        return toBlocking { migrationExchange(req) }
    }
}
