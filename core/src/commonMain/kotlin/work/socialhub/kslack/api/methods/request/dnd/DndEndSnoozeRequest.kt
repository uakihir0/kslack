package work.socialhub.kslack.api.methods.request.dnd

import work.socialhub.kslack.api.methods.SlackApiRequest

class DndEndSnoozeRequest(
    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    override var token: String?
) : SlackApiRequest {
    class DndEndSnoozeRequestBuilder() {
        private var token: String? = null

        fun token(token: String?): DndEndSnoozeRequestBuilder {
            this.token = token
            return this
        }

        fun build(): DndEndSnoozeRequest {
            return DndEndSnoozeRequest(token)
        }

        override fun toString(): String {
            return "DndEndSnoozeRequest.DndEndSnoozeRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): DndEndSnoozeRequestBuilder {
            return DndEndSnoozeRequestBuilder()
        }
    }
}