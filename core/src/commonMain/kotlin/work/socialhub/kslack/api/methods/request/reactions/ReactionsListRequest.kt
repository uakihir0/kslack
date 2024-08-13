package work.socialhub.kslack.api.methods.request.reactions

import work.socialhub.kslack.api.methods.SlackApiRequest

class ReactionsListRequest(
    /** Authentication token. Requires scope: `reactions:read` */
    override var token: String?,
    /** Show reactions made by this user. Defaults to the authed user. */
    var user: String?,
    /** If true always return the complete reaction list. */
    var isFull: Boolean,
    var count: Int?,
    var page: Int?
) : SlackApiRequest