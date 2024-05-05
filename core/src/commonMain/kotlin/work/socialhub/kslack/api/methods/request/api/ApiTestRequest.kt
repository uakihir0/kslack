package com.github.seratch.jslack.api.methods.request.api

import com.github.seratch.jslack.api.methods.SlackApiRequest

class ApiTestRequest internal constructor(
    /**
     * example property to return
     */
    var foo: String?,
    /**
     * Error response to return
     */
    var error: String?
) : SlackApiRequest {
    override val token: String?
        get() = null

    class ApiTestRequestBuilder internal constructor() {
        private var foo: String? = null
        private var error: String? = null

        fun foo(foo: String?): ApiTestRequestBuilder {
            this.foo = foo
            return this
        }

        fun error(error: String?): ApiTestRequestBuilder {
            this.error = error
            return this
        }

        fun build(): ApiTestRequest {
            return ApiTestRequest(foo, error)
        }

        override fun toString(): String {
            return "ApiTestRequest.ApiTestRequestBuilder(foo=" + this.foo + ", error=" + this.error + ")"
        }
    }

    companion object {
        fun builder(): ApiTestRequestBuilder {
            return ApiTestRequestBuilder()
        }
    }
}