package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.composition.PlainTextObject
import com.github.seratch.jslack.api.model.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#input
 */
class InputBlock : LayoutBlock {
    override val type: String = TYPE

    var blockId: String? = null

    /**
     * A label that appears above an input element in the form of a text object that must have type of plain_text.
     * Maximum length for the text in this field is 2000 characters.
     */
    private var label: PlainTextObject? = null

    /**
     * An plain-text input element, a select menu element, or a multi-select menu element.
     */
    private var element: BlockElement? = null

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

    constructor(blockId: String?, label: PlainTextObject?, element: BlockElement?, hint: String?, optional: Boolean) {
        this.blockId = blockId
        this.label = label
        this.element = element
        this.hint = hint
        this.isOptional = optional
    }

    constructor()

    fun getLabel(): PlainTextObject? {
        return this.label
    }

    fun getElement(): BlockElement? {
        return this.element
    }

    fun setLabel(label: PlainTextObject?) {
        this.label = label
    }

    fun setElement(element: BlockElement?) {
        this.element = element
    }

    class InputBlockBuilder internal constructor() {
        private var blockId: String? = null
        private var label: PlainTextObject? = null
        private var element: BlockElement? = null
        private var hint: String? = null
        private var optional = false

        fun blockId(blockId: String?): InputBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun label(label: PlainTextObject?): InputBlockBuilder {
            this.label = label
            return this
        }

        fun element(element: BlockElement?): InputBlockBuilder {
            this.element = element
            return this
        }

        fun hint(hint: String?): InputBlockBuilder {
            this.hint = hint
            return this
        }

        fun optional(optional: Boolean): InputBlockBuilder {
            this.optional = optional
            return this
        }

        fun build(): InputBlock {
            return InputBlock(blockId, label, element, hint, optional)
        }

        override fun toString(): String {
            return "InputBlock.InputBlockBuilder(blockId=" + this.blockId + ", label=" + this.label + ", element=" + this.element + ", hint=" + this.hint + ", optional=" + this.optional + ")"
        }
    }

    companion object {
        const val TYPE: String = "input"
        fun builder(): InputBlockBuilder {
            return InputBlockBuilder()
        }
    }
}
