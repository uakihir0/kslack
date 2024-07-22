package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#confirm
 */
class ConfirmationDialogObject {
    private var title: PlainTextObject? = null
    private var text: TextObject? = null
    private var confirm: PlainTextObject? = null
    private var deny: PlainTextObject? = null
}
