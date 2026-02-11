package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.AppsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.response.apps.AppsUninstallResponse
import work.socialhub.kslack.util.toBlocking

class AppsResourceImpl(
    token: String?
) : AbstractResourceImpl(token), AppsResource {

    override suspend fun appsUninstall(req: AppsUninstallRequest): AppsUninstallResponse {
        return postFormWithToken(req.toParams(), Methods.APPS_UNINSTALL, getToken(req))
    }

    override fun appsUninstallBlocking(req: AppsUninstallRequest): AppsUninstallResponse {
        return toBlocking { appsUninstall(req) }
    }
}
