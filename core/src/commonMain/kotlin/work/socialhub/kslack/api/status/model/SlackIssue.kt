package work.socialhub.kslack.api.status.model

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class SlackIssue {
    var id: Int? = null
    var dateCreated: String? = null
    var dateUpdated: String? = null
    var title: String? = null
    var type: String? = null
    var status: String? = null
    var url: String? = null
    var services: Array<String>? = null
    var notes: Array<Note>? = null
}

@JsExport
@Serializable
class Note {
    var dateCreated: String? = null
    var body: String? = null
}


