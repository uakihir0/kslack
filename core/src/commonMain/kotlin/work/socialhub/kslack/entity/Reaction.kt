package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents an emoji reaction on a Slack message, file, or file comment.
 *
 * Includes the emoji name, user count, list of user IDs who reacted,
 * and a URL to the emoji image. Used in responses from `reactions.get`
 * and `reactions.list`.
 *
 * @see <a href="https://api.slack.com/methods/reactions.get">reactions.get</a>
 */
@JsExport
@Serializable
class Reaction {
    var name: String? = null
    var count: Int? = null
    var users: Array<String>? = null
    var url: String? = null
}