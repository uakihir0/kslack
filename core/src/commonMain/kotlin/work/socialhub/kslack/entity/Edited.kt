package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Records when and by whom a message was last edited.
 *
 * Included in message objects to track edit history. The `ts` field
 * contains the timestamp of the most recent edit.
 */
@JsExport
@Serializable
class Edited {
    var user: String? = null
    var ts: String? = null
}
