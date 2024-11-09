package work.socialhub.kslack.api.status.model

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class CurrentStatus {
    var status: String? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var activeIncidents: Array<SlackIssue>? = null
}
