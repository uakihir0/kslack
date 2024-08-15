package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.view.View

class ViewsPublishRequest(
    override var token: String?,
    var view: View?,
    var viewAsString: String?,
    var userId: String?,
    var hash: String?
) : SlackApiRequest