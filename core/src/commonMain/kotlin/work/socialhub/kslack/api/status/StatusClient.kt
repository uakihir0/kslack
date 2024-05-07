package com.github.seratch.jslack.api.status.v2

import com.github.seratch.jslack.api.status.v2.model.CurrentStatus
import com.github.seratch.jslack.api.status.v2.model.SlackIssue

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
