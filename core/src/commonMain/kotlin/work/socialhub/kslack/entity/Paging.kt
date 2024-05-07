package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * - https://github.com/slackapi/java-slack-sdk/blob/main/slack-api-model/src/main/java/com/slack/api/model/Paging.java
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
