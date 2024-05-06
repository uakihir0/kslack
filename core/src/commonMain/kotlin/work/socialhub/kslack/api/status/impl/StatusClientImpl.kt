package com.github.seratch.jslack.api.status.v2.impl

import com.github.seratch.jslack.api.status.v2.StatusApiException
import com.github.seratch.jslack.api.status.v2.StatusClient
import com.github.seratch.jslack.api.status.v2.model.CurrentStatus
import com.github.seratch.jslack.api.status.v2.model.SlackIssue
import com.github.seratch.jslack.common.http.SlackHttpClient

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
    fun history(): List<SlackIssue> {
//        Response response = slackHttpClient.get(endpointUrlPrefix + "history", null, null);
//        Type listType = new TypeToken<ArrayList<SlackIssue>>() {
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