package work.socialhub.kslack.api.methods.response.admin.apps

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata
import work.socialhub.kslack.entity.admin.AppRequest
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminAppsRequestsListResponse : SlackApiResponse() {
    var appRequests: Array<AppRequest>? = null
    var responseMetadata: ResponseMetadata? = null
}