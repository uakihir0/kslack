package work.socialhub.kslack.api.methods.request.team

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest

class TeamIntegrationLogsRequest(
    /** Authentication token. Requires scope: `admin` */
    override var token: String?,
    /** Filter logs to this service. Defaults to all logs. */
    var serviceId: String?,
    /** Filter logs generated by this user\u2019s actions. Defaults to all logs. */
    var user: String?,
    /** Filter logs to this Slack app. Defaults to all logs. */
    var appId: Int?,
    /** Filter logs with this change type. Defaults to all logs. */
    var changeType: String?,
    var count: Int?,
    var page: Int?,
) : SlackApiRequest, FormRequest{

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("service_id", serviceId)
            it.addParam("user", user)
            it.addParam("change_type", changeType)
            it.addParam("count", count)
            it.addParam("page", page)
        }
    }
}