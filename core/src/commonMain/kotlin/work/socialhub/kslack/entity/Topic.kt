package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/Topic.java#L6
 */
@JsExport
@Serializable
class Topic {

    var value: String? = null
    var creator: String? = null

    @SerialName("last_set")
    var lastSet: Int? = null
}
