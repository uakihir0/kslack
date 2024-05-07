package work.socialhub.kslack.entity

import com.google.gson.annotations.SerialName

/**
 * Represents a type of conversation such as a public channel or IM.
 *
 * @see [Conversations.list API](https://api.slack.com/methods/conversations.list)
 */
enum class ConversationType(private val value: String) {
    @SerialName("public_channel")
    PUBLIC_CHANNEL("public_channel"),
    @SerialName("private_channel")
    PRIVATE_CHANNEL("private_channel"),
    @SerialName("mpim")
    MPIM("mpim"),
    @SerialName("im")
    IM("im");

    fun value(): String {
        return value
    }
}
