package work.socialhub.kslack.api.methods.response.admin.users

import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import kotlin.js.JsExport

@JsExport
@Serializable
class AdminUsersSetRegularResponse : SlackApiResponse() {
    var responseMetadata: ResponseMetadata? = null
}