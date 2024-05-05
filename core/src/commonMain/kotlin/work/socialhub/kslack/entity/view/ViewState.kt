package work.socialhub.kslack.entity.view

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject

class ViewState {
    // block_id, action_id
    var values: Map<String, Map<String, Value>>? = null

    constructor(values: Map<String, Map<String, Value>>?) {
        this.values = values
    }

    constructor()

    /**
     * This class may miss some attributes.
     * If you find missing ones, let us know at https://github.com/seratch/jslack/issues
     */
    class Value {
        var type: String? = null
        var value: String? = null
        var selectedDate: String? = null
        var selectedConversation: String? = null
        var selectedChannel: String? = null
        var selectedUser: String? = null
        var selectedOption: SelectedOption? = null
        var selectedUsers: List<String>? = null
    }

    class SelectedOption {
        var text: PlainTextObject? = null
        var value: String? = null
    }

    class ViewStateBuilder internal constructor() {
        private var values: Map<String, Map<String, Value>>? = null

        fun values(values: Map<String, Map<String, Value>>?): ViewStateBuilder {
            this.values = values
            return this
        }

        fun build(): ViewState {
            return ViewState(values)
        }

        override fun toString(): String {
            return "ViewState.ViewStateBuilder(values=" + this.values + ")"
        }
    }

    companion object {
        fun builder(): ViewStateBuilder {
            return ViewStateBuilder()
        }
    }
}
