package work.socialhub.kslack.api.methods.response.conversations

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class ConversationsInviteSharedResponse : SlackApiResponse() {

    @SerialName("invite_id")
    var inviteId: String? = null

    @SerialName("conf_code")
    var confCode: String? = null

    @SerialName("is_legacy_shared_channel")
    var isLegacySharedChannel: Boolean? = null
}
