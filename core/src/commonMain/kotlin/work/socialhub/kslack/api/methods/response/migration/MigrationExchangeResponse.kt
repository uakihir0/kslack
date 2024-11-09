package work.socialhub.kslack.api.methods.response.migration

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class MigrationExchangeResponse : SlackApiResponse() {
    /** The workspace/team ID containing the mapped users */
    var teamId: String? = null
    /** The enterprise grid organization ID containing the workspace/team. */
    var enterpriseId: String? = null
    /** A list of User IDs that cannot be mapped or found */
    var invalidUserIds: Array<String>? = null
    /** A mapping of provided user IDs with mapped user IDs */
    var userIdMap: Map<String, String>? = null
}