package work.socialhub.kslack.api.status.v2.impl

import work.socialhub.kslack.api.status.v2.StatusApiException
import work.socialhub.kslack.api.status.v2.StatusClient
import work.socialhub.kslack.api.status.v2.model.CurrentStatus
import work.socialhub.kslack.api.status.v2.model.SlackIssue
import work.socialhub.kslack.common.http.SlackHttpClient

class StatusClientImpl(slackHttpClient: SlackHttpClient) : StatusClient {
    var endpointUrlPrefix: String = ENDPOINT_URL_PREFIX
    private val slackHttpClient: SlackHttpClient = slackHttpClient

    @Throws(java.io.IOException::class, StatusApiException::class)
    fun current(): CurrentStatus {
//        Response response = slackHttpClient.get(endpointUrlPrefix + "current", null, null);
//        String body = response.body().string();
//        slackHttpClient.runHttpResponseListeners(response, body);
//        if (response.isSuccessful()) {
//            return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, CurrentStatus.class);
//        } else {
//            throw new StatusApiException(response, body);
//        }
        throw java.lang.IllegalStateException("Not supported.")
    }

    @Throws(java.io.IOException::class, StatusApiException::class)
    fun history(): Array<SlackIssue> {
//        Response response = slackHttpClient.get(endpointUrlPrefix + "history", null, null);
//        Type listType = new TypeToken<ArrayArray<SlackIssue>>() {
//        }.getType();
//        String body = response.body().string();
//        slackHttpClient.runHttpResponseListeners(response, body);
//        if (response.isSuccessful()) {
//            return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, listType);
//        } else {
//            throw new StatusApiException(response, body);
//        }
        throw java.lang.IllegalStateException("Not supported.")
    }
}