package work.socialhub.kslack.entity

object Attachments {
    fun asAttachments(vararg attachments: work.socialhub.kmastodon.entity.Attachment?): Array<work.socialhub.kmastodon.entity.Attachment> {
        return java.util.Arrays.asList(*attachments)
    }

    fun attachment(configurator: ModelConfigurator<work.socialhub.kmastodon.entity.Attachment.AttachmentBuilder>): work.socialhub.kmastodon.entity.Attachment {
        return configurator.configure(Attachment.builder()).build()
    }

    fun attachmentMetadata(configurator: ModelConfigurator<work.socialhub.kmastodon.entity.Attachment.AttachmentMetadata.AttachmentMetadataBuilder>): work.socialhub.kmastodon.entity.Attachment.AttachmentMetadata {
        return configurator.configure(work.socialhub.kmastodon.entity.Attachment.AttachmentMetadata.builder()).build()
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

    fun asActions(vararg actions: Action?): Array<Action> {
        return java.util.Arrays.asList(*actions)
    }

    fun asFields(vararg fields: Field?): Array<Field> {
        return java.util.Arrays.asList(*fields)
    }

    fun asOptionGroups(vararg optionGroups: Action.OptionGroup?): Array<Action.OptionGroup> {
        return java.util.Arrays.asList(*optionGroups)
    }

    fun asOptions(vararg options: Action.Option?): Array<Action.Option> {
        return java.util.Arrays.asList(*options)
    }

    fun asList(vararg values: String?): Array<String> {
        return java.util.Arrays.asArray<String>(*values)
    }
}
