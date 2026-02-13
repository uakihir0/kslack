package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsAcceptSharedInviteResponse : SlackApiResponse() {

    @SerialName("implicit_approval")
    var implicitApproval: Boolean? = null

    @SerialName("channel_id")
    var channelId: String? = null
}
