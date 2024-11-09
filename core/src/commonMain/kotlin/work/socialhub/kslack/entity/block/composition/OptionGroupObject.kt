package work.socialhub.kslack.entity.block.composition

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/messaging/composition-objects#option-group
 */
@JsExport
@Serializable
class OptionGroupObject {
    var label: PlainTextObject? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    var options: Array<OptionObject>? = null
}
