package work.socialhub.kslack.api.webhook

import work.socialhub.kslack.api.model.ModelConfigurator

object WebhookPayloads {
    fun payload(configurator: ModelConfigurator<Payload.PayloadBuilder?>): Payload {
        return configurator.configure(Payload.builder()).build()
    }
}
