package work.socialhub.kmastodon


import work.socialhub.kmastodon.api.*
import work.socialhub.kmastodon.domain.Service
import kotlin.js.JsExport

@JsExport
interface Mastodon {

    /** Get kind of service  */
    fun service(): Service

    fun apps(): AppsResource
    fun oauth(): OAuthResource
    fun nodes(): NodesResource
    fun emojis(): EmojisResource
    fun instances(): InstancesResource

    fun search(): SearchResource
    fun medias(): MediasResource
    fun trends(): TrendsResource
    fun lists(): ListsResource
    fun polls(): PollsResource
    fun mutes(): MutesResource
    fun blocks(): BlocksResource
    fun reports(): ReportsResource
    fun follows(): FollowsResource
    fun followRequests(): FollowRequestsResource

    fun accounts(): AccountsResource
    fun statuses(): StatusesResource
    fun timelines(): TimelinesResource
    fun favourites(): FavouritesResource
    fun notifications(): NotificationsResource

    fun uri(): String
    fun accessToken(): String
}
