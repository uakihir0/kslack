package work.socialhub.kslack.entity.block.composition

/**
 * https://api.slack.com/reference/messaging/composition-objects#text
 */
class PlainTextObject : TextObject() {

    companion object {
        const val TYPE: String = "plain_text"
    }

    val type: String = TYPE
    var text: String? = null

    /**
     * The documentation of the Slack API states that the verbatim field is optional.
     * The API examples always render the emoji field (as true, but that is its default value) -- so that is not helpful.
     * I picked the Boolean because basically you have 3 possible states:
     * - true
     * - false
     * - not present (and therefore not rendered in the resulting JSON sent to the Slack API)
     */
    var emoji: Boolean? = null
}
