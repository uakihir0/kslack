package work.socialhub.kslack.api.methods

import work.socialhub.khttpclient.HttpParameter

/**
 * Interface for converting Slack API request objects into HTTP form parameters.
 *
 * All request classes implement both [SlackApiRequest] and [FormRequest].
 * The [toMap] method builds a key-value map of all request parameters, which
 * is then converted to URL-encoded form data for POST requests to the Slack API.
 *
 * The [toParams] method converts the map into a list of [HttpParameter] objects,
 * filtering to only string values. The [addParam] helper extension function
 * handles null filtering and Boolean-to-string conversion ("true" -> "1", "false" -> "0").
 *
 * Example:
 * ```kotlin
 * class ChatPostMessageRequest(
 *     override val token: String?,
 *     val channel: String?,
 *     val text: String?,
 * ) : SlackApiRequest, FormRequest {
 *
 *     override fun toMap(): Map<String, Any> = mutableMapOf<String, Any>().also {
 *         it.addParam("channel", channel)
 *         it.addParam("text", text)
 *     }
 * }
 * ```
 *
 * @see SlackApiRequest
 * @see AbstractResourceImpl
 */
interface FormRequest {

    /**
     * Converts all request parameters into a key-value map.
     * Values are stored as `Any` (typically String or Boolean) and will be
     * converted to URL-encoded form parameters.
     *
     * @return Map of parameter names to their values
     */
    fun toMap(): Map<String, Any>

    /**
     * Converts the parameter map to a list of [HttpParameter] objects
     * suitable for HTTP form encoding. Only string values are included.
     *
     * @return List of HTTP parameters for the request body
     */
    fun toParams(): List<HttpParameter> {
        return mutableListOf<HttpParameter>().also {
            toMap().forEach { (k, v) ->
                if (v is String) {
                    it.add(HttpParameter.param(k, v))
                }
            }
        }
    }

    /**
     * Helper extension to add a parameter to a map, handling nulls and Booleans.
     *
     * - `null` values are silently ignored (not added to the map)
     * - `Boolean` values are converted to `"1"` (true) or `"0"` (false)
     * - All other values are converted via `toString()`
     *
     * @param key The parameter name
     * @param value The parameter value (null, Boolean, or any other type)
     */
    fun MutableMap<String, Any>.addParam(key: String, value: Any?) {
        if (value != null) {
            if (value is Boolean) {
                this[key] = if (value) "1" else "0"
            } else {
                this[key] = value.toString()
            }
        }
    }
}
