package work.socialhub.kslack.api.methods.request.files.remote

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/files.remote.list
 */
class FilesRemoteListRequest(
    /** Authentication token. Requires scope: `remote_files:read` */
    override var token: String?,
    /** Filter files appearing in a specific channel, indicated by its ID. */
    var channel: String?,

    /**
     * Paginate through collections of data by setting the cursor parameter to a next_cursor attribute
     * returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection.
     * See pagination for more detail.
     */
    var cursor: String?,

    /** The maximum number of items to return. */
    var limit: Int?,
    /** Filter files created after this timestamp (inclusive). */
    var tsFrom: String?,
    /** Filter files created before this timestamp (inclusive). */
    var tsTo: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
            it.addParam("ts_from", tsFrom)
            it.addParam("ts_to", tsTo)
        }
    }
}