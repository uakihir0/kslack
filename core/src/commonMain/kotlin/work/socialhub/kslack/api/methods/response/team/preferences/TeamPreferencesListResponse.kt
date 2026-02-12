package work.socialhub.kslack.api.methods.response.team.preferences

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import work.socialhub.kslack.api.methods.SlackApiResponse
import kotlin.js.JsExport

@JsExport
@Serializable
class TeamPreferencesListResponse : SlackApiResponse() {

    @SerialName("allow_message_deletion")
    var allowMessageDeletion: Boolean? = null

    @SerialName("display_real_names")
    var displayRealNames: Boolean? = null

    @SerialName("msg_edit_window_mins")
    var msgEditWindowMins: Int? = null

    @SerialName("who_can_post_general")
    var whoCanPostGeneral: String? = null
}
