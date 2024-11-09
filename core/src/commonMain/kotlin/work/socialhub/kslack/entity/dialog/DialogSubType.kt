package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents the subtype for an [DialogTextElement] or [DialogTextAreaElement]
 * In some form factors, optimized input is provided for this subtype.
 */
@JsExport
@Serializable
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
