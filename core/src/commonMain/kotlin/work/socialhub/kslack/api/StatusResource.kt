package work.socialhub.kslack.api

import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue
import kotlin.js.JsExport

/**
 * Resource interface for accessing the Slack Status API.
 *
 * Provides real-time and historical information about Slack's service status
 * from the public Slack Status page at https://status.slack.com.
 *
 * This interface queries the Slack Status API (redirects to https://slack-status.com)
 * independently from the main Slack Web API. It does not require authentication.
 *
 * # Usage Example
 * ```kotlin
 * // Get current service status
 * val current = slack.status.current()
 * println("Components: ${current.components?.size}")
 *
 * // Get recent incident history
 * val incidents = slack.status.history()
 * incidents.forEach { println("${it.title}: ${it.status}") }
 * ```
 *
 * @see <a href="https://status.slack.com">Slack Status Page</a>
 */
@JsExport
interface StatusResource {

    /**
     * Retrieves the current status of all Slack services and components.
     *
     * Returns information about operational status of each Slack service
     * including API, web app, mobile, and other components.
     *
     * @return Current status information including component statuses
     */
    suspend fun current(): CurrentStatus

    @JsExport.Ignore
    fun currentBlocking(): CurrentStatus

    suspend fun history(): Array<SlackIssue>

    @JsExport.Ignore
    fun historyBlocking(): Array<SlackIssue>
}
