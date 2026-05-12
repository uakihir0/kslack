package work.socialhub.kslack.api.status.model

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a Slack service incident or status update.
 *
 * Contains the incident ID, title, type, current status, affected services,
 * timestamp information, and a timeline of status notes.
 * Queried from the Slack Status API via `status.history()`.
 */
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

/**
 * Represents a single update note in a Slack incident timeline.
 *
 * Contains the timestamp and text body of a status change note.
 */
@JsExport
@Serializable
class Note {
    var dateCreated: String? = null
    var body: String? = null
}


