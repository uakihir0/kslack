package work.socialhub.kslack.entity.call

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Call {

    var id: String? = null

    @SerialName("date_created")
    var dateCreated: Int? = null

    @SerialName("external_unique_id")
    var externalUniqueId: String? = null

    @SerialName("join_url")
    var joinUrl: String? = null

    @SerialName("desktop_app_join_url")
    var desktopAppJoinUrl: String? = null

    @SerialName("external_display_id")
    var externalDisplayId: String? = null

    var title: String? = null
    var users: Array<CallParticipant>? = null
    var channels: Array<String>? = null
}
