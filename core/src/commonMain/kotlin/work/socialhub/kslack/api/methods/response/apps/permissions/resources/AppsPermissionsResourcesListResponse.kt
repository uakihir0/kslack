package work.socialhub.kslack.api.methods.response.apps.permissions.resources

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata

@Serializable
class AppsPermissionsResourcesListResponse : SlackApiResponse() {
    var resources: Array<Resource>? = null
    var responseMetadata: ResponseMetadata? = null

    @Serializable
    class Resource {
        var id: String? = null
        var type: String? = null
    }
}