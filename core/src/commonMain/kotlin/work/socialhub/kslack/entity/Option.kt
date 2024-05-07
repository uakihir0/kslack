package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/Option.java
 */
@JsExport
@Serializable
class Option {
    var text: String? = null
    var value: String? = null
}
