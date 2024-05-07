package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://api.slack.com/methods/reactions.get
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/Reaction.java#L17
 */
@JsExport
@Serializable
class Reaction {
    var name: String? = null
    var count: Int? = null
    var users: Array<String>? = null
    var url: String? = null
}