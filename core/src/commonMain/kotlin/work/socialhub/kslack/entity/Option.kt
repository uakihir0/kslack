package work.socialhub.kslack.entity

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents an option in a select menu or multi-select menu within a Block Kit composition.
 *
 * Each option has display `text` and a `value` that is sent when selected.
 * Used in `Action.options`, `Action.selectedOptions`, and `ActionOption.options`.
 */
@JsExport
@Serializable
class Option {
    var text: String? = null
    var value: String? = null
}
