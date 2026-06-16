package work.socialhub.kslack

import work.socialhub.kslack.internal.SlackImpl
import kotlin.js.JsExport
import kotlin.js.JsName

/**
 * Factory for creating [Slack] API client instances.
 *
 * This is the entry point for all Slack API operations. Create an instance
 * using [instance] with or without an authentication token.
 *
 * **Creating a client without a token:**
 * ```kotlin
 * val slack = SlackFactory.instance()
 * // API calls must provide a token per-request
 * val response = slack.auth().authTestBlocking(AuthTestRequest(token = "xoxp-..."))
 * ```
 *
 * **Creating a client with a default token:**
 * ```kotlin
 * val slack = SlackFactory.instance("xoxp-your-token-here")
 * // API calls inherit the token; individual requests can override it
 * val response = slack.auth().authTestBlocking(AuthTestRequest(token = null))
 * ```
 *
 * **Token resolution priority** (highest to lowest):
 * 1. Request-level token (`request.token`)
 * 2. Factory-level token (constructor parameter)
 *
 * @see Slack
 * @see SlackFactory.instance
 */
@JsExport
object SlackFactory {

    /**
     * Creates a Slack API client without a default token.
     *
     * Use this when you want to provide tokens on a per-request basis.
     *
     * @return A new [Slack] instance with no default authentication
     * @see SlackFactory.instance
     */
    @JsName("createInstance")
    fun instance(): Slack {
        return SlackImpl()
    }

    /**
     * Creates a Slack API client with a default authentication token.
     *
     * All API calls will use this token unless a request-specific token
     * is provided via [SlackApiRequest.token].
     *
     * @param token The OAuth access token (e.g., `"xoxp-..."` for user token,
     *              or `"xapp-..."` for app-level token)
     * @return A new [Slack] instance configured with the given token
     * @see Slack
     * @see SlackApiRequest
     */
    @JsName("createInstanceWithToken")
    fun instance(
        token: String,
    ): Slack {
        return SlackImpl(token)
    }

    /**
     * Creates a Slack API client with a default authentication token
     * and a custom endpoint URL prefix.
     *
     * @param token The OAuth access token
     * @param apiUrl Custom base URL for API requests
     * @return A new [Slack] instance configured with the given token and endpoint
     */
    @JsName("createInstanceWithTokenAndHost")
    fun instance(
        token: String,
        apiUrl: String,
    ): Slack {
        return SlackImpl(token, apiUrl)
    }
}
