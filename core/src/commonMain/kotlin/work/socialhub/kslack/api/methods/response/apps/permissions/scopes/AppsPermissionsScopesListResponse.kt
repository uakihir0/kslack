package work.socialhub.kslack.api.methods.response.apps.permissions.scopes

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse

@Serializable
class AppsPermissionsScopesListResponse : SlackApiResponse() {
    var scopes: Array<Scope>? = null

    @Serializable
    class Scope {
        var appHome: Array<String>? = null
        var team: Array<String>? = null
        var channel: Array<String>? = null
        var group: Array<String>? = null
        var mpim: Array<String>? = null
        var im: Array<String>? = null
        var user: Array<String>? = null
    }
}