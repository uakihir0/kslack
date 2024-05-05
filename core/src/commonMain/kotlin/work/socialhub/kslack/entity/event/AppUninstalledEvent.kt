package work.socialhub.kslack.entity.event

/**
 * This Events API-only event is sent via subscription whenever a Slack app is completely uninstalled.
 *
 *
 * You should also receive tokens_revoked events for revoked tokens.
 * An app is not uninstalled until its final user and bot tokens are revoked.
 *
 *
 * The example above details the complete Events API payload, including the event wrapper.
 * The team_id indicates which workspace uninstalled the Slack app identified by api_app_id.
 *
 *
 * https://api.slack.com/events/app_uninstalled
 */
class AppUninstalledEvent : Event {
    override val type: String = TYPE_NAME

    companion object {
        const val TYPE_NAME: String = "app_uninstalled"
    }
}