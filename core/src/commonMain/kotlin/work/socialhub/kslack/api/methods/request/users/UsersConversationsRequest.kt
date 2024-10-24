package work.socialhub.kslack.api.methods.request.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.ConversationType

/**
 * List conversations the calling user may access.
 */
class UsersConversationsRequest(
    /** Authentication token. Requires scope: `conversations:read` */
    override var token: String?,

    /**
     * Browse conversations by a specific user ID's membership.
     * Non-public channels are restricted to those where the calling user shares membership."
     */
    var user: String?,

    /**
     * Paginate through collections of data by setting the `cursor` parameter to
     * a `next_cursor` attribute returned by a previous request's `response_metadata`.
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,

    /** Set to `true` to exclude archived channels from the list */
    var isExcludeArchived: Boolean,

    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
     */
    var limit: Int?,

    /**
     * Mix and match channel types by providing a comma-separated list of
     * any combination of `public_channel`, `private_channel`, `mpim`, `im`
     */
    var types: Array<ConversationType>?,
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user", user)
            it.addParam("cursor", cursor)
            it.addParam("exclude_archived", isExcludeArchived)
            it.addParam("limit", limit)

            if (types != null) {
                val typeValues = types!!.map { it.value }
                it.addParam("types", typeValues.joinToString(","))
            }
        }
    }
}