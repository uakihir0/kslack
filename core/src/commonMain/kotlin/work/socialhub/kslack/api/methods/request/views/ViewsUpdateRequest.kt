package com.github.seratch.jslack.api.methods.request.views

import com.github.seratch.jslack.api.model.view.View

class ViewsUpdateRequest internal constructor(
    var token: String?,
    view: View?,
    viewAsString: String?,
    externalId: String?,
    hash: String?,
    viewId: String?
) : SlackApiRequest {
    private var view: View?
    var viewAsString: String?
    var externalId: String?
    var hash: String?
    var viewId: String?

    init {
        this.view = view
        this.viewAsString = viewAsString
        this.externalId = externalId
        this.hash = hash
        this.viewId = viewId
    }

    fun getView(): View? {
        return this.view
    }

    fun setView(view: View?) {
        this.view = view
    }

    class ViewsUpdateRequestBuilder internal constructor() {
        private var token: String? = null
        private var view: View? = null
        private var viewAsString: String? = null
        private var externalId: String? = null
        private var hash: String? = null
        private var viewId: String? = null

        fun token(token: String?): ViewsUpdateRequestBuilder {
            this.token = token
            return this
        }

        fun view(view: View?): ViewsUpdateRequestBuilder {
            this.view = view
            return this
        }

        fun viewAsString(viewAsString: String?): ViewsUpdateRequestBuilder {
            this.viewAsString = viewAsString
            return this
        }

        fun externalId(externalId: String?): ViewsUpdateRequestBuilder {
            this.externalId = externalId
            return this
        }

        fun hash(hash: String?): ViewsUpdateRequestBuilder {
            this.hash = hash
            return this
        }

        fun viewId(viewId: String?): ViewsUpdateRequestBuilder {
            this.viewId = viewId
            return this
        }

        fun build(): ViewsUpdateRequest {
            return ViewsUpdateRequest(token, view, viewAsString, externalId, hash, viewId)
        }

        override fun toString(): String {
            return "ViewsUpdateRequest.ViewsUpdateRequestBuilder(token=" + this.token + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ", externalId=" + this.externalId + ", hash=" + this.hash + ", viewId=" + this.viewId + ")"
        }
    }

    companion object {
        fun builder(): ViewsUpdateRequestBuilder {
            return ViewsUpdateRequestBuilder()
        }
    }
}
