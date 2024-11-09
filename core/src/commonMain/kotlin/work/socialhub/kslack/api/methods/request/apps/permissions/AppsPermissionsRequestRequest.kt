package work.socialhub.kslack.api.methods.request.apps.permissions

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class AppsPermissionsRequestRequest(
    /** Authentication token. Requires scope: `none` */
    override var token: String?,
    /** Token used to trigger the permissions API */
    var triggerId: String?,
    /** A comma separated list of scopes to request for */
    var scopes: Array<String>?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("trigger_id", triggerId)
            if (scopes != null) {
                it.addParam("scopes", scopes!!.joinToString(","))
            }
        }
    }
}