package work.socialhub.kslack.entity

import com.google.gson.annotations.SerialName

/**
 * An attribute included within the response of the newest Slack APIs which contains a `next_cursor`
 * value.  By using this value as a cursor parameter in a subsequent request, along with limit, you may
 * navigate through the collection page by virtual page.
 */
class ResponseMetadata {
    @SerialName("next_cursor")
    var nextCursor: String? = null
}
