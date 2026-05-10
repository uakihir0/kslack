package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a user login record with authentication details.
 *
 * Contains user identification, login timestamps, access count,
 * IP address, user agent, and geolocation information (ISP, country, region).
 * Used in `team.accessLogs` responses.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/team.accessLogs">team.accessLogs</a>
 */
@JsExport
@Serializable
class Login {
    var userId: String? = null
    var username: String? = null
    var dateFirst: Int? = null
    var dateLast: Int? = null
    var count: Int? = null
    var ip: String? = null
    var userAgent: String? = null
    var isp: String? = null
    var country: String? = null
    var region: String? = null
}
