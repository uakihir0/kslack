package work.socialhub.kslack.entity.dialog

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a Slack Modal Dialog
 *
 * @see [Slack Modal Dialog](https://api.slack.com/dialogs)
 */
@JsExport
@Serializable
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
    var elements: Array<DialogElement>? = null

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

}
