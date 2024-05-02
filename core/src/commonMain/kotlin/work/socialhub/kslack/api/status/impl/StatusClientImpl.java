package com.github.seratch.jslack.api.status.v2.impl;

import com.github.seratch.jslack.api.status.v2.StatusApiException;
import com.github.seratch.jslack.api.status.v2.StatusClient;
import com.github.seratch.jslack.api.status.v2.model.CurrentStatus;
import com.github.seratch.jslack.api.status.v2.model.SlackIssue;
import com.github.seratch.jslack.common.http.SlackHttpClient;

import java.io.IOException;
import java.util.List;

public class StatusClientImpl implements StatusClient {

    private String endpointUrlPrefix = ENDPOINT_URL_PREFIX;
    private final SlackHttpClient slackHttpClient;

    public StatusClientImpl(SlackHttpClient slackHttpClient) {
        this.slackHttpClient = slackHttpClient;
    }

    @Override
    public String getEndpointUrlPrefix() {
        return this.endpointUrlPrefix;
    }

    @Override
    public void setEndpointUrlPrefix(String endpointUrlPrefix) {
        this.endpointUrlPrefix = endpointUrlPrefix;
    }

    @Override
    public CurrentStatus current() throws IOException, StatusApiException {
//        Response response = slackHttpClient.get(endpointUrlPrefix + "current", null, null);
//        String body = response.body().string();
//        slackHttpClient.runHttpResponseListeners(response, body);
//        if (response.isSuccessful()) {
//            return GsonFactory.createSnakeCase(slackHttpClient.getConfig()).fromJson(body, CurrentStatus.class);
//        } else {
//            throw new StatusApiException(response, body);
//        }
        throw new IllegalStateException("Not supported.");
    }

    @Override
    public List<SlackIssue> history() throws IOException, StatusApiException {
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
        throw new IllegalStateException("Not supported.");
    }

}