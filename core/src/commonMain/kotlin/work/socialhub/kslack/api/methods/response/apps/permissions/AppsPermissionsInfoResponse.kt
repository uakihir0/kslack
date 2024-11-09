package work.socialhub.kslack.api.methods.response.apps.permissions

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class AppsPermissionsInfoResponse : SlackApiResponse() {
    var info: AppInfo? = null
}

@JsExport
@Serializable
class AppInfo {
    var team: AppPermissions? = null
    var channel: AppPermissions? = null
    var group: AppPermissions? = null
    var mpim: AppPermissions? = null
    var im: AppPermissions? = null
    var appHome: AppPermissions? = null
}

@JsExport
@Serializable
class AppPermissions {
    var scopes: Array<String>? = null
    var resources: AppResources? = null
}

@JsExport
@Serializable
class AppResources {
    var ids: Array<String>? = null
    var isWildcard: Boolean = false
    var excludedIds: Array<String>? = null
}