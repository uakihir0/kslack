package work.socialhub.kslack.api.methods.response.admin.apps.approved

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata
import work.socialhub.kslack.entity.admin.App
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminAppsApprovedListResponse : SlackApiResponse() {
    var apps: Array<App>? = null
    var responseMetadata: ResponseMetadata? = null
}
