package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents an integration log entry for a workspace.
 *
 * Contains details about app or service integrations including the app ID,
 * service type, associated user, channel, change type, and resolution details.
 * Also supports RSS feed integration tracking.
 * Used in responses from `team.integrationLogs`.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/team.integrationLogs">team.integrationLogs</a>
 */
@JsExport
@Serializable
class IntegrationLog {

    var appType: String? = null
    var appId: String? = null

    var serviceId: String? = null
    var serviceType: String? = null

    var userId: String? = null
    var userName: String? = null

    var channel: String? = null

    var date: Int? = null
    var changeType: String? = null
    var resolution: String? = null
    var reason: String? = null
    var scope: String? = null

    var isRssFeed: Boolean = false
    var rssFeedChangeType: String? = null
    var rssFeedTitle: String? = null
    var rssFeedUrl: String? = null
}
