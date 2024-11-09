package work.socialhub.kslack.api.methods.response.apps.permissions.resources

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Resource
import work.socialhub.kslack.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class AppsPermissionsResourcesListResponse : SlackApiResponse() {
    var resources: Array<Resource>? = null
    var responseMetadata: ResponseMetadata? = null
}