package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsCreateRequest(
    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    override var token: String?,
    /**
     * Name of the public or private channel to create
     */
    var name: String?,
    /**
     * Create a private channel instead of a public one
     */
    var isPrivate: Boolean
) : SlackApiRequest {
    class ConversationsCreateRequestBuilder() {
        private var token: String? = null
        private var name: String? = null
        private var isPrivate = false

        fun token(token: String?): ConversationsCreateRequestBuilder {
            this.token = token
            return this
        }

        fun name(name: String?): ConversationsCreateRequestBuilder {
            this.name = name
            return this
        }

        fun isPrivate(isPrivate: Boolean): ConversationsCreateRequestBuilder {
            this.isPrivate = isPrivate
            return this
        }

        fun build(): ConversationsCreateRequest {
            return ConversationsCreateRequest(token, name, isPrivate)
        }

        override fun toString(): String {
            return "ConversationsCreateRequest.ConversationsCreateRequestBuilder(token=" + this.token + ", name=" + this.name + ", isPrivate=" + this.isPrivate + ")"
        }
    }

    companion object {
        fun builder(): ConversationsCreateRequestBuilder {
            return ConversationsCreateRequestBuilder()
        }
    }
}
