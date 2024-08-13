package work.socialhub.kslack.api.methods.request.im

import work.socialhub.kslack.api.methods.SlackApiRequest

class ImOpenRequest(
    /**
     * Authentication token. Requires scope: `im:write`
     */
    override var token: String?,
    /**
     * User to open a direct message channel with.
     */
    var user: String?,
    /**
     * Boolean, indicates you want the full IM channel definition in the response.
     */
    var isReturnIm: Boolean,
    /**
     * Set this to `true` to receive the locale for this im. Defaults to `false`
     */
    var isIncludeLocale: Boolean
) : SlackApiRequest {
    class ImOpenRequestBuilder() {
        private var token: String? = null
        private var user: String? = null
        private var returnIm = false
        private var includeLocale = false

        fun token(token: String?): ImOpenRequestBuilder {
            this.token = token
            return this
        }

        fun user(user: String?): ImOpenRequestBuilder {
            this.user = user
            return this
        }

        fun returnIm(returnIm: Boolean): ImOpenRequestBuilder {
            this.returnIm = returnIm
            return this
        }

        fun includeLocale(includeLocale: Boolean): ImOpenRequestBuilder {
            this.includeLocale = includeLocale
            return this
        }

        fun build(): ImOpenRequest {
            return ImOpenRequest(token, user, returnIm, includeLocale)
        }

        override fun toString(): String {
            return "ImOpenRequest.ImOpenRequestBuilder(token=" + this.token + ", user=" + this.user + ", returnIm=" + this.returnIm + ", includeLocale=" + this.includeLocale + ")"
        }
    }

    companion object {
        fun builder(): ImOpenRequestBuilder {
            return ImOpenRequestBuilder()
        }
    }
}