package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.view.View

class ViewsUpdateRequest(
    override var token: String?,
    var view: View?,
    var viewAsString: String?,
    var externalId: String?,
    var hash: String?,
    var viewId: String?
) : SlackApiRequest