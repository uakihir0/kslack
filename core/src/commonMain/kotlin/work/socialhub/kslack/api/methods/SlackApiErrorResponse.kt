package work.socialhub.kslack.api.methods

import kotlinx.serialization.Serializable

/**
 * Represents a structured error response from the Slack Web API.
 *
 * Extends [SlackApiResponse] to provide common error fields such as
 * [SlackApiResponse.error], [SlackApiResponse.needed], and
 * [SlackApiResponse.provided]. Used exclusively in [SlackApiException]
 * for parsing non-2xx HTTP responses.
 *
 * @see SlackApiException
 * @see SlackApiResponse
 */
@Serializable
class SlackApiErrorResponse : SlackApiResponse()