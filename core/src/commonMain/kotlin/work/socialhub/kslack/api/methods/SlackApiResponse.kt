package work.socialhub.kslack.api.methods

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Base class for all Slack Web API response objects.
 *
 * All response classes extend this class and are serialized from JSON responses
 * returned by the Slack API at `https://slack.com/api/{method}`.
 *
 * After making an API call, check [isOk] to determine success. If the response
 * indicates failure, inspect [error] for the error code and [warning] for
 * non-fatal warnings. Permission errors include [needed] (required scopes)
 * and [provided] (actual scopes).
 *
 * Example:
 * ```kotlin
 * val response = slack.chat().chatPostMessageBlocking(ChatPostMessageRequest(...))
 * if (response.isOk) {
 *     println("Message sent: ${response.ts}")
 * } else {
 *     println("Error: ${response.error}")
 * }
 * ```
 *
 * @see SlackApiException for HTTP-level errors (non-2xx responses)
 */
@JsExport
@Serializable
open class SlackApiResponse {
    /**
     * Indicates whether the API call succeeded.
     * Slack API returns `"ok": true` for successful calls.
     */
    @SerialName("ok")
    var isOk: Boolean = false

    /**
     * A warning message returned by the API (e.g., deprecated field usage).
     */
    var warning: String? = null

    /**
     * An error code describing the failure (e.g., "channel_not_found", "missing_scope").
     * Only populated when [isOk] is false.
     */
    var error: String? = null

    /**
     * Required OAuth scopes for the call.
     * Only present when the error is a permission/scope error.
     */
    var needed: String? = null

    /**
     * OAuth scopes actually provided with the token.
     * Only present when the error is a permission/scope error.
     */
    var provided: String? = null
}
