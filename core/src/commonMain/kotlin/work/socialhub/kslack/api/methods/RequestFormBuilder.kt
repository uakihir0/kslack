package work.socialhub.kslack.api.methods

import net.socialhub.logger.Logger
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRequestsListRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.*
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*
import work.socialhub.kslack.api.methods.request.api.ApiTestRequest
import work.socialhub.kslack.api.methods.request.apps.AppsUninstallRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.AppsPermissionsInfoRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.AppsPermissionsRequestRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.resources.AppsPermissionsResourcesListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.scopes.AppsPermissionsScopesListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersListRequest
import work.socialhub.kslack.api.methods.request.apps.permissions.users.AppsPermissionsUsersRequestRequest
import work.socialhub.kslack.api.methods.request.auth.AuthRevokeRequest
import work.socialhub.kslack.api.methods.request.auth.AuthTestRequest
import work.socialhub.kslack.api.methods.request.bots.BotsInfoRequest
import work.socialhub.kslack.api.methods.request.channels.*
import work.socialhub.kslack.api.methods.request.chat.*
import work.socialhub.kslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import work.socialhub.kslack.api.methods.request.conversations.*
import work.socialhub.kslack.api.methods.request.dialog.DialogOpenRequest
import work.socialhub.kslack.api.methods.request.dnd.*
import work.socialhub.kslack.api.methods.request.emoji.EmojiListRequest
import work.socialhub.kslack.api.methods.request.files.*
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsAddRequest
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsDeleteRequest
import work.socialhub.kslack.api.methods.request.files.comments.FilesCommentsEditRequest
import work.socialhub.kslack.api.methods.request.files.remote.FilesRemoteInfoRequest
import work.socialhub.kslack.api.methods.request.files.remote.FilesRemoteListRequest
import work.socialhub.kslack.api.methods.request.files.remote.FilesRemoteRemoveRequest
import work.socialhub.kslack.api.methods.request.files.remote.FilesRemoteShareRequest
import work.socialhub.kslack.api.methods.request.groups.*
import work.socialhub.kslack.api.methods.request.im.*
import work.socialhub.kslack.api.methods.request.migration.MigrationExchangeRequest
import work.socialhub.kslack.api.methods.request.mpim.*
import work.socialhub.kslack.api.methods.request.oauth.OAuthAccessRequest
import work.socialhub.kslack.api.methods.request.oauth.OAuthTokenRequest
import work.socialhub.kslack.api.methods.request.pins.PinsAddRequest
import work.socialhub.kslack.api.methods.request.pins.PinsListRequest
import work.socialhub.kslack.api.methods.request.pins.PinsRemoveRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsAddRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsGetRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsListRequest
import work.socialhub.kslack.api.methods.request.reactions.ReactionsRemoveRequest
import work.socialhub.kslack.api.methods.request.reminders.*
import work.socialhub.kslack.api.methods.request.rtm.RTMConnectRequest
import work.socialhub.kslack.api.methods.request.rtm.RTMStartRequest
import work.socialhub.kslack.api.methods.request.search.SearchAllRequest
import work.socialhub.kslack.api.methods.request.search.SearchFilesRequest
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import work.socialhub.kslack.api.methods.request.stars.StarsAddRequest
import work.socialhub.kslack.api.methods.request.stars.StarsListRequest
import work.socialhub.kslack.api.methods.request.stars.StarsRemoveRequest
import work.socialhub.kslack.api.methods.request.team.TeamAccessLogsRequest
import work.socialhub.kslack.api.methods.request.team.TeamBillableInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamIntegrationLogsRequest
import work.socialhub.kslack.api.methods.request.team.profile.TeamProfileGetRequest
import work.socialhub.kslack.api.methods.request.usergroups.*
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import work.socialhub.kslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import work.socialhub.kslack.api.methods.request.users.*
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileGetRequest
import work.socialhub.kslack.api.methods.request.users.profile.UsersProfileSetRequest
import work.socialhub.kslack.api.methods.request.views.ViewsOpenRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPublishRequest
import work.socialhub.kslack.api.methods.request.views.ViewsPushRequest
import work.socialhub.kslack.api.methods.request.views.ViewsUpdateRequest
import work.socialhub.kslack.common.json.GsonFactory

object RequestFormBuilder {

    fun toForm(req: DndInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        return form
    }

    fun toForm(req: DndSetSnoozeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("num_minutes", NumMinutes)
        return form
    }

    fun toForm(req: DndTeamInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (Users() != null) {
            it.addParam("users", Users().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        return form
    }

    fun toForm(req: EmojiListRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: FilesDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        return form
    }

    fun toForm(req: FilesInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: FilesListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("channel", Channel)
        it.addParam("ts_from", TsFrom)
        it.addParam("ts_to", TsTo)
        if (Types() != null) {
            it.addParam("types", Types().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        it.addParam("count", Count)
        it.addParam("page", Page)
        it.addParam("show_files_hidden_by_limit", req.isShowFilesHiddenByLimit)
        return form
    }

    fun toForm(req: FilesRevokePublicURLRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        return form
    }

    fun toForm(req: FilesSharedPublicURLRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        return form
    }

    fun toForm(req: FilesUploadRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("content", Content)
        it.addParam("filetype", Filetype)
        it.addParam("filename", Filename)
        it.addParam("title", Title)
        it.addParam("initial_comment", InitialComment)
        if (Channels() != null) {
            it.addParam("channels", Channels().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        return form
    }

    fun toMultipartBody(req: FilesUploadRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()

        if (File() != null) {
            form.addFile("file", File)
        }
        if (Filestream() != null) {
            form.addFile("file", Filestream(), Filename)
        }
        it.addParam("filetype", Filetype)
        it.addParam("filename", Filename)
        it.addParam("title", Title)
        it.addParam("initial_comment", InitialComment)

        if (Channels() != null) {
            it.addParam("channels", Channels().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        it.addParam("thread_ts", ThreadTs)
        return form
    }

    fun toForm(req: FilesCommentsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        it.addParam("comment", Comment)
        return form
    }

    fun toForm(req: FilesCommentsDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        it.addParam("id", Id)
        return form
    }

    fun toForm(req: FilesCommentsEditRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        it.addParam("comment", Comment)
        it.addParam("id", Id)
        return form
    }

    //    public static MultipartBody.Builder toMultipartBody(FilesRemoteAddRequest req) {
    //        MultipartBody.Builder form = new MultipartBody.Builder();
    //        it.addParam("external_id", ExternalId);
    //        it.addParam("external_url", ExternalUrl);
    //        it.addParam("title", Title);
    //        it.addParam("filetype", Filetype);
    //        if (IndexableFileContents() != null) {
    //            RequestBody indexableFileContents = RequestBody.create(Filetype() != null ? MediaType.parse(Filetype) : null, IndexableFileContents);
    //            form.addFormDataPart("indexable_file_contents", Title(), indexableFileContents);
    //        }
    //        if (PreviewImage() != null) {
    //            RequestBody previewImage = RequestBody.create(Filetype() != null ? MediaType.parse(Filetype) : null, PreviewImage);
    //            form.addFormDataPart("preview_image", Title(), previewImage);
    //        }
    //        return form;
    //    }
    fun toForm(req: FilesRemoteInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("external_id", ExternalId)
        it.addParam("file", File)
        return form
    }

    fun toForm(req: FilesRemoteListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("cursor", Cursor)
        it.addParam("limit", Limit)
        it.addParam("ts_from", TsFrom)
        it.addParam("ts_to", TsTo)
        return form
    }

    fun toForm(req: FilesRemoteRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("external_id", ExternalId)
        it.addParam("file", File)
        return form
    }

    fun toForm(req: FilesRemoteShareRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("external_id", ExternalId)
        it.addParam("file", File)
        if (Channels() != null) {
            it.addParam("channels", Channels().stream().collect(java.util.stream.Collectors.joining(",")))
        } else {
            throw java.lang.IllegalArgumentException("channels parameter is required for files.remote.share API")
        }
        return form
    }

    fun toForm(req: GroupsArchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: GroupsCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: GroupsCreateChildRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: GroupsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("name", Name)
        it.addParam("validate", req.isValidate)
        return form
    }

    fun toForm(req: GroupsHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("latest", Latest)
        it.addParam("oldest", Oldest)
        it.addParam("inclusive", req.isInclusive)
        it.addParam("count", Count)
        it.addParam("unreads", req.isUnreads)
        return form
    }

    fun toForm(req: GroupsRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("thread_ts", ThreadTs)
        return form
    }

    fun toForm(req: GroupsInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("include_locale", req.isIncludeLocale)
        return form
    }

    fun toForm(req: GroupsInviteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("user", User)
        return form
    }

    fun toForm(req: GroupsKickRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("user", User)
        return form
    }

    fun toForm(req: GroupsLeaveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: GroupsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("exclude_archived", req.isExcludeArchived)
        it.addParam("exclude_members", req.isExcludeMembers)
        return form
    }

    fun toForm(req: GroupsMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("ts", Ts)
        return form
    }

    fun toForm(req: GroupsOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: GroupsRenameRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("name", Name)
        return form
    }

    fun toForm(req: GroupsSetPurposeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("purpose", Purpose)
        return form
    }

    fun toForm(req: GroupsSetTopicRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("topic", Topic)
        return form
    }

    fun toForm(req: GroupsUnarchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: ImCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: ImHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("latest", Latest)
        it.addParam("oldest", Oldest)
        it.addParam("inclusive", req.isInclusive)
        it.addParam("count", Count)
        it.addParam("unreads", req.isUnreads)
        return form
    }

    fun toForm(req: ImListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("cursor", Cursor)
        it.addParam("limit", Limit)
        it.addParam("get_latest", GetLatest)
        return form
    }

    fun toForm(req: ImMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("ts", Ts)
        return form
    }

    fun toForm(req: ImOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("return_im", req.isReturnIm)
        it.addParam("include_locale", req.isIncludeLocale)
        return form
    }

    fun toForm(req: ImRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("thread_ts", ThreadTs)
        return form
    }

    fun toForm(req: MigrationExchangeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("to_old", req.isToOld)
        if (Users() != null) {
            it.addParam("users", Users().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        return form
    }

    fun toForm(req: MpimCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: MpimHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("latest", Latest)
        it.addParam("oldest", Oldest)
        it.addParam("inclusive", req.isInclusive)
        it.addParam("count", Count)
        it.addParam("unreads", req.isUnreads)
        return form
    }

    fun toForm(req: MpimListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("cursor", Cursor)
        it.addParam("limit", Limit)
        it.addParam("get_latest", GetLatest)
        return form
    }

    fun toForm(req: MpimRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("thread_ts", ThreadTs)
        return form
    }

    fun toForm(req: MpimMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("ts", Ts)
        return form
    }

    fun toForm(req: MpimOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (Users() != null) {
            it.addParam("users", Users().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        return form
    }

    fun toForm(req: OAuthAccessRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("client_id", ClientId)
        it.addParam("client_secret", ClientSecret)
        it.addParam("code", Code)
        it.addParam("redirect_uri", RedirectUri)
        it.addParam("single_channel", req.isSingleChannel)
        return form
    }

    fun toForm(req: OAuthTokenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("client_id", ClientId)
        it.addParam("client_secret", ClientSecret)
        it.addParam("code", Code)
        it.addParam("redirect_uri", RedirectUri)
        it.addParam("single_channel", req.isSingleChannel)
        return form
    }

    fun toForm(req: PinsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: PinsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        return form
    }

    fun toForm(req: PinsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: ReactionsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("name", Name)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("channel", Channel)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: ReactionsGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("channel", Channel)
        it.addParam("timestamp", Timestamp)
        it.addParam("full", req.isFull)
        return form
    }

    fun toForm(req: ReactionsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("full", req.isFull)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: ReactionsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("name", Name)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("channel", Channel)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: RemindersAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("text", Text)
        it.addParam("time", Time)
        it.addParam("user", User)
        return form
    }

    fun toForm(req: RemindersCompleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("reminder", Reminder)
        return form
    }

    fun toForm(req: RemindersDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("reminder", Reminder)
        return form
    }

    fun toForm(req: RemindersInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("reminder", Reminder)
        return form
    }

    fun toForm(req: RemindersListRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: RTMConnectRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("batch_presence_aware", req.isBatchPresenceAware)
        it.addParam("presence_sub", req.isPresenceSub)
        return form
    }

    fun toForm(req: RTMStartRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("include_locale", req.isIncludeLocale)
        it.addParam("batch_presence_aware", req.isBatchPresenceAware)
        it.addParam("no_latest", req.isNoLatest)
        it.addParam("no_unreads", req.isNoUnreads)
        it.addParam("presence_sub", req.isPresenceSub)
        it.addParam("simple_latest", req.isSimpleLatest)
        it.addParam("mpim_aware", req.isMpimAware)
        return form
    }

    fun toForm(req: SearchAllRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("query", Query)
        it.addParam("sort", Sort)
        it.addParam("sort_dir", SortDir)
        it.addParam("highlight", req.isHighlight)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: SearchMessagesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("query", Query)
        it.addParam("sort", Sort)
        it.addParam("sort_dir", SortDir)
        it.addParam("highlight", req.isHighlight)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: SearchFilesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("query", Query)
        it.addParam("sort", Sort)
        it.addParam("sort_dir", SortDir)
        it.addParam("highlight", req.isHighlight)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: StarsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: StarsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: StarsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("channel", Channel)
        it.addParam("file", File)
        it.addParam("file_comment", FileComment)
        it.addParam("timestamp", Timestamp)
        return form
    }

    fun toForm(req: TeamAccessLogsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("before", Before)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: TeamBillableInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        return form
    }

    fun toForm(req: TeamInfoRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: TeamIntegrationLogsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("service_id", ServiceId)
        it.addParam("user", User)
        it.addParam("change_type", ChangeType)
        it.addParam("count", Count)
        it.addParam("page", Page)
        return form
    }

    fun toForm(req: TeamProfileGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("visibility", Visibility)
        return form
    }

    fun toForm(req: UsergroupsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("name", Name)
        it.addParam("handle", Handle)
        it.addParam("description", Description)
        if (Channels() != null) {
            it.addParam("channels", Channels().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        it.addParam("include_count", req.isIncludeCount)
        return form
    }

    fun toForm(req: UsergroupsDisableRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("usergroup", Usergroup)
        it.addParam("include_count", req.isIncludeCount)
        return form
    }

    fun toForm(req: UsergroupsEnableRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("usergroup", Usergroup)
        it.addParam("include_count", req.isIncludeCount)
        return form
    }

    fun toForm(req: UsergroupsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("include_disabled", req.isIncludeDisabled)
        it.addParam("include_count", req.isIncludeCount)
        it.addParam("include_users", req.isIncludeUsers)
        return form
    }

    fun toForm(req: UsergroupsUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("usergroup", Usergroup)
        it.addParam("name", Name)
        it.addParam("handle", Handle)
        it.addParam("description", Description)
        if (Channels() != null) {
            it.addParam("channels", Channels().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        it.addParam("include_count", req.isIncludeCount)
        return form
    }

    fun toForm(req: UsergroupUsersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("usergroup", Usergroup)
        it.addParam("include_disabled", req.isIncludeDisabled)
        return form
    }

    fun toForm(req: UsergroupUsersUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("usergroup", Usergroup)
        if (Users() != null) {
            it.addParam("users", Users().stream().collect(java.util.stream.Collectors.joining(",")))
        }
        it.addParam("include_count", req.isIncludeCount)
        return form
    }

    fun toForm(req: UsersConversationsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("cursor", Cursor)
        it.addParam("exclude_archived", req.isExcludeArchived)
        it.addParam("limit", Limit)

        if (Types() != null) {
            val typeValues: MutableArray<String> = java.util.ArrayArray<String>()
            for (type in Types) {
                typeValues.add(type.value)
            }
            it.addParam("types", typeValues.stream().collect(java.util.stream.Collectors.joining(",")))
        }
        return form
    }

    fun toForm(req: UsersDeletePhotoRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: UsersGetPresenceRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        return form
    }

    fun toForm(req: UsersIdentityRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: UsersInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("include_locale", req.isIncludeLocale)
        return form
    }

    fun toForm(req: UsersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("cursor", Cursor)
        it.addParam("limit", Limit)
        it.addParam("include_locale", req.isIncludeLocale)
        it.addParam("presence", req.isPresence)
        return form
    }

    fun toForm(req: UsersLookupByEmailRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("email", Email)
        return form
    }

    fun toForm(req: UsersSetActiveRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    //    public static MultipartBody.Builder toMultipartBody(UsersSetPhotoRequest req) {
    //        MultipartBody.Builder form = new MultipartBody.Builder();
    //        if (ImageData() != null) {
    //            RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), ImageData);
    //            form.addFormDataPart("image", "image", image);
    //        } else if (Image() != null) {
    //            RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), Image);
    //            form.addFormDataPart("image", "image", image);
    //        }
    //        it.addParam("crop_x", CropX);
    //        it.addParam("crop_y", CropY);
    //        it.addParam("crop_w", CropW);
    //        return form;
    //    }
    fun toForm(req: UsersSetPresenceRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("presence", Presence)
        return form
    }

    fun toForm(req: UsersProfileGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        it.addParam("include_labels", req.isIncludeLabels)
        return form
    }

    fun toForm(req: UsersProfileSetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user", User)
        if (Profile() != null) {
            it.addParam("profile", GsonFactory.createSnakeCase().toJson(Profile))
        } else {
            it.addParam("name", Name)
            it.addParam("value", Value)
        }
        return form
    }

    fun toForm(req: ViewsOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("trigger_id", TriggerId)
        if (ViewAsString() != null) {
            it.addParam("view", ViewAsString)
        } else {
            it.addParam("view", GsonFactory.createSnakeCase().toJson(View))
        }
        return form
    }

    fun toForm(req: ViewsPushRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("trigger_id", TriggerId)
        if (ViewAsString() != null) {
            it.addParam("view", ViewAsString)
        } else {
            it.addParam("view", GsonFactory.createSnakeCase().toJson(View))
        }
        return form
    }

    fun toForm(req: ViewsUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (ViewAsString() != null) {
            it.addParam("view", ViewAsString)
        } else {
            it.addParam("view", GsonFactory.createSnakeCase().toJson(View))
        }
        it.addParam("external_id", ExternalId)
        it.addParam("hash", Hash)
        it.addParam("view_id", ViewId)
        return form
    }

    fun toForm(req: ViewsPublishRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        it.addParam("user_id", UserId)
        if (ViewAsString() != null) {
            it.addParam("view", ViewAsString)
        } else {
            it.addParam("view", GsonFactory.createSnakeCase().toJson(View))
        }
        it.addParam("hash", Hash)
        return form
    }
}
