package work.socialhub.kslack.api.methods.request.groups

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class GroupsSetTopicRequest(
    /** Authentication token. Requires scope: `groups:write` */
    override var token: String?,
    /** The new topic */
    var channel: String?,
    /** Private channel to set the topic of */
    var topic: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("channel", channel)
            it.addParam("topic", topic)
        }
    }
}