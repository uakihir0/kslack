package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.AppsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.request.apps.connections.AppsConnectionsOpenRequest
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import work.socialhub.kslack.api.methods.response.apps.connections.AppsConnectionsOpenResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [AppsResource] for Slack's `apps.*` API methods.
 *
 * Handles HTTP POST requests for app connection management (WebSocket
 * connection opening for event subscriptions) and app uninstallation.
 *
 * @param token Optional default token provided at factory initialization
 */
class AppsResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), AppsResource {

    override suspend fun appsConnectionsOpen(
        req: AppsConnectionsOpenRequest
    ): AppsConnectionsOpenResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.APPS_CONNECTIONS_OPEN,
            getToken(req),
        )
    }

    override fun appsConnectionsOpenBlocking(
        req: AppsConnectionsOpenRequest
    ): AppsConnectionsOpenResponse {
        return toBlocking { appsConnectionsOpen(req) }
    }

    override suspend fun appsUninstall(req: AppsUninstallRequest): AppsUninstallResponse {
        return postFormWithToken(req.toParams(), Methods.APPS_UNINSTALL, getToken(req))
    }

    override fun appsUninstallBlocking(req: AppsUninstallRequest): AppsUninstallResponse {
        return toBlocking { appsUninstall(req) }
    }
}
