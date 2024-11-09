package work.socialhub.kslack.entity.block.element

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.ConfirmationDialogObject
import work.socialhub.kslack.entity.block.composition.OptionGroupObject
import work.socialhub.kslack.entity.block.composition.OptionObject
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

/**
 * https://api.slack.com/reference/block-kit/block-elements#multi_select
 */
@JsExport
@Serializable
class MultiStaticSelectElement : BlockElement() {
    val type: String = TYPE
    var fallback: String? = null

    var placeholder: PlainTextObject? = null
    var actionId: String? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    var options: Array<OptionObject>? = null

    // https://github.com/seratch/jslack/pull/103
    // The reason I didn't initialize the Array<> fields is because Slack (sometimes) gives errors
    // when it encounters an empty list in the generated JSON.
    // The proper solution if/when you don't want un-initialized fields is to have a Gson type adapter that skips empty lists
    // (e.g. something like https://stackoverflow.com/questions/11942118/how-do-you-get-gson-to-omit-null-or-empty-objects-and-empty-arrays-and-lists)
    var optionGroups: Array<OptionGroupObject>? = null

    var initialOptions: Array<OptionObject>? = null
    var confirm: ConfirmationDialogObject? = null
    var maxSelectedItems: Int? = null


    companion object {
        const val TYPE: String = "multi_static_select"
    }
}
