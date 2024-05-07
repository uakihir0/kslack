package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/ThreadInfo.java#L6
 */
@JsExport
@Serializable
class ThreadInfo {

    @SerialName("complete")
    var isComplete: Boolean = false

    var count: Int? = null
}
