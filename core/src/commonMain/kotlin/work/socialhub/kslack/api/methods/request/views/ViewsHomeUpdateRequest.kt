package work.socialhub.kslack.api.methods.request.views

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import work.socialhub.kslack.api.methods.helper.JsonHelper.toJson
import work.socialhub.kslack.entity.block.LayoutBlock
import kotlin.js.JsExport

/**
 * https://api.slack.com/methods/views.home.update
 */
@JsExport
class ViewsHomeUpdateRequest(
    override var token: String?,
    /** A JSON-formatted string representing a block kit layout block for the home tab. */
    var homeTabConfig: LayoutBlock?,
    /** The homeTabConfig as a JSON string. */
    var homeTabConfigAsString: String?,
    /** The unique identifier of the user for whom you want to update the home tab. */
    var userId: String?,
    /** The external binding ID to associate with the view. */
    var externalBindingId: String?,
    /** The method used to bind the external ID to the view. */
    var externalBindingMethod: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            if (homeTabConfigAsString != null) {
                it.addParam("home_tab_config", homeTabConfigAsString)
            } else {
                it.addParam("home_tab_config", toJson(homeTabConfig))
            }
            it.addParam("user_id", userId)
            it.addParam("external_binding_id", externalBindingId)
            it.addParam("external_binding_method", externalBindingMethod)
        }
    }
}
