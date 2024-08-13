package work.socialhub.kslack.api.webhook

class WebhookResponse(var code: Int?, var message: String?, var body: String?) {
    class WebhookResponseBuilder() {
        private var code: Int? = null
        private var message: String? = null
        private var body: String? = null

        fun code(code: Int?): WebhookResponseBuilder {
            this.code = code
            return this
        }

        fun message(message: String?): WebhookResponseBuilder {
            this.message = message
            return this
        }

        fun body(body: String?): WebhookResponseBuilder {
            this.body = body
            return this
        }

        fun build(): WebhookResponse {
            return WebhookResponse(code, message, body)
        }

        override fun toString(): String {
            return "WebhookResponse.WebhookResponseBuilder(code=" + this.code + ", message=" + this.message + ", body=" + this.body + ")"
        }
    }

    companion object {
        fun builder(): WebhookResponseBuilder {
            return WebhookResponseBuilder()
        }
    }
}
