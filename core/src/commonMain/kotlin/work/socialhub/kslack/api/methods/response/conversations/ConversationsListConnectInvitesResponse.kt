package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import work.socialhub.kslack.api.methods.response.entity.ResponseMetadata
import work.socialhub.kslack.entity.connect.SharedInvite
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsListConnectInvitesResponse : SlackApiResponse() {
    var invites: Array<SharedInvite>? = null

    @SerialName("response_metadata")
    var responseMetadata: ResponseMetadata? = null
}
