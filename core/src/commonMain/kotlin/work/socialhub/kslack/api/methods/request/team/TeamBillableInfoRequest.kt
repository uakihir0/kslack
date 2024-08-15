package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamBillableInfoRequest(
    /** Authentication token. Requires scope: `admin` */
    override var token: String?,
    /** A user to retrieve the billable information for. Defaults to all users. */
    var user: String?
) : SlackApiRequest