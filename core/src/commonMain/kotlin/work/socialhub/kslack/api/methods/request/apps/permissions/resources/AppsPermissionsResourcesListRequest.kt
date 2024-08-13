package work.socialhub.kslack.api.methods.request.apps.permissions.resources

import work.socialhub.kslack.api.methods.SlackApiRequest

class AppsPermissionsResourcesListRequest(
    override var token: String?,

    /**
     * Paginate through collections of data by setting the cursor parameter to
     * a next_cursor attribute returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection. See pagination for more detail.
     */
    var cursor: String?,

    /** The maximum number of items to return. */
    var limit: Int?
) : SlackApiRequest