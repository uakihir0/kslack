package work.socialhub.kslack.entity.dialog

import com.google.gson.annotations.SerializedName

/**
 * Represents the subtype for an [DialogTextElement] or [DialogTextAreaElement]
 * In some form factors, optimized input is provided for this subtype.
 */
enum class DialogSubType(private val value: String) {
    @SerializedName("email")
    EMAIL("email"),
    @SerializedName("number")
    NUMBER("number"),
    @SerializedName("tel")
    TEL("tel"),
    @SerializedName("url")
    URL("url");

    fun value(): String {
        return value
    }
}
