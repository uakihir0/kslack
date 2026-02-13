package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.MigrationResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.response.migration.MigrationExchangeResponse
import work.socialhub.kslack.util.toBlocking

class MigrationResourceImpl(
    token: String?
) : AbstractResourceImpl(token), MigrationResource {

    override suspend fun migrationExchange(req: MigrationExchangeRequest): MigrationExchangeResponse {
        return postFormWithToken(req.toParams(), Methods.MIGRATION_EXCHANGE, getToken(req))
    }

    override fun migrationExchangeBlocking(req: MigrationExchangeRequest): MigrationExchangeResponse {
        return toBlocking { migrationExchange(req) }
    }
}
