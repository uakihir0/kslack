package com.github.seratch.jslack.api.methods.request.dialog

import com.github.seratch.jslack.api.model.dialog.Dialog

class DialogOpenRequest internal constructor(
    /**
     * Authentication token. Requires scope: `none`
     */
    var token: String?, dialog: Dialog?, dialogAsString: String?, triggerId: String?
) : SlackApiRequest {
    /**
     * The dialog definition. This must be a JSON-encoded string.
     */
    private var dialog: Dialog?

    var dialogAsString: String?

    /**
     * Exchange a trigger to post to the user.
     *
     *
     * Apps can invoke dialogs when users interact with slash commands, message buttons,
     * or message menus. Each interaction will include a trigger_id.
     *
     *
     *
     *
     * As apps can only open a dialog in response to such a user action, the
     * `trigger_id` is a required parameter.
     *
     * @see [Implementing dialogs](https://api.slack.com/dialogs.implementation)
     */
    var triggerId: String?

    init {
        this.dialog = dialog
        this.dialogAsString = dialogAsString
        this.triggerId = triggerId
    }

    fun getDialog(): Dialog? {
        return this.dialog
    }

    fun setDialog(dialog: Dialog?) {
        this.dialog = dialog
    }

    class DialogOpenRequestBuilder internal constructor() {
        private var token: String? = null
        private var dialog: Dialog? = null
        private var dialogAsString: String? = null
        private var triggerId: String? = null

        fun token(token: String?): DialogOpenRequestBuilder {
            this.token = token
            return this
        }

        fun dialog(dialog: Dialog?): DialogOpenRequestBuilder {
            this.dialog = dialog
            return this
        }

        fun dialogAsString(dialogAsString: String?): DialogOpenRequestBuilder {
            this.dialogAsString = dialogAsString
            return this
        }

        fun triggerId(triggerId: String?): DialogOpenRequestBuilder {
            this.triggerId = triggerId
            return this
        }

        fun build(): DialogOpenRequest {
            return DialogOpenRequest(token, dialog, dialogAsString, triggerId)
        }

        override fun toString(): String {
            return "DialogOpenRequest.DialogOpenRequestBuilder(token=" + this.token + ", dialog=" + this.dialog + ", dialogAsString=" + this.dialogAsString + ", triggerId=" + this.triggerId + ")"
        }
    }

    companion object {
        fun builder(): DialogOpenRequestBuilder {
            return DialogOpenRequestBuilder()
        }
    }
}
