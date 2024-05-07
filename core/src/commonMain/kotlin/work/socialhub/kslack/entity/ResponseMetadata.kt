package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * An attribute included within the response of the newest Slack APIs which contains a `next_cursor`
 * value.  By using this value as a cursor parameter in a subsequent request, along with limit, you may
 * navigate through the collection page by virtual page.
 */
@JsExport
@Serializable
class ResponseMetadata {

    @SerialName("next_cursor")
    var nextCursor: String? = null

    // e.g., [ERROR] must be less than 100 [json-pointer:/limit]
    var messages: Array<String>? = null

    // e.g., method_deprecated
    var warnings: Array<String>? = null
}
