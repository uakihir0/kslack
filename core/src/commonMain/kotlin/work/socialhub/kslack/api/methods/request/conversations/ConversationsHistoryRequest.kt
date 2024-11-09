package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ConversationsHistoryRequest(
    /**
     * Authentication token. Requires scope: `conversations:history`
     */
    override var token: String?,
    /**
     * Conversation ID to fetch history for.
     */
    var channel: String?,
    /**
     * Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute
     * returned by a previous request's `response_metadata`.
     *
     *
     * Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
     */
    var cursor: String?,
    /**
     * Start of time range of messages to include in results.
     */
    var oldest: String?,
    /**
     * End of time range of messages to include in results.
     */
    var latest: String?,
    /**
     * The maximum number of items to return. Fewer than the requested number of items may be returned,
     * even if the end of the users list hasn't been reached.
     */
    var limit: Int?,
    /**
     * Include messages with latest or oldest timestamp in results only when either timestamp is specified.
     */
    var isInclusive: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("cursor", cursor)
            it.addParam("latest", latest)
            it.addParam("limit", limit)
            it.addParam("oldest", oldest)
            it.addParam("inclusive", isInclusive)
        }
    }
}
