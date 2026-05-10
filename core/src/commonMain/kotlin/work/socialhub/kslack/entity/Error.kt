package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents an error response from a Slack API call.
 *
 * Contains the success flag and a human-readable error message.
 * Used in parsing API error responses to determine the cause of failure.
 */
@JsExport
@Serializable
class Error {
    @SerialName("ok")
    var isOk: Boolean = false
    var error: String? = null
}