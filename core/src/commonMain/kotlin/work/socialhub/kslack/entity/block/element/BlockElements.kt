package work.socialhub.kslack.entity.block.element

import work.socialhub.kslack.api.model.ModelConfigurator

object BlockElements {
    fun asElements(vararg elements: BlockElement?): Array<BlockElement> {
        return java.util.Arrays.asList(*elements)
    }

    fun asContextElements(vararg elements: ContextBlockElement?): Array<ContextBlockElement> {
        return java.util.Arrays.asList(*elements)
    }

    fun asRichTextElements(vararg elements: RichTextElement?): Array<RichTextElement> {
        return java.util.Arrays.asList(*elements)
    }

    // ButtonElement
    fun button(configurator: ModelConfigurator<ButtonElement.ButtonElementBuilder?>): ButtonElement {
        return configurator.configure(ButtonElement.builder()).build()
    }

    // OverflowMenuElement
    fun overflowMenu(configurator: ModelConfigurator<OverflowMenuElement.OverflowMenuElementBuilder?>): OverflowMenuElement {
        return configurator.configure(OverflowMenuElement.builder()).build()
    }

    // PlainTextInputElement
    fun plainTextInput(configurator: ModelConfigurator<PlainTextInputElement.PlainTextInputElementBuilder?>): PlainTextInputElement {
        return configurator.configure(PlainTextInputElement.builder()).build()
    }

    // DatePickerElement
    fun datePicker(configurator: ModelConfigurator<DatePickerElement.DatePickerElementBuilder?>): DatePickerElement {
        return configurator.configure(DatePickerElement.builder()).build()
    }

    // ImageElement
    fun image(configurator: ModelConfigurator<ImageElement.ImageElementBuilder?>): ImageElement {
        return configurator.configure(ImageElement.builder()).build()
    }

    // RadioButtonsElement
    fun radioButtons(configurator: ModelConfigurator<RadioButtonsElement.RadioButtonsElementBuilder?>): RadioButtonsElement {
        return configurator.configure(RadioButtonsElement.builder()).build()
    }

    // ------------------------------------------------
    // Select Elements
    // ------------------------------------------------
    // ChannelsSelectElement
    fun channelsSelect(configurator: ModelConfigurator<ChannelsSelectElement.ChannelsSelectElementBuilder?>): ChannelsSelectElement {
        return configurator.configure(ChannelsSelectElement.builder()).build()
    }

    // ConversationsSelectElement
    fun conversationsSelect(configurator: ModelConfigurator<ConversationsSelectElement.ConversationsSelectElementBuilder?>): ConversationsSelectElement {
        return configurator.configure(ConversationsSelectElement.builder()).build()
    }

    // ExternalSelectElement
    fun externalSelect(configurator: ModelConfigurator<ExternalSelectElement.ExternalSelectElementBuilder?>): ExternalSelectElement {
        return configurator.configure(ExternalSelectElement.builder()).build()
    }

    // StaticSelectElement
    fun staticSelect(configurator: ModelConfigurator<StaticSelectElement.StaticSelectElementBuilder?>): StaticSelectElement {
        return configurator.configure(StaticSelectElement.builder()).build()
    }

    // UsersSelectElement
    fun usersSelect(configurator: ModelConfigurator<UsersSelectElement.UsersSelectElementBuilder?>): UsersSelectElement {
        return configurator.configure(UsersSelectElement.builder()).build()
    }

    // ------------------------------------------------
    // Multi Select Elements
    // ------------------------------------------------
    // MultiChannelsSelectElement
    fun multiChannelsSelect(configurator: ModelConfigurator<MultiChannelsSelectElement.MultiChannelsSelectElementBuilder?>): MultiChannelsSelectElement {
        return configurator.configure(MultiChannelsSelectElement.builder()).build()
    }

    // MultiConversationsSelectElement
    fun multiConversationsSelect(configurator: ModelConfigurator<MultiConversationsSelectElement.MultiConversationsSelectElementBuilder?>): MultiConversationsSelectElement {
        return configurator.configure(MultiConversationsSelectElement.builder()).build()
    }

    // MultiExternalSelectElement
    fun multiExternalSelect(configurator: ModelConfigurator<MultiExternalSelectElement.MultiExternalSelectElementBuilder?>): MultiExternalSelectElement {
        return configurator.configure(MultiExternalSelectElement.builder()).build()
    }

    // MultiUsersSelectElement
    fun multiUsersSelect(configurator: ModelConfigurator<MultiUsersSelectElement.MultiUsersSelectElementBuilder?>): MultiUsersSelectElement {
        return configurator.configure(MultiUsersSelectElement.builder()).build()
    }

    // MultiStaticSelectElement
    fun multiStaticSelect(configurator: ModelConfigurator<MultiStaticSelectElement.MultiStaticSelectElementBuilder?>): MultiStaticSelectElement {
        return configurator.configure(MultiStaticSelectElement.builder()).build()
    }

    // ------------------------------------------------
    // Rich Text Elements
    // ------------------------------------------------
    // RichTextListElement
    fun richTextList(configurator: ModelConfigurator<RichTextListElement.RichTextListElementBuilder?>): RichTextListElement {
        return configurator.configure(RichTextListElement.builder()).build()
    }

    // RichTextPreformattedElement
    fun richTextPreformatted(configurator: ModelConfigurator<RichTextPreformattedElement.RichTextPreformattedElementBuilder?>): RichTextPreformattedElement {
        return configurator.configure(RichTextPreformattedElement.builder()).build()
    }

    // RichTextQuoteElement
    fun richTextQuote(configurator: ModelConfigurator<RichTextQuoteElement.RichTextQuoteElementBuilder?>): RichTextQuoteElement {
        return configurator.configure(RichTextQuoteElement.builder()).build()
    }

    // RichTextSectionElement
    fun richTextSection(configurator: ModelConfigurator<RichTextSectionElement.RichTextSectionElementBuilder?>): RichTextSectionElement {
        return configurator.configure(RichTextSectionElement.builder()).build()
    }
}
