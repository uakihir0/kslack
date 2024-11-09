package work.socialhub.kslack.api.methods.response.dialog

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.dialog.DialogResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class DialogOpenResponse : SlackApiResponse() {
    var responseMetadata: DialogResponseMetadata? = null
}
