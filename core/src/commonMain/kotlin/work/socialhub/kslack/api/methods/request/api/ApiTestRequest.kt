package work.socialhub.kslack.api.methods.request.api

import work.socialhub.kslack.api.methods.FormRequest
import work.socialhub.kslack.api.methods.SlackApiRequest
import kotlin.js.JsExport

@JsExport
class ApiTestRequest(
    /** Authentication token bearing required scopes. */
    override var token: String? = null,
    /** example property to return */
    var foo: String?,
    /** Error response to return */
    var error: String?
) : SlackApiRequest, FormRequest {

    override fun toMap(): Map<String, Any> {
        return mutableMapOf<String, Any>().also {
            it.addParam("foo", foo)
            it.addParam("error", error)
        }
    }
}