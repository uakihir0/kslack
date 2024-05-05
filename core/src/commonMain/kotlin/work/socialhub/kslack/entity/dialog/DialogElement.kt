package work.socialhub.kslack.entity.dialog

/**
 * A dialog Form DialogElement such as `text`, `textarea`, or `select`
 * or `select`.
 *
 * @see [Slack Modal Dialog](https://api.slack.com/dialogs)
 */
interface DialogElement {
    var label: String?

    var name: String?

    val type: String?


    var value: String?

    var placeholder: String?

    var isOptional: Boolean
}
