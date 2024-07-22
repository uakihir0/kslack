package work.socialhub.kslack.entity.event

import work.socialhub.kslack.entity.admin.AppRequest

/**
 * https://api.slack.com/events/app_requested
 */
class AppRequestedEvent : Event {
    override val type: String = TYPE_NAME
    var appRequest: AppRequest? = null

    companion object {
        const val TYPE_NAME: String = "app_requested"
    }
}