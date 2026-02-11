package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import kotlin.js.JsExport

@JsExport
interface AppsResource {

    suspend fun appsUninstall(
        req: AppsUninstallRequest
    ): AppsUninstallResponse

    @JsExport.Ignore
    fun appsUninstallBlocking(
        req: AppsUninstallRequest
    ): AppsUninstallResponse
}
