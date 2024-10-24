package work.socialhub.kslack.api.methods.request.usergroups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class UsergroupsCreateRequest(
    /** Authentication token. Requires scope: `usergroups:write` */
    override var token: String?,
    /** A name for the User Group. Must be unique among User Groups. */
    var name: String?,
    /** A mention handle. Must be unique among channels, users and User Groups. */
    var handle: String?,
    /** A short description of the User Group. */
    var description: String?,
    /** A comma separated string of encoded channel IDs for which the User Group uses as a default. */
    var channels: Array<String>?,
    /** Include the number of users in each User Group. */
    var isIncludeCount: Boolean
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("name", name)
            it.addParam("handle", handle)
            it.addParam("description", description)
            if (channels != null) {
                it.addParam("channels", channels!!.joinToString(","))
            }
            it.addParam("include_count", isIncludeCount)
        }
    }
}