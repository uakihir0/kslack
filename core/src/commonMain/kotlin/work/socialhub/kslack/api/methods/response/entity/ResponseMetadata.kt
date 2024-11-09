package work.socialhub.kslack.api.methods.response.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class ResponseMetadata {
    var messages: Array<String>? = null
}
