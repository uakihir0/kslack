package work.socialhub.kslack.api.methods.request.dialog

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper
import work.socialhub.kslack.entity.dialog.Dialog
import kotlin.js.JsExport

@JsExport
class DialogOpenRequest(

    /** Authentication token. Requires scope: `none` */
    override var token: String?,
    /** The dialog definition. This must be a JSON-encoded string. */
    var dialog: Dialog?,
    var dialogAsString: String?,

    /**
     * Exchange a trigger to post to the user.
     *
     * Apps can invoke dialogs when users interact with slash commands, message buttons,
     * or message menus. Each interaction will include a trigger_id.
     *
     * As apps can only open a dialog in response to such a user action, the
     * `trigger_id` is a required parameter.
     *
     * @see [Implementing dialogs](https://api.slack.com/dialogs.implementation)
     */
    var triggerId: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("trigger_id", triggerId)

            if (dialogAsString != null) {
                it.addParam("dialog", dialogAsString)
            } else if (dialog != null) {
                val json = JsonHelper.toJson(Dialog)
                it.addParam("dialog", json)
            }
        }
    }
}
