package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Action {
    var id: String? = null
    var name: String? = null
    var text: String? = null
    var style: String? = null
    var type: Type? = Type.BUTTON
    var value: String? = null
    var confirm: Confirmation? = null
    var options: Array<Option>? = null
    var selectedOptions: Array<Option>? = null
    var dataSource: String? = null
    var minQueryLength: Int? = null
    var optionGroups: Array<ActionOptionGroup>? = null
    var url: String? = null
}


/**
 * Represents the type of action (e.g Message button or message menu)
 *
 * @see [Interaction Types](https://api.slack.com/interactive-messages.interaction_types)
 */
@JsExport
@Serializable
enum class Type(
    private val value: String
) {
    /**
     * @see [Message button](https://api.slack.com/docs/message-buttons)
     */
    @SerialName("button")
    BUTTON("button"),

    /**
     * @see [Message menus](https://api.slack.com/docs/message-menus)
     */
    @SerialName("select")
    SELECT("select");

    fun value(): String {
        return value
    }
}

@JsExport
@Serializable
class ActionOptionGroup {
    var text: String? = null
    var options: Array<ActionOption>? = null
}

@JsExport
@Serializable
class ActionOption {
    var text: String? = null
    var value: String? = null
}