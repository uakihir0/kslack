package work.socialhub.kslack.api.status

import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue
import kotlin.js.JsExport

/**
 * https://api.slack.com/docs/slack-status
 */
interface StatusClient {
    var endpointUrlPrefix: String?

    suspend fun current(): CurrentStatus

    suspend fun history(): Array<SlackIssue>
}
