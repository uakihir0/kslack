package work.socialhub.kslack.api.methods

/**
 * Base interface for all Slack Web API request objects.
 *
 * All request classes must implement this interface to be recognized by the
 * [AbstractResourceImpl] HTTP execution methods. The [token] property provides
 * authentication credentials for the API call. When null, the factory-level token
 * is used instead.
 *
 * Request objects also implement [FormRequest], which converts fields into
 * URL-encoded form parameters via [FormRequest.toMap].
 *
 * @see [FormRequest]
 * @see AbstractResourceImpl
 */
interface SlackApiRequest {
    /**
     * Authentication token for the Slack API call.
     * Can be null if a token was provided when creating the [SlackFactory] instance.
     * If both are null, an [IllegalStateException] will be thrown at runtime.
     */
    val token: String?
}
