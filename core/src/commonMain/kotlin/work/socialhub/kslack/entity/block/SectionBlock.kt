package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.block.composition.TextObject
import com.github.seratch.jslack.api.model.block.element.BlockElement

/**
 * https://api.slack.com/reference/messaging/blocks#section
 */
class SectionBlock : LayoutBlock {
    override val type: String = TYPE
    private var text: TextObject? = null
    var blockId: String? = null
    private var fields: List<TextObject>? = null
    private var accessory: BlockElement? = null

    constructor(text: TextObject?, blockId: String?, fields: List<TextObject>?, accessory: BlockElement?) {
        this.text = text
        this.blockId = blockId
        this.fields = fields
        this.accessory = accessory
    }

    constructor()

    fun getText(): TextObject? {
        return this.text
    }

    fun getFields(): List<TextObject>? {
        return this.fields
    }

    fun getAccessory(): BlockElement? {
        return this.accessory
    }

    fun setText(text: TextObject?) {
        this.text = text
    }

    fun setFields(fields: List<TextObject>?) {
        this.fields = fields
    }

    fun setAccessory(accessory: BlockElement?) {
        this.accessory = accessory
    }

    class SectionBlockBuilder internal constructor() {
        private var text: TextObject? = null
        private var blockId: String? = null
        private var fields: List<TextObject>? = null
        private var accessory: BlockElement? = null

        fun text(text: TextObject?): SectionBlockBuilder {
            this.text = text
            return this
        }

        fun blockId(blockId: String?): SectionBlockBuilder {
            this.blockId = blockId
            return this
        }

        fun fields(fields: List<TextObject>?): SectionBlockBuilder {
            this.fields = fields
            return this
        }

        fun accessory(accessory: BlockElement?): SectionBlockBuilder {
            this.accessory = accessory
            return this
        }

        fun build(): SectionBlock {
            return SectionBlock(text, blockId, fields, accessory)
        }

        override fun toString(): String {
            return "SectionBlock.SectionBlockBuilder(text=" + this.text + ", blockId=" + this.blockId + ", fields=" + this.fields + ", accessory=" + this.accessory + ")"
        }
    }

    companion object {
        const val TYPE: String = "section"
        fun builder(): SectionBlockBuilder {
            return SectionBlockBuilder()
        }
    }
}
