package work.socialhub.kslack.entity.block

object Blocks {

    fun asBlocks(
        vararg blocks: LayoutBlock
    ): Array<out LayoutBlock> {
        return blocks
    }

    // TODO: Builder DSL functions (actions, context, divider, file, image, input, richText, section)
    // are not yet ported to Kotlin Multiplatform. The original Java SDK used Lombok @Builder
    // patterns which don't exist in KMP. These should be reimplemented as Kotlin DSL builders
    // if needed.
}
