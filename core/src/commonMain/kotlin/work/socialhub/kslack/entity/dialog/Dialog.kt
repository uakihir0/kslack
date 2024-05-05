package work.socialhub.kslack.entity.dialog

/**
 * Represents a Slack Modal Dialog
 *
 * @see [Slack Modal Dialog](https://api.slack.com/dialogs)
 */
class Dialog {
    /**
     * User-facing title of this entire dialog. 24 characters to work with and it's required.
     */
    var title: String? = null

    /**
     * An identifier strictly for you to recognize submissions of this particular instance of
     * a dialog. Use something meaningful to your app. 255 characters maximum.
     * Absolutely required.
     */
    var callbackId: String? = null

    /**
     * Up to 5 form elements are allowed per dialog. Required.
     */
    private var elements: List<DialogElement>? = null

    /**
     * User-facing string for whichever button-like thing submits the form, depending on
     * form factor. Defaults to `Submit`, localized in whichever language the end user
     * prefers. 24 characters maximum, and may contain only a single word.
     */
    var submitLabel: String? = null

    /**
     * Default is false. When set to true, we'll notify your request URL
     * whenever there's a user-induced dialog cancellation.
     */
    var isNotifyOnCancel: Boolean = false

    /**
     * An optional string that will be echoed back to your app when a user interacts with your dialog.
     * Use it as a pointer to reference sensitive data stored elsewhere.
     */
    var state: String? = null

    constructor(
        title: String?,
        callbackId: String?,
        elements: List<DialogElement>?,
        submitLabel: String?,
        notifyOnCancel: Boolean,
        state: String?
    ) {
        this.title = title
        this.callbackId = callbackId
        this.elements = elements
        this.submitLabel = submitLabel
        this.isNotifyOnCancel = notifyOnCancel
        this.state = state
    }

    constructor()

    fun getElements(): List<DialogElement>? {
        return this.elements
    }

    fun setElements(elements: List<DialogElement>?) {
        this.elements = elements
    }

    class DialogBuilder internal constructor() {
        private var title: String? = null
        private var callbackId: String? = null
        private var elements: List<DialogElement>? = null
        private var submitLabel: String? = null
        private var notifyOnCancel = false
        private var state: String? = null

        fun title(title: String?): DialogBuilder {
            this.title = title
            return this
        }

        fun callbackId(callbackId: String?): DialogBuilder {
            this.callbackId = callbackId
            return this
        }

        fun elements(elements: List<DialogElement>?): DialogBuilder {
            this.elements = elements
            return this
        }

        fun submitLabel(submitLabel: String?): DialogBuilder {
            this.submitLabel = submitLabel
            return this
        }

        fun notifyOnCancel(notifyOnCancel: Boolean): DialogBuilder {
            this.notifyOnCancel = notifyOnCancel
            return this
        }

        fun state(state: String?): DialogBuilder {
            this.state = state
            return this
        }

        fun build(): Dialog {
            return Dialog(title, callbackId, elements, submitLabel, notifyOnCancel, state)
        }

        override fun toString(): String {
            return "Dialog.DialogBuilder(title=" + this.title + ", callbackId=" + this.callbackId + ", elements=" + this.elements + ", submitLabel=" + this.submitLabel + ", notifyOnCancel=" + this.notifyOnCancel + ", state=" + this.state + ")"
        }
    }

    companion object {
        fun builder(): DialogBuilder {
            return DialogBuilder()
        }
    }
}
