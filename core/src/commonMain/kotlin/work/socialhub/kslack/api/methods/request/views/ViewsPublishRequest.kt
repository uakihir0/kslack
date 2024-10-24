package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kmastodon.internal.InternalUtility.toJson
import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.view.View

class ViewsPublishRequest(
    override var token: String?,
    var view: View?,
    var viewAsString: String?,
    var userId: String?,
    var hash: String?
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("user_id", userId)
            if (viewAsString != null) {
                it.addParam("view", viewAsString)
            } else {
                it.addParam("view", toJson(view))
            }
            it.addParam("hash", hash)
        }
    }
}