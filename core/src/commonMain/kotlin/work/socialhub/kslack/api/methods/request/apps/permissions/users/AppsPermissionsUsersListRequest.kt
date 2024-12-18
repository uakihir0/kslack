package work.socialhub.kslack.api.methods.request.apps.permissions.users

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class AppsPermissionsUsersListRequest(
    override var token: String?,

    /**
     * Paginate through collections of data by setting the cursor parameter to
     * a next_cursor attribute returned by a previous request's response_metadata.
     * Default value fetches the first "page" of the collection. See pagination for more detail.
     */
    var cursor: String?,

    /** The maximum number of items to return. */
    var limit: Int?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("cursor", cursor)
            it.addParam("limit", limit)
        }
    }
}