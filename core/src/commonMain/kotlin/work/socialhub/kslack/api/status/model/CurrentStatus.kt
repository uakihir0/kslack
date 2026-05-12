package work.socialhub.kslack.api.status.model

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents the current operational status of Slack services.
 *
 * Queried from the public Slack Status API at https://status.slack.com.
 * Contains the overall service status, timestamps, and any active incidents.
 *
 * @see <a href="https://status.slack.com">Slack Status Page</a>
 */
@JsExport
@Serializable
class CurrentStatus {
    var status: String? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var activeIncidents: Array<SlackIssue>? = null
}
