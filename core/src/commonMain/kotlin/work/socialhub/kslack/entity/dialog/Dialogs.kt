package work.socialhub.kslack.entity.dialog

object Dialogs {
    fun asElements(vararg elements: DialogElement): Array<DialogElement> {
        return arrayOf(*elements)
    }

    fun asOptions(vararg options: DialogOption): Array<DialogOption> {
        return arrayOf(*options)
    }
}
