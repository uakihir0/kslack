package work.socialhub.kslack.api.status.v2

import work.socialhub.kslack.api.status.StatusApiException
import work.socialhub.kslack.api.status.v2.model.CurrentStatus
import work.socialhub.kslack.api.status.v2.model.SlackIssue

/**
 * https://api.slack.com/docs/slack-status
 */
interface StatusClient {
    var endpointUrlPrefix: String?

    @Throws(java.io.IOException::class, StatusApiException::class)
    fun current(): CurrentStatus?

    @Throws(java.io.IOException::class, StatusApiException::class)
    fun history(): Array<SlackIssue?>?

    companion object {
        const val ENDPOINT_URL_PREFIX: String = "https://status.slack.com/api/v2.0.0/"
    }
}
