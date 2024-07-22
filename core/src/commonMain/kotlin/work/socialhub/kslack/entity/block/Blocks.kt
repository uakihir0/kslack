package work.socialhub.kslack.entity.block

import com.github.seratch.jslack.api.model.ModelConfigurator
import com.github.seratch.jslack.api.model.block.element.BlockElement
import work.socialhub.kslack.entity.ModelConfigurator
import work.socialhub.kslack.entity.block.element.BlockElement

object Blocks {

    fun asBlocks(
        vararg blocks: LayoutBlock
    ): Array<out LayoutBlock> {
        return blocks
    }

    // ActionsBlock
    fun actions(configurator: ModelConfigurator<ActionsBlock.ActionsBlockBuilder?>): ActionsBlock {
        return configurator.configure(ActionsBlock.builder()).build()
    }

    fun actions(elements: Array<BlockElement>?): ActionsBlock {
        return ActionsBlock.builder().elements(elements).build()
    }

    fun actions(blockId: String?, elements: Array<BlockElement>?): ActionsBlock {
        return ActionsBlock.builder().blockId(blockId).elements(elements).build()
    }

    // ContextBlock
    fun context(configurator: ModelConfigurator<ContextBlock.ContextBlockBuilder?>): ContextBlock {
        return configurator.configure(ContextBlock.builder()).build()
    }

    fun context(elements: Array<ContextBlockElement?>?): ContextBlock {
        return ContextBlock.builder().elements(elements).build()
    }

    fun context(blockId: String?, elements: Array<ContextBlockElement?>?): ContextBlock {
        return ContextBlock.builder().blockId(blockId).elements(elements).build()
    }

    // DividerBlock
    fun divider(configurator: ModelConfigurator<DividerBlock.DividerBlockBuilder?>): DividerBlock {
        return configurator.configure(DividerBlock.builder()).build()
    }

    fun divider(blockId: String?): DividerBlock {
        return DividerBlock.builder().blockId(blockId).build()
    }

    fun divider(): DividerBlock {
        return DividerBlock.builder().build()
    }

    // FileBlock
    fun file(configurator: ModelConfigurator<FileBlock.FileBlockBuilder?>): FileBlock {
        return configurator.configure(FileBlock.builder()).build()
    }

    // ImageBlock
    fun image(configurator: ModelConfigurator<ImageBlock.ImageBlockBuilder?>): ImageBlock {
        return configurator.configure(ImageBlock.builder()).build()
    }

    // InputBlock
    fun input(configurator: ModelConfigurator<InputBlock.InputBlockBuilder?>): InputBlock {
        return configurator.configure(InputBlock.builder()).build()
    }

    // RichTextBlock
    fun richText(configurator: ModelConfigurator<RichTextBlock.RichTextBlockBuilder?>): RichTextBlock {
        return configurator.configure(RichTextBlock.builder()).build()
    }

    // SectionBlock
    fun section(configurator: ModelConfigurator<SectionBlock.SectionBlockBuilder?>): SectionBlock {
        return configurator.configure(SectionBlock.builder()).build()
    }
}
