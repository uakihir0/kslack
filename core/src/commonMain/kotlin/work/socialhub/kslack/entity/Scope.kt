package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents OAuth scopes organized by Slack entity type.
 *
 * Groups scope strings by the type of resource they grant access to,
 * including app home, team, channel, group, multi-party DM, direct message,
 * and user-scoped permissions. Used in `auth.test` responses.
 *
 * @see <a href="https://api.slack.com/docs/oauth">OAuth scopes reference</a>
 */
@JsExport
@Serializable
class Scope {
    var appHome: Array<String>? = null
    var team: Array<String>? = null
    var channel: Array<String>? = null
    var group: Array<String>? = null
    var mpim: Array<String>? = null
    var im: Array<String>? = null
    var user: Array<String>? = null
}