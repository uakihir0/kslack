package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.model.view.View

class ViewsOpenRequest(
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

    class ViewsOpenRequestBuilder() {
        private var token: String? = null
        private var triggerId: String? = null
        private var view: View? = null
        private var viewAsString: String? = null

        fun token(token: String?): ViewsOpenRequestBuilder {
            this.token = token
            return this
        }

        fun triggerId(triggerId: String?): ViewsOpenRequestBuilder {
            this.triggerId = triggerId
            return this
        }

        fun view(view: View?): ViewsOpenRequestBuilder {
            this.view = view
            return this
        }

        fun viewAsString(viewAsString: String?): ViewsOpenRequestBuilder {
            this.viewAsString = viewAsString
            return this
        }

        fun build(): ViewsOpenRequest {
            return ViewsOpenRequest(token, triggerId, view, viewAsString)
        }

        override fun toString(): String {
            return "ViewsOpenRequest.ViewsOpenRequestBuilder(token=" + this.token + ", triggerId=" + this.triggerId + ", view=" + this.view + ", viewAsString=" + this.viewAsString + ")"
        }
    }

    companion object {
        fun builder(): ViewsOpenRequestBuilder {
            return ViewsOpenRequestBuilder()
        }
    }
}
