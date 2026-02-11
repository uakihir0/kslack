package work.socialhub.kslack

import io.ktor.http.*
import work.socialhub.kslack.api.auth.AuthClient
import work.socialhub.kslack.api.methods.client.MethodsAsyncClient
import work.socialhub.kslack.api.methods.client.MethodsBlockingClient
import work.socialhub.kslack.api.methods.impl.AdminResourceImpl
import work.socialhub.kslack.api.methods.impl.MethodsAsyncClientImpl
import work.socialhub.kslack.api.methods.impl.MethodsBlockingClientImpl
import work.socialhub.kslack.api.status.StatusClient
import work.socialhub.kslack.api.status.impl.StatusClientImpl
import kotlin.js.JsExport


/**
 * Slack Integrations
 * https://{your team name}.slack.com/apps/manage/custom-integrations
 */
@JsExport
class Slack {

    @JsExport.Ignore
    fun async() = AsyncClient()

    fun blocking() = BlockingClient()

    fun auth() = AuthClient()

    companion object {
        const val ENDPOINT_URL_PREFIX = "https://slack.com/api/"
        const val STATUS_URL_PREFIX = "https://status.slack.com/api/v2.0.0/"
        const val AUTHORIZE_URL = "https://slack.com/oauth/authorize"
    }
}

class AsyncClient() {

    fun methods(
        token: String? = null
    ): MethodsAsyncClient {
        return MethodsAsyncClientImpl(token)
    }

    fun admin(
        token: String? = null
    ): AdminResourceImpl {
        return AdminResourceImpl(token)
    }

    fun status(): StatusClient {
        return StatusClientImpl()
    }
}

@JsExport
class BlockingClient() {

    fun methods(
        token: String? = null
    ): MethodsBlockingClient {
        return MethodsBlockingClientImpl(
            MethodsAsyncClientImpl(token)
        )
    }
}