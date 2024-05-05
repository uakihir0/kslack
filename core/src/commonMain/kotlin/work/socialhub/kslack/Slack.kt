package com.github.seratch.jslack

import kotlin.jvm.JvmOverloads

/**
 * Slack Integrations
 *
 *
 * https://{your team name}.slack.com/apps/manage/custom-integrations
 */
class Slack private constructor(config: SlackConfig, httpClient: SlackHttpClient) {
    private val httpClient: SlackHttpClient = httpClient
    private val config: SlackConfig = config

    constructor() : this(SlackConfig.DEFAULT, SlackHttpClient())

    init {
        this.httpClient.setConfig(this.config)
    }

    fun getHttpClient(): SlackHttpClient {
        return this.httpClient
    }


    fun status(): StatusClient {
        val client: StatusClientImpl = StatusClientImpl(httpClient)
        client.setEndpointUrlPrefix(config.getStatusEndpointUrlPrefix())
        return client
    }

    /**
     * Creates a Methods API client.
     */
    @JvmOverloads
    fun methods(token: String? = null): MethodsClient {
        val client: MethodsClientImpl = MethodsClientImpl(httpClient, token)
        client.setEndpointUrlPrefix(config.getMethodsEndpointUrlPrefix())
        return client
    }

    companion object {
        val instance: Slack = Slack(SlackConfig.DEFAULT, SlackHttpClient())

        fun getInstance(config: SlackConfig): Slack {
            return Slack(config, SlackHttpClient())
        }

        fun getInstance(config: SlackConfig, httpClient: SlackHttpClient): Slack {
            return Slack(config, httpClient)
        }

        fun getInstance(httpClient: SlackHttpClient): Slack {
            return Slack(SlackConfig.DEFAULT, httpClient)
        }
    }
}
