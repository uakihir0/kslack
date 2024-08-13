package work.socialhub.kslack.api.methods.request.channels

import work.socialhub.kslack.api.methods.SlackApiRequest

class ChannelsListRequest(
    /**
     * Authentication token. Requires scope: `channels:read`
     */
    override var token: String?,
    /**
     * Exclude the `members` collection from each `channel`
     */
    var isExcludeMembers: Boolean,
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
    /**
     * Exclude archived channels from the list
     */
    var isExcludeArchived: Boolean
) : SlackApiRequest