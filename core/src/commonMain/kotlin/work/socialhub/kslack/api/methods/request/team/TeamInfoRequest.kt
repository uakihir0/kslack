package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamInfoRequest(
    /** Authentication token. Requires scope: `team:read` */
    override var token: String?
) : SlackApiRequest