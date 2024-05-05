package com.github.seratch.jslack.api.methods.request.views

import com.github.seratch.jslack.api.model.view.View

class ViewsPushRequest internal constructor(
    var token: String?,
    var triggerId: String?,
    view: View?,
    viewAsString: String?
) : SlackApiRequest {
    private var view: View?
    var viewAsString: String?

    init {
        this.view = view
        this.viewAsString = viewAsString
    }

    fun getView(): View? {
        return this.view
    }

    fun setView(view: View?) {
        this.view = view
    }

    class ViewsPushRequestBuilder internal constructor() {
        private var token: String? = null
        private var triggerId: String? = null
        private var view: View? = null
        private var viewAsString: String? = null

        fun token(token: String?): ViewsPushRequestBuilder {
            this.token = token
            return this
        }

        fun triggerId(triggerId: String?): ViewsPushRequestBuilder {
            this.triggerId = triggerId
            return this
        }

        fun view(view: View?): ViewsPushRequestBuilder {
            this.view = view
            return this
        }

        fun viewAsString(viewAsString: String?): ViewsPushRequestBuilder {
            this.viewAsString = viewAsString
            return this
        }

        fun build(): ViewsPushRequest {
            return ViewsPushRequest(token, triggerId, view, viewAsString)
        }

        override fun toString(): String {
            return "ViewsPushRequest.ViewsPushRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ")"
        }
    }

    companion object {
        fun builder(): ViewsPushRequestBuilder {
            return ViewsPushRequestBuilder()
        }
    }
}
