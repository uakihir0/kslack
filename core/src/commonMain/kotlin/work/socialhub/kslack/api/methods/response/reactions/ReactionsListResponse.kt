package work.socialhub.kslack.api.methods.response.reactions

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Item
import work.socialhub.kslack.entity.Paging
import kotlin.js.JsExport

@JsExport
@Serializable
class ReactionsListResponse : SlackApiResponse() {
    var items: Array<Item>? = null
    var paging: Paging? = null
}

