package work.socialhub.kslack.entity.block.composition

object BlockCompositions {

    fun asSectionFields(
        vararg elements: TextObject
    ): Array<TextObject> {
        return arrayOf(*elements)
    }

    fun asOptionGroups(
        vararg optionGroups: OptionGroupObject
    ): Array<OptionGroupObject> {
        return arrayOf(*optionGroups)
    }

    fun asOptions(
        vararg options: OptionObject
    ): Array<OptionObject> {
        return arrayOf(*options)
    }
}

