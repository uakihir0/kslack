package work.socialhub.kslack.entity.block.composition

import com.github.seratch.jslack.api.model.ModelConfigurator

object BlockCompositions {
    fun asSectionFields(vararg elements: TextObject?): List<TextObject> {
        return java.util.Arrays.asList(*elements)
    }

    fun asOptionGroups(vararg optionGroups: OptionGroupObject?): List<OptionGroupObject> {
        return java.util.Arrays.asList(*optionGroups)
    }

    fun asOptions(vararg options: OptionObject?): List<OptionObject> {
        return java.util.Arrays.asList(*options)
    }

    // ConfirmationDialogObject
    fun confirmationDialog(
        configurator: ModelConfigurator<ConfirmationDialogObject.ConfirmationDialogObjectBuilder?>
    ): ConfirmationDialogObject {
        return configurator.configure(ConfirmationDialogObject.builder()).build()
    }

    // PlainTextObject
    fun plainText(
        configurator: ModelConfigurator<PlainTextObject.PlainTextObjectBuilder?>
    ): PlainTextObject {
        return configurator.configure(PlainTextObject.builder()).build()
    }

    fun plainText(text: String?): PlainTextObject {
        return PlainTextObject.builder().text(text).build()
    }

    fun plainText(text: String?, emoji: Boolean): PlainTextObject {
        return PlainTextObject.builder().text(text).emoji(emoji).build()
    }

    // MarkdownTextObject
    fun markdownText(configurator: ModelConfigurator<MarkdownTextObject.MarkdownTextObjectBuilder?>): MarkdownTextObject {
        return configurator.configure(MarkdownTextObject.builder()).build()
    }

    fun markdownText(text: String?): MarkdownTextObject {
        return MarkdownTextObject.builder().text(text).build()
    }

    // OptionGroupObject
    fun optionGroup(configurator: ModelConfigurator<OptionGroupObject.OptionGroupObjectBuilder?>): OptionGroupObject {
        return configurator.configure(OptionGroupObject.builder()).build()
    }

    // OptionObject
    fun option(configurator: ModelConfigurator<OptionObject.OptionObjectBuilder?>): OptionObject {
        return configurator.configure(OptionObject.builder()).build()
    }

    fun option(text: PlainTextObject?, value: String?): OptionObject {
        return OptionObject.builder().text(text).value(value).build()
    }
}

