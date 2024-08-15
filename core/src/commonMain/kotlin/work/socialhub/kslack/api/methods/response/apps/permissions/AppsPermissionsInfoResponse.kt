package work.socialhub.kslack.api.methods.response.apps.permissions

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class AppsPermissionsInfoResponse : SlackApiResponse() {
    var info: Info? = null

    @Serializable
    class Info {
        var team: Permissions? = null
        var channel: Permissions? = null
        var group: Permissions? = null
        var mpim: Permissions? = null
        var im: Permissions? = null
        var appHome: Permissions? = null

        @Serializable
        class Permissions {
            var scopes: Array<String>? = null
            var resources: Resources? = null

            @Serializable
            class Resources {
                var ids: Array<String>? = null
                var isWildcard: Boolean = false
                var excludedIds: Array<String>? = null
            }
        }
    }
}