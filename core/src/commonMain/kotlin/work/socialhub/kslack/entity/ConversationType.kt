package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a type of conversation such as a public channel or IM.
 *
 * @see [Conversations.list API](https://api.slack.com/methods/conversations.list)
 */
@JsExport
@Serializable
enum class ConversationType(
    val value: String
) {
    @SerialName("public_channel")
    PUBLIC_CHANNEL("public_channel"),

    @SerialName("private_channel")
    PRIVATE_CHANNEL("private_channel"),

    @SerialName("mpim")
    MPIM("mpim"),

    @SerialName("im")
    IM("im");
}
