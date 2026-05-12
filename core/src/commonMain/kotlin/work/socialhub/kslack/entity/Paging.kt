package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents pagination metadata in Slack API responses.
 *
 * Contains page number, total count, per-page count, and total pages
 * for paginated results. Used in search and list API responses.
 * The `iid` field is specific to search results.
 */
@JsExport
@Serializable
class Paging {

    var iid: String? = null // search
    var count: Int? = null
    var total: Int? = null
    var page: Int? = null
    var pages: Int? = null

    @SerialName("per_page")
    var perPage: Int? = null

    var spill: Int? = null
}
