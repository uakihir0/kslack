package work.socialhub.kslack.api.methods.request.conversations

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class ConversationsCreateRequest(
    /** Authentication token. Requires scope: `conversations:write`*/
    override var token: String?,
    /** Name of the public or private channel to create */
    var name: String?,
    /** Create a private channel instead of a public one */
    var isPrivate: Boolean
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("name", name)
            it.addParam("is_private",isPrivate)
        }
    }
}
