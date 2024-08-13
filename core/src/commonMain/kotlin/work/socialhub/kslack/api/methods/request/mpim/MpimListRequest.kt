package work.socialhub.kslack.api.methods.request.mpim

import work.socialhub.kslack.api.methods.SlackApiRequest

class MpimListRequest(

    /** Authentication token. Requires scope: `mpim:read` */
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
    var limit: Int?, var getLatest: Boolean?
) : SlackApiRequest