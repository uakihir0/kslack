package com.github.seratch.jslack.api.methods.request.dnd

import com.github.seratch.jslack.api.methods.SlackApiRequest

class DndEndDndRequest internal constructor(
    /**
     * Authentication token. Requires scope: `dnd:write`
     */
    override var token: String?
) : SlackApiRequest {
    class DndEndDndRequestBuilder internal constructor() {
        private var token: String? = null

        fun token(token: String?): DndEndDndRequestBuilder {
            this.token = token
            return this
        }

        fun build(): DndEndDndRequest {
            return DndEndDndRequest(token)
        }

        override fun toString(): String {
            return "DndEndDndRequest.DndEndDndRequestBuilder(token=" + this.token + ")"
        }
    }

    companion object {
        fun builder(): DndEndDndRequestBuilder {
            return DndEndDndRequestBuilder()
        }
    }
}