package work.socialhub.kslack

import work.socialhub.kslack.api.AdminResource
import work.socialhub.kslack.api.ApiResource
import work.socialhub.kslack.api.AppsResource
import work.socialhub.kslack.api.AuthResource
import work.socialhub.kslack.api.BookmarksResource
import work.socialhub.kslack.api.BotsResource
import work.socialhub.kslack.api.CallsResource
import work.socialhub.kslack.api.ChatResource
import work.socialhub.kslack.api.ConversationsResource
import work.socialhub.kslack.api.DialogResource
import work.socialhub.kslack.api.DndResource
import work.socialhub.kslack.api.EmojiResource
import work.socialhub.kslack.api.FilesResource
import work.socialhub.kslack.api.MigrationResource
import work.socialhub.kslack.api.OAuthResource
import work.socialhub.kslack.api.OpenIDConnectResource
import work.socialhub.kslack.api.PinsResource
import work.socialhub.kslack.api.ReactionsResource
import work.socialhub.kslack.api.RemindersResource
import work.socialhub.kslack.api.SearchResource
import work.socialhub.kslack.api.StarsResource
import work.socialhub.kslack.api.StatusResource
import work.socialhub.kslack.api.TeamResource
import work.socialhub.kslack.api.UsergroupsResource
import work.socialhub.kslack.api.UsersResource
import work.socialhub.kslack.api.ViewsResource
import kotlin.js.JsExport

/**
 * Slack API Client
 * https://api.slack.com/methods
 */
// TODO: Stream module — Add stream() accessor for Socket Mode event delivery.
@JsExport
interface Slack {

    fun admin(): AdminResource
    fun api(): ApiResource
    fun apps(): AppsResource
    fun auth(): AuthResource
    fun bookmarks(): BookmarksResource
    fun bots(): BotsResource
    fun calls(): CallsResource
    fun chat(): ChatResource
    fun conversations(): ConversationsResource
    @Deprecated("Use ViewsResource (views.open) for modals instead.")
    fun dialog(): DialogResource
    fun dnd(): DndResource
    fun emoji(): EmojiResource
    fun files(): FilesResource
    fun migration(): MigrationResource
    fun oauth(): OAuthResource
    fun openIDConnect(): OpenIDConnectResource
    fun pins(): PinsResource
    fun reactions(): ReactionsResource
    fun reminders(): RemindersResource
    fun search(): SearchResource
    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    fun stars(): StarsResource
    fun status(): StatusResource
    fun team(): TeamResource
    fun usergroups(): UsergroupsResource
    fun users(): UsersResource
    fun views(): ViewsResource

    val token: String?

    companion object {
        const val ENDPOINT_URL_PREFIX = "https://slack.com/api/"
        const val STATUS_URL_PREFIX = "https://slack-status.com/api/v2.0.0/"
        const val AUTHORIZE_URL = "https://slack.com/oauth/v2/authorize"
    }
}
