package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamAccessLogsRequest(
    /** Authentication token. Requires scope: `admin` */
    override var token: String?,
    /** End of time range of logs to include in results (inclusive). */
    var before: Int?,
    var count: Int?,
    var page: Int?
) : SlackApiRequest