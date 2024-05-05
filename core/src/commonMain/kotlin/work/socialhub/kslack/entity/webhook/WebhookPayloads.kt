package com.github.seratch.jslack.api.webhook

import com.github.seratch.jslack.api.model.ModelConfigurator

object WebhookPayloads {
    fun payload(configurator: ModelConfigurator<Payload.PayloadBuilder?>): Payload {
        return configurator.configure(Payload.builder()).build()
    }
}
