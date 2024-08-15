package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.entity.view.View

class ViewsPushRequest(
    override var token: String?,
    var triggerId: String?,
    var view: View?,
    var viewAsString: String?
) : SlackApiRequest
