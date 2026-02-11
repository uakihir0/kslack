package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

@JsExport
@Serializable
class Bookmark {

    var id: String? = null

    @SerialName("channel_id")
    var channelId: String? = null

    var title: String? = null
    var link: String? = null
    var emoji: String? = null

    @SerialName("icon_url")
    var iconUrl: String? = null

    var type: String? = null

    @SerialName("date_created")
    var dateCreated: Int? = null

    @SerialName("date_updated")
    var dateUpdated: Int? = null

    var rank: String? = null

    @SerialName("last_updated_by_user_id")
    var lastUpdatedByUserId: String? = null

    @SerialName("last_updated_by_team_id")
    var lastUpdatedByTeamId: String? = null
}
