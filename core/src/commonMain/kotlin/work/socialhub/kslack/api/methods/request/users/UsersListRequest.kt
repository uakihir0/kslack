package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class UsersListRequest(
    /** Authentication token. Requires scope: `users:read` */
    override var token: String?,

    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,

    /**
     * The maximum number of items to return.
     * Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
     */
    var limit: Int?,

    /** Set this to `true` to receive the locale for users. Defaults to `false` */
    var isIncludeLocale: Boolean,

    /**
     * Deprecated. Whether to include presence data in the output.
     * Defaults to `false`. Setting this to `true` reduces performance, especially with large teams.
     */
    @Deprecated("")
    var isPresence: Boolean,
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
            it.addParam("include_locale", isIncludeLocale)
            it.addParam("presence", isPresence)
        }
    }
}