package work.socialhub.kslack.entity

object Attachments {
    fun asAttachments(vararg attachments: Attachment?): List<Attachment> {
        return java.util.Arrays.asList(*attachments)
    }

    fun attachment(configurator: ModelConfigurator<Attachment.AttachmentBuilder>): Attachment {
        return configurator.configure(Attachment.builder()).build()
    }

    fun attachmentMetadata(configurator: ModelConfigurator<Attachment.AttachmentMetadata.AttachmentMetadataBuilder>): Attachment.AttachmentMetadata {
        return configurator.configure(Attachment.AttachmentMetadata.builder()).build()
    }

    fun field(configurator: ModelConfigurator<Field.FieldBuilder>): Field {
        return configurator.configure(Field.builder()).build()
    }

    fun action(configurator: ModelConfigurator<Action.ActionBuilder>): Action {
        return configurator.configure(Action.builder()).build()
    }

    fun confirm(configurator: ModelConfigurator<Confirmation.ConfirmationBuilder>): Confirmation {
        return configurator.configure(Confirmation.builder()).build()
    }

    fun optionGroup(configurator: ModelConfigurator<Action.OptionGroup.OptionGroupBuilder>): Action.OptionGroup {
        return configurator.configure(Action.OptionGroup.builder()).build()
    }

    fun option(configurator: ModelConfigurator<Action.Option.OptionBuilder>): Action.Option {
        return configurator.configure(Action.Option.builder()).build()
    }

    fun asActions(vararg actions: Action?): List<Action> {
        return java.util.Arrays.asList(*actions)
    }

    fun asFields(vararg fields: Field?): List<Field> {
        return java.util.Arrays.asList(*fields)
    }

    fun asOptionGroups(vararg optionGroups: Action.OptionGroup?): List<Action.OptionGroup> {
        return java.util.Arrays.asList(*optionGroups)
    }

    fun asOptions(vararg options: Action.Option?): List<Action.Option> {
        return java.util.Arrays.asList(*options)
    }

    fun asList(vararg values: String?): List<String> {
        return java.util.Arrays.asList<String>(*values)
    }
}
