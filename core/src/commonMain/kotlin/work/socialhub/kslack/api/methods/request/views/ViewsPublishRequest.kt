package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.model.view.View

class ViewsPublishRequest(
    var token: String?,
    view: View?,
    viewAsString: String?,
    userId: String?,
    hash: String?
) : SlackApiRequest {
    private var view: View?
    var viewAsString: String?
    var userId: String?
    var hash: String?

    init {
        this.view = view
        this.viewAsString = viewAsString
        this.userId = userId
        this.hash = hash
    }

    fun getView(): View? {
        return this.view
    }

    fun setView(view: View?) {
        this.view = view
    }

    class ViewsPublishRequestBuilder() {
        private var token: String? = null
        private var view: View? = null
        private var viewAsString: String? = null
        private var userId: String? = null
        private var hash: String? = null

        fun token(token: String?): ViewsPublishRequestBuilder {
            this.token = token
            return this
        }

        fun view(view: View?): ViewsPublishRequestBuilder {
            this.view = view
            return this
        }

        fun viewAsString(viewAsString: String?): ViewsPublishRequestBuilder {
            this.viewAsString = viewAsString
            return this
        }

        fun userId(userId: String?): ViewsPublishRequestBuilder {
            this.userId = userId
            return this
        }

        fun hash(hash: String?): ViewsPublishRequestBuilder {
            this.hash = hash
            return this
        }

        fun build(): ViewsPublishRequest {
            return ViewsPublishRequest(token, view, viewAsString, userId, hash)
        }

        override fun toString(): String {
            return "ViewsPublishRequest.ViewsPublishRequestBuilder(token=" + this.token + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ", userId=" + this.userId + ", hash=" + this.hash + ")"
        }
    }

    companion object {
        fun builder(): ViewsPublishRequestBuilder {
            return ViewsPublishRequestBuilder()
        }
    }
}
