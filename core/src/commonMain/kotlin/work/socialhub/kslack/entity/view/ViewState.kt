package work.socialhub.kslack.entity.view

import kotlinx.serialization.Serializable
import work.socialhub.kslack.entity.block.composition.PlainTextObject
import kotlin.js.JsExport

@JsExport
@Serializable
class ViewState {
    // block_id, action_id
    var values: Map<String, Map<String, Value>>? = null
}

/**
 * This class may miss some attributes.
 * If you find missing ones, let us know at https://github.com/seratch/jslack/issues
 */
@JsExport
@Serializable
class Value {
    var type: String? = null
    var value: String? = null
    var selectedDate: String? = null
    var selectedConversation: String? = null
    var selectedChannel: String? = null
    var selectedUser: String? = null
    var selectedOption: SelectedOption? = null
    var selectedUsers: Array<String>? = null
}

@JsExport
@Serializable
class SelectedOption {
    var text: PlainTextObject? = null
    var value: String? = null
}