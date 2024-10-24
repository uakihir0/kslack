package work.socialhub.kslack.api.status.impl

import work.socialhub.kslack.api.status.StatusClient
import work.socialhub.kslack.api.status.StatusClient.Companion.ENDPOINT_URL_PREFIX
import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue

class StatusClientImpl : StatusClient {

    override var endpointUrlPrefix: String? = ENDPOINT_URL_PREFIX

    override fun current(): CurrentStatus {
//        Response response = slackHttpClient.get(endpointUrlPrefix + "current", null, null);
//        String body = response.body().string();
//        slackHttpClient.runHttpResponseListeners(response, body);
//        if (response.isSuccessful()) {
//            return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, CurrentStatus.class);
//        } else {
//            throw new StatusApiException(response, body);
//        }
        throw IllegalStateException("Not supported.")
    }

    override fun history(): Array<SlackIssue> {
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
        throw IllegalStateException("Not supported.")
    }
}