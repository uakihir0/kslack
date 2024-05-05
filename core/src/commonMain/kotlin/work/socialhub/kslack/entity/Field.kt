package work.socialhub.kslack.entity

import com.google.gson.annotations.SerializedName

/**
 * https://api.slack.com/docs/message-attachments
 */
class Field {
    /**
     * Shown as a bold heading above the value text. It cannot contain markup and will be escaped for you.
     */
    var title: String? = null

    /**
     * The text value of the field. It may contain standard message markup (see details below) and must be escaped as normal. May be multi-line.
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    var value: String? = null

    /**
     * An optional flag indicating whether the value is short enough to be displayed side-by-side with other values.
     */
    @SerializedName("short")
    var isValueShortEnough: Boolean = false

    constructor(title: String?, value: String?, valueShortEnough: Boolean) {
        this.title = title
        this.value = value
        this.isValueShortEnough = valueShortEnough
    }

    constructor()

    class FieldBuilder internal constructor() {
        private var title: String? = null
        private var value: String? = null
        private var valueShortEnough = false

        fun title(title: String?): FieldBuilder {
            this.title = title
            return this
        }

        fun value(value: String?): FieldBuilder {
            this.value = value
            return this
        }

        fun valueShortEnough(valueShortEnough: Boolean): FieldBuilder {
            this.valueShortEnough = valueShortEnough
            return this
        }

        fun build(): Field {
            return Field(title, value, valueShortEnough)
        }

        override fun toString(): String {
            return "Field.FieldBuilder(title=" + this.title + ", value=" + this.value + ", valueShortEnough=" + this.valueShortEnough + ")"
        }
    }

    companion object {
        fun builder(): FieldBuilder {
            return FieldBuilder()
        }
    }
}