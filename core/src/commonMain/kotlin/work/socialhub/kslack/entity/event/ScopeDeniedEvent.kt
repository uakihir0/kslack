package work.socialhub.kslack.entity.event

/**
 * The inner event describes an array of scopes you requested but were denied access to.
 * It includes a trigger_id you may use with dialog.open or Permissions API requests.
 *
 *
 * https://api.slack.com/events/scope_denied
 */
class ScopeDeniedEvent : Event {
    override val type: String = TYPE_NAME
    var scopes: Array<String>? = null
    var triggerId: String? = null

    companion object {
        const val TYPE_NAME: String = "scope_denied"
    }
}