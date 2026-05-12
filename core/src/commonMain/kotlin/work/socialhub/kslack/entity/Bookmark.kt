package work.socialhub.kslack.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 * Represents a bookmark in a Slack channel.
 *
 * Bookmarks are user-created links pinned to a channel for easy reference.
 * Used in responses from `bookmarks.*` API methods.
 *
 * @see <a href="https://docs.slack.dev/reference/methods/bookmarks.add">bookmarks.add</a>
 */
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
