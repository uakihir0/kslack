package work.socialhub.kslack.entity.dialog

import work.socialhub.kslack.api.model.ModelConfigurator

object Dialogs {
    fun asElements(vararg elements: DialogElement?): Array<DialogElement> {
        return java.util.Arrays.asList(*elements)
    }

    fun asOptions(vararg options: DialogOption?): Array<DialogOption> {
        return java.util.Arrays.asList(*options)
    }

    fun dialog(configurator: ModelConfigurator<Dialog.DialogBuilder?>): Dialog {
        return configurator.configure(Dialog.builder()).build()
    }

    fun dialogOption(configurator: ModelConfigurator<DialogOption.DialogOptionBuilder?>): DialogOption {
        return configurator.configure(DialogOption.builder()).build()
    }

    fun dialogSelect(configurator: ModelConfigurator<DialogSelectElement.DialogSelectElementBuilder?>): DialogSelectElement {
        return configurator.configure(DialogSelectElement.builder()).build()
    }

    fun dialogText(configurator: ModelConfigurator<DialogTextElement.DialogTextElementBuilder?>): DialogTextElement {
        return configurator.configure(DialogTextElement.builder()).build()
    }

    fun dialogTextArea(configurator: ModelConfigurator<DialogTextAreaElement.DialogTextAreaElementBuilder?>): DialogTextAreaElement {
        return configurator.configure(DialogTextAreaElement.builder()).build()
    }
}
