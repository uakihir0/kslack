package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.response.migration.MigrationExchangeResponse
import kotlin.js.JsExport

@JsExport
interface MigrationResource {

    suspend fun migrationExchange(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse

    @JsExport.Ignore
    fun migrationExchangeBlocking(
        req: MigrationExchangeRequest
    ): MigrationExchangeResponse
}
