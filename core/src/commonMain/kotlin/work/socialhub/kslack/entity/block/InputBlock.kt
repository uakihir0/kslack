package work.socialhub.kslack.entity.block

import work.socialhub.kslack.entity.block.composition.PlainTextObject
import work.socialhub.kslack.entity.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#input
 */
class InputBlock : LayoutBlock {
    override val type: String = "input"

    var blockId: String? = null

    /**
     * A label that appears above an input element in the form of a text object that must have type of plain_text.
     * Maximum length for the text in this field is 2000 characters.
     */
    var label: PlainTextObject? = null

    /**
     * An plain-text input element, a select menu element, or a multi-select menu element.
     */
    var element: BlockElement? = null

    /**
     * An optional hint that appears below an input element in a lighter grey.
     * It must be a a text object with a type of plain_text.
     * Maximum length for the text in this field is 2000 characters.
     */
    var hint: String? = null

    /**
     * A boolean that indicates whether the input element may be empty when a user submits the modal.
     * Defaults to false.
     */
    var isOptional: Boolean = false

}
