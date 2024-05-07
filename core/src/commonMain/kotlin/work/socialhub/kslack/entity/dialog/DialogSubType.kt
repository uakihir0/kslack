package work.socialhub.kslack.entity.dialog

import com.google.gson.annotations.SerialName

/**
 * Represents the subtype for an [DialogTextElement] or [DialogTextAreaElement]
 * In some form factors, optimized input is provided for this subtype.
 */
enum class DialogSubType(private val value: String) {
    @SerialName("email")
    EMAIL("email"),
    @SerialName("number")
    NUMBER("number"),
    @SerialName("tel")
    TEL("tel"),
    @SerialName("url")
    URL("url");

    fun value(): String {
        return value
    }
}
