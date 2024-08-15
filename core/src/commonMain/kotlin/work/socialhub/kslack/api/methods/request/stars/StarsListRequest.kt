package work.socialhub.kslack.api.methods.request.stars

import work.socialhub.kslack.api.methods.SlackApiRequest

class StarsListRequest(
    /** Authentication token. Requires scope: `stars:read` */
    override var token: String?,
    var count: Int?,
    var page: Int?
) : SlackApiRequest