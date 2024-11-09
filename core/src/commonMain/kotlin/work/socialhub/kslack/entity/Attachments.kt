package work.socialhub.kslack.entity

object Attachments {
    fun asAttachments(vararg attachments: Attachment): Array<Attachment> {
        return arrayOf(*attachments)
    }

    fun asActions(vararg actions: Action): Array<Action> {
        return arrayOf(*actions)
    }

    fun asFields(vararg fields: Field): Array<Field> {
        return arrayOf(*fields)
    }

    fun asOptionGroups(vararg optionGroups: ActionOptionGroup): Array<ActionOptionGroup> {
        return arrayOf(*optionGroups)
    }

    fun asOptions(vararg options: ActionOption): Array<ActionOption> {
        return arrayOf(*options)
    }

    fun asList(vararg values: String): Array<String> {
        return arrayOf(*values)
    }
}
