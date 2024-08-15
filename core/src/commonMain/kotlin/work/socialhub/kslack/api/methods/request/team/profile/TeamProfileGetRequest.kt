package work.socialhub.kslack.api.methods.request.team.profile

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamProfileGetRequest(
    /** Authentication token. Requires scope: `users.profile:read` */
    override var token: String?,
    /** Filter by visibility. */
    var visibility: String?
) : SlackApiRequest