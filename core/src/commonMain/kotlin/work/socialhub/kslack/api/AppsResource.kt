package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.request.apps.connections.AppsConnectionsOpenRequest
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import work.socialhub.kslack.api.methods.response.apps.connections.AppsConnectionsOpenResponse
import kotlin.js.JsExport

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
