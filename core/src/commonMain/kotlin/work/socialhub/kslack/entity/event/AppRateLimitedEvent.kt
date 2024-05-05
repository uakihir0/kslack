package work.socialhub.kslack.entity.event

/**
 * https://api.slack.com/events/app_rate_limited
 */
class AppRateLimitedEvent : Event {
    override val type: String = TYPE_NAME

    /**
     * the same shared token used to verify other events in the Events API
     */
    var token: String? = null

    /**
     * subscriptions between your app and the workspace with this ID are being rate limited
     */
    var teamId: String? = null

    /**
     * a rounded epoch time value indicating the minute
     * your application became rate limited for this workspace.
     * 1518467820 is at 2018-02-12 20:37:00 UTC.
     */
    var minuteRateLimited: Int? = null

    /**
     * your application's ID, especially useful
     * if you have multiple applications working with the Events API
     */
    var apiAppId: String? = null

    companion object {
        const val TYPE_NAME: String = "app_rate_limited"
    }
}
