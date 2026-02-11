package work.socialhub.kslack.internal

import work.socialhub.kslack.Slack
import work.socialhub.kslack.api.AdminResource
import work.socialhub.kslack.api.ApiResource
import work.socialhub.kslack.api.AppsResource
import work.socialhub.kslack.api.AuthResource
import work.socialhub.kslack.api.BotsResource
import work.socialhub.kslack.api.ChannelsResource
import work.socialhub.kslack.api.ChatResource
import work.socialhub.kslack.api.ConversationsResource
import work.socialhub.kslack.api.DialogResource
import work.socialhub.kslack.api.DndResource
import work.socialhub.kslack.api.EmojiResource
import work.socialhub.kslack.api.FilesResource
import work.socialhub.kslack.api.GroupsResource
import work.socialhub.kslack.api.ImResource
import work.socialhub.kslack.api.MigrationResource
import work.socialhub.kslack.api.MpimResource
import work.socialhub.kslack.api.OAuthResource
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
import work.socialhub.kslack.internal.api.AdminResourceImpl
import work.socialhub.kslack.internal.api.ApiResourceImpl
import work.socialhub.kslack.internal.api.AppsResourceImpl
import work.socialhub.kslack.internal.api.AuthResourceImpl
import work.socialhub.kslack.internal.api.BotsResourceImpl
import work.socialhub.kslack.internal.api.ChannelsResourceImpl
import work.socialhub.kslack.internal.api.ChatResourceImpl
import work.socialhub.kslack.internal.api.ConversationsResourceImpl
import work.socialhub.kslack.internal.api.DialogResourceImpl
import work.socialhub.kslack.internal.api.DndResourceImpl
import work.socialhub.kslack.internal.api.EmojiResourceImpl
import work.socialhub.kslack.internal.api.FilesResourceImpl
import work.socialhub.kslack.internal.api.GroupsResourceImpl
import work.socialhub.kslack.internal.api.ImResourceImpl
import work.socialhub.kslack.internal.api.MigrationResourceImpl
import work.socialhub.kslack.internal.api.MpimResourceImpl
import work.socialhub.kslack.internal.api.OAuthResourceImpl
import work.socialhub.kslack.internal.api.PinsResourceImpl
import work.socialhub.kslack.internal.api.ReactionsResourceImpl
import work.socialhub.kslack.internal.api.RemindersResourceImpl
import work.socialhub.kslack.internal.api.SearchResourceImpl
import work.socialhub.kslack.internal.api.StarsResourceImpl
import work.socialhub.kslack.internal.api.StatusResourceImpl
import work.socialhub.kslack.internal.api.TeamResourceImpl
import work.socialhub.kslack.internal.api.UsergroupsResourceImpl
import work.socialhub.kslack.internal.api.UsersResourceImpl
import work.socialhub.kslack.internal.api.ViewsResourceImpl

class SlackImpl(
    override val token: String? = null,
) : Slack {

    private val admin: AdminResource = AdminResourceImpl(token)
    private val api: ApiResource = ApiResourceImpl(token)
    private val apps: AppsResource = AppsResourceImpl(token)
    private val auth: AuthResource = AuthResourceImpl(token)
    private val bots: BotsResource = BotsResourceImpl(token)
    private val channels: ChannelsResource = ChannelsResourceImpl(token)
    private val chat: ChatResource = ChatResourceImpl(token)
    private val conversations: ConversationsResource = ConversationsResourceImpl(token)
    private val dialog: DialogResource = DialogResourceImpl(token)
    private val dnd: DndResource = DndResourceImpl(token)
    private val emoji: EmojiResource = EmojiResourceImpl(token)
    private val files: FilesResource = FilesResourceImpl(token)
    private val groups: GroupsResource = GroupsResourceImpl(token)
    private val im: ImResource = ImResourceImpl(token)
    private val migration: MigrationResource = MigrationResourceImpl(token)
    private val mpim: MpimResource = MpimResourceImpl(token)
    private val oauth: OAuthResource = OAuthResourceImpl()
    private val pins: PinsResource = PinsResourceImpl(token)
    private val reactions: ReactionsResource = ReactionsResourceImpl(token)
    private val reminders: RemindersResource = RemindersResourceImpl(token)
    private val search: SearchResource = SearchResourceImpl(token)
    private val stars: StarsResource = StarsResourceImpl(token)
    private val status: StatusResource = StatusResourceImpl()
    private val team: TeamResource = TeamResourceImpl(token)
    private val usergroups: UsergroupsResource = UsergroupsResourceImpl(token)
    private val users: UsersResource = UsersResourceImpl(token)
    private val views: ViewsResource = ViewsResourceImpl(token)

    override fun admin() = admin
    override fun api() = api
    override fun apps() = apps
    override fun auth() = auth
    override fun bots() = bots
    override fun channels() = channels
    override fun chat() = chat
    override fun conversations() = conversations
    override fun dialog() = dialog
    override fun dnd() = dnd
    override fun emoji() = emoji
    override fun files() = files
    override fun groups() = groups
    override fun im() = im
    override fun migration() = migration
    override fun mpim() = mpim
    override fun oauth() = oauth
    override fun pins() = pins
    override fun reactions() = reactions
    override fun reminders() = reminders
    override fun search() = search
    override fun stars() = stars
    override fun status() = status
    override fun team() = team
    override fun usergroups() = usergroups
    override fun users() = users
    override fun views() = views
}
