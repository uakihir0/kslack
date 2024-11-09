package work.socialhub.kslack.api.status.impl

import work.socialhub.khttpclient.HttpRequest
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.methods.SlackApiException
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson
import work.socialhub.kslack.api.status.StatusClient
import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue

class StatusClientImpl : StatusClient {

    override var endpointUrlPrefix: String? = Slack.STATUS_URL_PREFIX

    override suspend fun current(): CurrentStatus {
        val response = HttpRequest()
            .url("${endpointUrlPrefix}current")
            .get()

        if (response.status in 200..<299) {
            return fromJson(response.stringBody)
        }
        throw SlackApiException(response)
    }

    override suspend fun history(): Array<SlackIssue> {
        val response = HttpRequest()
            .url("${endpointUrlPrefix}history")
            .get()

        if (response.status in 200..<299) {
            return fromJson(response.stringBody)
        }
        throw SlackApiException(response)
    }
}