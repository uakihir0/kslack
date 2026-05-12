package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.response.migration.MigrationExchangeResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `migration` API methods.
 *
 * Provides the `migration.exchange` method for converting user IDs and
 * bot user IDs from legacy API tokens to newer Bot User OAuth Access Tokens.
 *
 * This is a utility method used during the migration from legacy tokens
 * to the Bot Users system. It exchanges a legacy user token for the
 * corresponding `user_id` and `user_team_id`.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/migration.exchange">migration.exchange</a>
 */
@JsExport
interface MigrationResource {

    /**
     * Exchanges a legacy user token for a user ID.
     *
     * Returns the user ID and team ID associated with a legacy token,
     * enabling migration to the Bot Users system.
     *
     * @param req Request containing the legacy token to exchange
     * @return Response with the user ID and team ID
     * @see <a href="https://docs.slack.dev/reference/methods/migration.exchange">migration.exchange</a>
     */
    suspend fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse

    @JsExport.Ignore
    fun migrationExchangeBlocking(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse
}
