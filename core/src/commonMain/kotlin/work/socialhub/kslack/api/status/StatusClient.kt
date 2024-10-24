package work.socialhub.kslack.api.status

import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue

/**
 * https://api.slack.com/docs/slack-status
 */
interface StatusClient {
    var endpointUrlPrefix: String?

    fun current(): CurrentStatus

    fun history(): Array<SlackIssue>

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://status.slack.com/api/v2.0.0/"
    }
}
