package work.socialhub.kslack.api.methods.response.apps.permissions.scopes

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Scope
import kotlin.js.JsExport

@JsExport
@Serializable
class AppsPermissionsScopesListResponse : SlackApiResponse() {
    var scopes: Array<Scope>? = null
}