package work.socialhub.kslack.api.methods.response.apps.permissions.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.ResponseMetadata

@Serializable
class AppsPermissionsUsersListResponse : SlackApiResponse() {
    var resources: Array<Resource>? = null
    var responseMetadata: ResponseMetadata? = null

    @Serializable
    class Resource {
        var id: String? = null
        var type: String? = null
        var scopes: Array<String>? = null
    }
}