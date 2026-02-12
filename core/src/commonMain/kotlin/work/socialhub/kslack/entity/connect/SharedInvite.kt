package work.socialhub.kslack.entity.connect

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class SharedInvite {

    var id: String? = null
    var direction: String? = null

    @SerialName("date_created")
    var dateCreated: Int? = null

    @SerialName("date_invalid")
    var dateInvalid: Int? = null

    @SerialName("invite_type")
    var inviteType: String? = null

    var status: String? = null
    var channel: SharedInviteChannel? = null

    @SerialName("invite_payload")
    var invitePayload: SharedInvitePayload? = null
}

@JsExport
@Serializable
class SharedInviteChannel {

    var id: String? = null
    var name: String? = null

    @SerialName("is_private")
    var isPrivate: Boolean? = null
}

@JsExport
@Serializable
class SharedInvitePayload {

    @SerialName("recipient_user_id")
    var recipientUserId: String? = null

    @SerialName("recipient_email")
    var recipientEmail: String? = null
}
