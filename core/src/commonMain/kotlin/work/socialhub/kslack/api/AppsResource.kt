package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.request.apps.connections.AppsConnectionsOpenRequest
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import work.socialhub.kslack.api.methods.response.apps.connections.AppsConnectionsOpenResponse
import kotlin.js.JsExport

/**
 * Resource for Apps APIs.
 *
 * Provides:
 * - [appsConnectionsOpen] - Get Socket Mode WebSocket URL (see [work.socialhub.kslack.stream.SlackStream])
 * - [appsUninstall] - Uninstall the app from a workspace
 *
 * @see <a href="https://api.slack.com/methods/apps.connections.open">apps.connections.open</a>
 * @see <a href="https://api.slack.com/methods/apps.uninstall">apps.uninstall</a>
 */
@JsExport
interface AppsResource {

    // TODO: Stream module — Socket Mode WebSocket connection should be implemented in stream/ module.
    suspend fun appsConnectionsOpen(
        req: AppsConnectionsOpenRequest
    ): AppsConnectionsOpenResponse

    @JsExport.Ignore
    fun appsConnectionsOpenBlocking(
        req: AppsConnectionsOpenRequest
    ): AppsConnectionsOpenResponse

    suspend fun appsUninstall(
        req: AppsUninstallRequest
    ): AppsUninstallResponse

    @JsExport.Ignore
    fun appsUninstallBlocking(
        req: AppsUninstallRequest
    ): AppsUninstallResponse
}
