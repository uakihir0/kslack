package work.socialhub.kslack.entity.call

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class CallParticipant {

    @SerialName("slack_id")
    var slackId: String? = null

    @SerialName("external_id")
    var externalId: String? = null

    @SerialName("display_name")
    var displayName: String? = null

    @SerialName("avatar_url")
    var avatarUrl: String? = null
}
