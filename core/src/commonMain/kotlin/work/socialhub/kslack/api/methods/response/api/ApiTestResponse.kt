package work.socialhub.kslack.api.methods.response.api

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.entity.Args
import kotlin.js.JsExport

@JsExport
@Serializable
class ApiTestResponse : SlackApiResponse() {
    var args: Args? = null
}