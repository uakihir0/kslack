package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kmastodon.internal.InternalUtility.toJson
import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.view.View

class ViewsUpdateRequest(
    override var token: String?,
    var view: View?,
    var viewAsString: String?,
    var externalId: String?,
    var hash: String?,
    var viewId: String?
) : SlackApiRequest, FormRequest  {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            if (viewAsString != null) {
                it.addParam("view", viewAsString)
            } else {
                it.addParam("view", toJson(view))
            }
            it.addParam("external_id", externalId)
            it.addParam("hash", hash)
            it.addParam("view_id", viewId)
        }
    }
}