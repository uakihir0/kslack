package work.socialhub.kslack.internal.api

import work.socialhub.khttpclient.HttpRequest
import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.StatusResource
import work.socialhub.kslack.api.methods.SlackApiException
import work.socialhub.kslack.api.methods.helper.JsonHelper.fromJson
import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue
import work.socialhub.kslack.util.toBlocking

class StatusResourceImpl : StatusResource {

    override suspend fun current(): CurrentStatus {
        val response = HttpRequest()
            .url("${Slack.STATUS_URL_PREFIX}current")
            .get()

        if (response.status in 200..299) {
            return fromJson(response.stringBody)
        }
        throw SlackApiException(response)
    }

    override fun currentBlocking(): CurrentStatus {
        return toBlocking { current() }
    }

    override suspend fun history(): Array<SlackIssue> {
        val response = HttpRequest()
            .url("${Slack.STATUS_URL_PREFIX}history")
            .get()

        if (response.status in 200..299) {
            return fromJson(response.stringBody)
        }
        throw SlackApiException(response)
    }

    override fun historyBlocking(): Array<SlackIssue> {
        return toBlocking { history() }
    }
}
