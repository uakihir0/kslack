package com.github.seratch.jslack.api.methods

import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRequestsListRequest
import work.socialhub.kslack.api.methods.request.admin.apps.AdminAppsRestrictRequest
import com.github.seratch.jslack.api.methods.request.admin.invite_requests.*
import com.github.seratch.jslack.api.methods.request.admin.teams.*
import com.github.seratch.jslack.api.methods.request.admin.users.*
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
import com.github.seratch.jslack.api.methods.request.channels.*
import com.github.seratch.jslack.api.methods.request.chat.*
import com.github.seratch.jslack.api.methods.request.chat.scheduled_messages.ChatScheduleMessagesListRequest
import com.github.seratch.jslack.api.methods.request.conversations.*
import com.github.seratch.jslack.api.methods.request.dialog.DialogOpenRequest
import com.github.seratch.jslack.api.methods.request.dnd.*
import com.github.seratch.jslack.api.methods.request.emoji.EmojiListRequest
import com.github.seratch.jslack.api.methods.request.files.*
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsAddRequest
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsDeleteRequest
import com.github.seratch.jslack.api.methods.request.files.comments.FilesCommentsEditRequest
import com.github.seratch.jslack.api.methods.request.files.remote.FilesRemoteInfoRequest
import com.github.seratch.jslack.api.methods.request.files.remote.FilesRemoteListRequest
import com.github.seratch.jslack.api.methods.request.files.remote.FilesRemoteRemoveRequest
import com.github.seratch.jslack.api.methods.request.files.remote.FilesRemoteShareRequest
import com.github.seratch.jslack.api.methods.request.groups.*
import com.github.seratch.jslack.api.methods.request.im.*
import com.github.seratch.jslack.api.methods.request.migration.MigrationExchangeRequest
import com.github.seratch.jslack.api.methods.request.mpim.*
import com.github.seratch.jslack.api.methods.request.oauth.OAuthAccessRequest
import com.github.seratch.jslack.api.methods.request.oauth.OAuthTokenRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsAddRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsListRequest
import com.github.seratch.jslack.api.methods.request.pins.PinsRemoveRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsAddRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsGetRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsListRequest
import com.github.seratch.jslack.api.methods.request.reactions.ReactionsRemoveRequest
import com.github.seratch.jslack.api.methods.request.reminders.*
import com.github.seratch.jslack.api.methods.request.rtm.RTMConnectRequest
import com.github.seratch.jslack.api.methods.request.rtm.RTMStartRequest
import com.github.seratch.jslack.api.methods.request.search.SearchAllRequest
import com.github.seratch.jslack.api.methods.request.search.SearchFilesRequest
import com.github.seratch.jslack.api.methods.request.search.SearchMessagesRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsAddRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsListRequest
import com.github.seratch.jslack.api.methods.request.stars.StarsRemoveRequest
import com.github.seratch.jslack.api.methods.request.team.TeamAccessLogsRequest
import com.github.seratch.jslack.api.methods.request.team.TeamBillableInfoRequest
import com.github.seratch.jslack.api.methods.request.team.TeamInfoRequest
import com.github.seratch.jslack.api.methods.request.team.TeamIntegrationLogsRequest
import com.github.seratch.jslack.api.methods.request.team.profile.TeamProfileGetRequest
import com.github.seratch.jslack.api.methods.request.usergroups.*
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersListRequest
import com.github.seratch.jslack.api.methods.request.usergroups.users.UsergroupUsersUpdateRequest
import com.github.seratch.jslack.api.methods.request.users.*
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileGetRequest
import com.github.seratch.jslack.api.methods.request.users.profile.UsersProfileSetRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsOpenRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsPublishRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsPushRequest
import com.github.seratch.jslack.api.methods.request.views.ViewsUpdateRequest
import com.github.seratch.jslack.common.json.GsonFactory
import net.socialhub.logger.Logger
import work.socialhub.kslack.api.methods.request.admin.invite_requests.AdminInviteRequestsApproveRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.AdminInviteRequestsApprovedListRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.AdminInviteRequestsDeniedListRequest
import work.socialhub.kslack.api.methods.request.admin.invite_requests.AdminInviteRequestsDenyRequest
import work.socialhub.kslack.api.methods.request.admin.teams.*
import work.socialhub.kslack.api.methods.request.admin.users.*

object RequestFormBuilder {
    private val log: Logger = Logger.getLogger(SlackApiException::class.java)

    fun toForm(req: AdminUsersSessionResetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user_id", req.getUserId(), form)
        setIfNotNull("mobile_only", req.isMobileOnly(), form)
        setIfNotNull("web_only", req.isWebOnly(), form)
        return form
    }

    fun toForm(req: AdminAppsApproveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("app_id", req.getAppId(), form)
        setIfNotNull("request_id", req.getRequestId(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminAppsRestrictRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("app_id", req.getAppId(), form)
        setIfNotNull("request_id", req.getRequestId(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminAppsRequestsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminInviteRequestsApproveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("invite_request_id", req.getInviteRequestId(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminInviteRequestsDenyRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("invite_request_id", req.getInviteRequestId(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminInviteRequestsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminInviteRequestsApprovedListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminInviteRequestsDeniedListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminTeamsAdminsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminTeamsOwnersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        return form
    }

    fun toForm(req: AdminTeamsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_domain", req.getTeamDomain(), form)
        setIfNotNull("team_name", req.getTeamName(), form)
        setIfNotNull("team_description", req.getTeamDescription(), form)
        setIfNotNull("team_discoverability", req.getTeamDiscoverability(), form)
        return form
    }

    fun toForm(req: AdminTeamsSettingsSetDescriptionRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("description", req.getDescription(), form)
        return form
    }

    fun toForm(req: AdminTeamsSettingsSetIconRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("image_url", req.getImageUrl(), form)
        return form
    }

    fun toForm(req: AdminTeamsSettingsSetNameRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("name", req.getName(), form)
        return form
    }

    fun toForm(req: AdminUsersAssignRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("user_id", req.getUserId(), form)
        return form
    }

    fun toForm(req: AdminUsersInviteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull(
            "channel_ids",
            req.getChannelIds().stream().collect(java.util.stream.Collectors.joining(",")),
            form
        )
        setIfNotNull("email", req.getEmail(), form)
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("custom_message", req.getCustomMessage(), form)
        setIfNotNull("guest_expiration_ts", req.getGuestExpirationTs(), form)
        setIfNotNull("is_restricted", req.isRestricted(), form)
        setIfNotNull("is_ultra_restricted", req.isUltraRestricted(), form)
        setIfNotNull("real_name", req.getRealName(), form)
        setIfNotNull("resend", req.isResend(), form)
        return form
    }

    fun toForm(req: AdminUsersRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("user_id", req.getUserId(), form)
        return form
    }

    fun toForm(req: AdminUsersSetAdminRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("user_id", req.getUserId(), form)
        return form
    }

    fun toForm(req: AdminUsersSetOwnerRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("user_id", req.getUserId(), form)
        return form
    }

    fun toForm(req: AdminUsersSetRegularRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("team_id", req.getTeamId(), form)
        setIfNotNull("user_id", req.getUserId(), form)
        return form
    }

    fun toForm(req: ApiTestRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("foo", req.getFoo(), form)
        setIfNotNull("error", req.getError(), form)
        return form
    }

    fun toForm(req: AppsUninstallRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("client_id", req.getClientId(), form)
        setIfNotNull("client_secret", req.getClientSecret(), form)
        return form
    }

    fun toForm(req: AppsPermissionsRequestRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("trigger_id", req.getTriggerId(), form)
        if (req.getScopes() != null) {
            setIfNotNull("scopes", req.getScopes().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: AppsPermissionsInfoRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: AppsPermissionsResourcesListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        return form
    }

    fun toForm(req: AppsPermissionsScopesListRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: AppsPermissionsUsersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        return form
    }

    fun toForm(req: AppsPermissionsUsersRequestRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("trigger_id", req.getTriggerId(), form)
        if (req.getScopes() != null) {
            setIfNotNull("scopes", req.getScopes().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: AuthRevokeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("test", req.isTest(), form)
        return form
    }

    fun toForm(req: AuthTestRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: BotsInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("bot", req.getBot(), form)
        return form
    }

    fun toForm(req: ChannelsArchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ChannelsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("validate", req.isValidate(), form)
        return form
    }

    fun toForm(req: ChannelsHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("inclusive", req.isInclusive(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("unreads", req.isUnreads(), form)
        return form
    }

    fun toForm(req: ChannelsRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        return form
    }

    fun toForm(req: ChannelsInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        return form
    }

    fun toForm(req: ChannelsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("exclude_members", req.isExcludeMembers(), form)
        setIfNotNull("exclude_archived", req.isExcludeArchived(), form)
        return form
    }

    fun toForm(req: ChannelsInviteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: ChannelsJoinRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("validate", req.isValidate(), form)
        return form
    }

    fun toForm(req: ChannelsKickRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: ChannelsLeaveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ChannelsMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts", req.getTs(), form)
        return form
    }

    fun toForm(req: ChannelsRenameRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("validate", req.isValidate(), form)
        return form
    }

    fun toForm(req: ChannelsSetPurposeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("purpose", req.getPurpose(), form)
        return form
    }

    fun toForm(req: ChannelsSetTopicRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("topic", req.getTopic(), form)
        return form
    }

    fun toForm(req: ChannelsUnarchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ChatGetPermalinkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("message_ts", req.getMessageTs(), form)
        return form
    }

    fun toForm(req: ChatDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts", req.getTs(), form)
        return form
    }

    fun toForm(req: ChatDeleteScheduledMessageRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("scheduled_message_id", req.getScheduledMessageId(), form)
        return form
    }

    fun toForm(req: ChatMeMessageRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("text", req.getText(), form)
        return form
    }

    fun toForm(req: ChatScheduleMessageRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("post_at", req.getPostAt(), form)
        setIfNotNull("text", req.getText(), form)
        setIfNotNull("as_user", req.isAsUser(), form)

        if (req.getBlocksAsString() != null) {
            form.add("blocks", req.getBlocksAsString())
        } else if (req.getBlocks() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getBlocks())
            form.add("blocks", json)
        }
        if (req.getBlocksAsString() != null && req.getBlocks() != null) {
            log.warn("Although you set both blocksAsString and blocks, only blocksAsString was used.")
        }

        if (req.getAttachmentsAsString() != null) {
            form.add("attachments", req.getAttachmentsAsString())
        } else if (req.getAttachments() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getAttachments())
            form.add("attachments", json)
        }
        setIfNotNull("link_names", req.isLinkNames(), form)
        setIfNotNull("parse", req.getParse(), form)
        setIfNotNull("reply_broadcast", req.isReplyBroadcast(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        setIfNotNull("unfurl_links", req.isUnfurlLinks(), form)
        setIfNotNull("unfurl_media", req.isUnfurlMedia(), form)
        return form
    }

    fun toForm(req: ChatScheduleMessagesListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        return form
    }

    fun toForm(req: ChatPostEphemeralRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("text", req.getText(), form)
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("as_user", req.isAsUser(), form)

        if (req.getBlocksAsString() != null) {
            form.add("blocks", req.getBlocksAsString())
        } else if (req.getBlocks() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getBlocks())
            form.add("blocks", json)
        }
        if (req.getBlocksAsString() != null && req.getBlocks() != null) {
            log.warn("Although you set both blocksAsString and blocks, only blocksAsString was used.")
        }

        if (req.getAttachmentsAsString() != null) {
            form.add("attachments", req.getAttachmentsAsString())
        } else if (req.getAttachments() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getAttachments())
            form.add("attachments", json)
        }
        setIfNotNull("link_names", req.isLinkNames(), form)
        setIfNotNull("parse", req.getParse(), form)
        return form
    }

    fun toForm(req: ChatPostMessageRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        setIfNotNull("text", req.getText(), form)
        setIfNotNull("parse", req.getParse(), form)
        setIfNotNull("link_names", req.isLinkNames(), form)
        setIfNotNull("mrkdwn", req.isMrkdwn(), form)

        if (req.getBlocksAsString() != null) {
            form.add("blocks", req.getBlocksAsString())
        } else if (req.getBlocks() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getBlocks())
            form.add("blocks", json)
        }
        if (req.getBlocksAsString() != null && req.getBlocks() != null) {
            log.warn("Although you set both blocksAsString and blocks, only blocksAsString was used.")
        }

        if (req.getAttachmentsAsString() != null) {
            form.add("attachments", req.getAttachmentsAsString())
        } else if (req.getAttachments() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getAttachments())
            form.add("attachments", json)
        }
        setIfNotNull("unfurl_links", req.isUnfurlLinks(), form)
        setIfNotNull("unfurl_media", req.isUnfurlMedia(), form)
        setIfNotNull("username", req.getUsername(), form)
        setIfNotNull("as_user", req.isAsUser(), form)
        setIfNotNull("icon_url", req.getIconUrl(), form)
        setIfNotNull("icon_emoji", req.getIconEmoji(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        setIfNotNull("reply_broadcast", req.isReplyBroadcast(), form)
        return form
    }

    fun toForm(req: ChatUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("ts", req.getTs(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("text", req.getText(), form)
        setIfNotNull("parse", req.getParse(), form)
        setIfNotNull("link_names", req.isLinkNames(), form)

        if (req.getBlocksAsString() != null) {
            form.add("blocks", req.getBlocksAsString())
        } else if (req.getBlocks() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getBlocks())
            form.add("blocks", json)
        }
        if (req.getBlocksAsString() != null && req.getBlocks() != null) {
            log.warn("Although you set both blocksAsString and blocks, only blocksAsString was used.")
        }

        if (req.getAttachmentsAsString() != null) {
            form.add("attachments", req.getAttachmentsAsString())
        } else if (req.getAttachments() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getAttachments())
            form.add("attachments", json)
        }
        setIfNotNull("as_user", req.isAsUser(), form)
        return form
    }

    fun toForm(req: ChatUnfurlRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("ts", req.getTs(), form)
        setIfNotNull("channel", req.getChannel(), form)
        if (req.getRawUnfurls() != null) {
            setIfNotNull("unfurls", req.getRawUnfurls(), form)
        } else {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getUnfurls())
            setIfNotNull("unfurls", json, form)
        }
        setIfNotNull("user_auth_required", req.isUserAuthRequired(), form)
        setIfNotNull("user_auth_message", req.getUserAuthMessage(), form)
        setIfNotNull("user_auth_url", req.getUserAuthUrl(), form)
        return form
    }

    fun toForm(req: ConversationsArchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ConversationsCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ConversationsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("is_private", req.isPrivate(), form)
        return form
    }

    fun toForm(req: ConversationsHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("inclusive", req.isInclusive(), form)
        return form
    }

    fun toForm(req: ConversationsInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        setIfNotNull("include_num_members", req.isIncludeNumMembers(), form)
        return form
    }

    fun toForm(req: ConversationsInviteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: ConversationsJoinRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ConversationsKickRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: ConversationsLeaveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ConversationsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("exclude_archived", req.isExcludeArchived(), form)
        setIfNotNull("limit", req.getLimit(), form)

        if (req.getTypes() != null) {
            val typeValues: MutableArray<String> = java.util.ArrayArray<String>()
            for (type in req.getTypes()) {
                typeValues.add(type.value())
            }
            setIfNotNull("types", typeValues.stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: ConversationsMembersRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        return form
    }

    fun toForm(req: ConversationsOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("return_im", req.isReturnIm(), form)
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: ConversationsRenameRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("name", req.getName(), form)
        return form
    }

    fun toForm(req: ConversationsRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("inclusive", req.isInclusive(), form)
        setIfNotNull("ts", req.getTs(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("latest", req.getLatest(), form)
        return form
    }

    fun toForm(req: ConversationsSetPurposeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("purpose", req.getPurpose(), form)
        return form
    }

    fun toForm(req: ConversationsSetTopicRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("topic", req.getTopic(), form)
        return form
    }

    fun toForm(req: ConversationsUnarchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: DialogOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("trigger_id", req.getTriggerId(), form)
        if (req.getDialogAsString() != null) {
            setIfNotNull("dialog", req.getDialogAsString(), form)
        } else if (req.getDialog() != null) {
            val json: String = GsonFactory.createSnakeCase().toJson(req.getDialog())
            setIfNotNull("dialog", json, form)
        }
        return form
    }

    fun toForm(req: DndEndDndRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: DndEndSnoozeRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: DndInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: DndSetSnoozeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("num_minutes", req.getNumMinutes(), form)
        return form
    }

    fun toForm(req: DndTeamInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: EmojiListRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: FilesDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        return form
    }

    fun toForm(req: FilesInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: FilesListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts_from", req.getTsFrom(), form)
        setIfNotNull("ts_to", req.getTsTo(), form)
        if (req.getTypes() != null) {
            setIfNotNull("types", req.getTypes().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        setIfNotNull("show_files_hidden_by_limit", req.isShowFilesHiddenByLimit(), form)
        return form
    }

    fun toForm(req: FilesRevokePublicURLRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        return form
    }

    fun toForm(req: FilesSharedPublicURLRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        return form
    }

    fun toForm(req: FilesUploadRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("content", req.getContent(), form)
        setIfNotNull("filetype", req.getFiletype(), form)
        setIfNotNull("filename", req.getFilename(), form)
        setIfNotNull("title", req.getTitle(), form)
        setIfNotNull("initial_comment", req.getInitialComment(), form)
        if (req.getChannels() != null) {
            setIfNotNull("channels", req.getChannels().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toMultipartBody(req: FilesUploadRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()

        if (req.getFile() != null) {
            form.addFile("file", req.getFile())
        }
        if (req.getFilestream() != null) {
            form.addFile("file", req.getFilestream(), req.getFilename())
        }
        setIfNotNull("filetype", req.getFiletype(), form)
        setIfNotNull("filename", req.getFilename(), form)
        setIfNotNull("title", req.getTitle(), form)
        setIfNotNull("initial_comment", req.getInitialComment(), form)

        if (req.getChannels() != null) {
            setIfNotNull("channels", req.getChannels().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        return form
    }

    fun toForm(req: FilesCommentsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("comment", req.getComment(), form)
        return form
    }

    fun toForm(req: FilesCommentsDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("id", req.getId(), form)
        return form
    }

    fun toForm(req: FilesCommentsEditRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("comment", req.getComment(), form)
        setIfNotNull("id", req.getId(), form)
        return form
    }

    //    public static MultipartBody.Builder toMultipartBody(FilesRemoteAddRequest req) {
    //        MultipartBody.Builder form = new MultipartBody.Builder();
    //        setIfNotNull("external_id", req.getExternalId(), form);
    //        setIfNotNull("external_url", req.getExternalUrl(), form);
    //        setIfNotNull("title", req.getTitle(), form);
    //        setIfNotNull("filetype", req.getFiletype(), form);
    //        if (req.getIndexableFileContents() != null) {
    //            RequestBody indexableFileContents = RequestBody.create(req.getFiletype() != null ? MediaType.parse(req.getFiletype()) : null, req.getIndexableFileContents());
    //            form.addFormDataPart("indexable_file_contents", req.getTitle(), indexableFileContents);
    //        }
    //        if (req.getPreviewImage() != null) {
    //            RequestBody previewImage = RequestBody.create(req.getFiletype() != null ? MediaType.parse(req.getFiletype()) : null, req.getPreviewImage());
    //            form.addFormDataPart("preview_image", req.getTitle(), previewImage);
    //        }
    //        return form;
    //    }
    fun toForm(req: FilesRemoteInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("external_id", req.getExternalId(), form)
        setIfNotNull("file", req.getFile(), form)
        return form
    }

    fun toForm(req: FilesRemoteListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("ts_from", req.getTsFrom(), form)
        setIfNotNull("ts_to", req.getTsTo(), form)
        return form
    }

    fun toForm(req: FilesRemoteRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("external_id", req.getExternalId(), form)
        setIfNotNull("file", req.getFile(), form)
        return form
    }

    fun toForm(req: FilesRemoteShareRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("external_id", req.getExternalId(), form)
        setIfNotNull("file", req.getFile(), form)
        if (req.getChannels() != null) {
            setIfNotNull("channels", req.getChannels().stream().collect(java.util.stream.Collectors.joining(",")), form)
        } else {
            throw java.lang.IllegalArgumentException("channels parameter is required for files.remote.share API")
        }
        return form
    }

    //    public static MultipartBody.Builder toMultipartBody(FilesRemoteUpdateRequest req) {
    //        MultipartBody.Builder form = new MultipartBody.Builder();
    //        setIfNotNull("external_id", req.getExternalId(), form);
    //        setIfNotNull("external_url", req.getExternalUrl(), form);
    //        setIfNotNull("title", req.getTitle(), form);
    //        setIfNotNull("filetype", req.getFiletype(), form);
    //        if (req.getIndexableFileContents() != null) {
    //            RequestBody indexableFileContents = RequestBody.create(req.getFiletype() != null ? MediaType.parse(req.getFiletype()) : null, req.getIndexableFileContents());
    //            form.addFormDataPart("indexable_file_contents", null, indexableFileContents);
    //        }
    //        if (req.getPreviewImage() != null) {
    //            RequestBody previewImage = RequestBody.create(req.getFiletype() != null ? MediaType.parse(req.getFiletype()) : null, req.getPreviewImage());
    //            form.addFormDataPart("preview_image", null, previewImage);
    //        }
    //        return form;
    //    }
    fun toForm(req: GroupsArchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: GroupsCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: GroupsCreateChildRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: GroupsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("validate", req.isValidate(), form)
        return form
    }

    fun toForm(req: GroupsHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("inclusive", req.isInclusive(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("unreads", req.isUnreads(), form)
        return form
    }

    fun toForm(req: GroupsRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        return form
    }

    fun toForm(req: GroupsInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        return form
    }

    fun toForm(req: GroupsInviteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: GroupsKickRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: GroupsLeaveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: GroupsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("exclude_archived", req.isExcludeArchived(), form)
        setIfNotNull("exclude_members", req.isExcludeMembers(), form)
        return form
    }

    fun toForm(req: GroupsMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts", req.getTs(), form)
        return form
    }

    fun toForm(req: GroupsOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: GroupsRenameRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("name", req.getName(), form)
        return form
    }

    fun toForm(req: GroupsSetPurposeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("purpose", req.getPurpose(), form)
        return form
    }

    fun toForm(req: GroupsSetTopicRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("topic", req.getTopic(), form)
        return form
    }

    fun toForm(req: GroupsUnarchiveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ImCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: ImHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("inclusive", req.isInclusive(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("unreads", req.isUnreads(), form)
        return form
    }

    fun toForm(req: ImListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("get_latest", req.getGetLatest(), form)
        return form
    }

    fun toForm(req: ImMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts", req.getTs(), form)
        return form
    }

    fun toForm(req: ImOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("return_im", req.isReturnIm(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        return form
    }

    fun toForm(req: ImRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        return form
    }

    fun toForm(req: MigrationExchangeRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("to_old", req.isToOld(), form)
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: MpimCloseRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: MpimHistoryRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("latest", req.getLatest(), form)
        setIfNotNull("oldest", req.getOldest(), form)
        setIfNotNull("inclusive", req.isInclusive(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("unreads", req.isUnreads(), form)
        return form
    }

    fun toForm(req: MpimListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("get_latest", req.getGetLatest(), form)
        return form
    }

    fun toForm(req: MpimRepliesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("thread_ts", req.getThreadTs(), form)
        return form
    }

    fun toForm(req: MpimMarkRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("ts", req.getTs(), form)
        return form
    }

    fun toForm(req: MpimOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: OAuthAccessRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("client_id", req.getClientId(), form)
        setIfNotNull("client_secret", req.getClientSecret(), form)
        setIfNotNull("code", req.getCode(), form)
        setIfNotNull("redirect_uri", req.getRedirectUri(), form)
        setIfNotNull("single_channel", req.isSingleChannel(), form)
        return form
    }

    fun toForm(req: OAuthTokenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("client_id", req.getClientId(), form)
        setIfNotNull("client_secret", req.getClientSecret(), form)
        setIfNotNull("code", req.getCode(), form)
        setIfNotNull("redirect_uri", req.getRedirectUri(), form)
        setIfNotNull("single_channel", req.isSingleChannel(), form)
        return form
    }

    fun toForm(req: PinsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: PinsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        return form
    }

    fun toForm(req: PinsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: ReactionsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: ReactionsGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        setIfNotNull("full", req.isFull(), form)
        return form
    }

    fun toForm(req: ReactionsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("full", req.isFull(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: ReactionsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: RemindersAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("text", req.getText(), form)
        setIfNotNull("time", req.getTime(), form)
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: RemindersCompleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("reminder", req.getReminder(), form)
        return form
    }

    fun toForm(req: RemindersDeleteRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("reminder", req.getReminder(), form)
        return form
    }

    fun toForm(req: RemindersInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("reminder", req.getReminder(), form)
        return form
    }

    fun toForm(req: RemindersListRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: RTMConnectRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("batch_presence_aware", req.isBatchPresenceAware(), form)
        setIfNotNull("presence_sub", req.isPresenceSub(), form)
        return form
    }

    fun toForm(req: RTMStartRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        setIfNotNull("batch_presence_aware", req.isBatchPresenceAware(), form)
        setIfNotNull("no_latest", req.isNoLatest(), form)
        setIfNotNull("no_unreads", req.isNoUnreads(), form)
        setIfNotNull("presence_sub", req.isPresenceSub(), form)
        setIfNotNull("simple_latest", req.isSimpleLatest(), form)
        setIfNotNull("mpim_aware", req.isMpimAware(), form)
        return form
    }

    fun toForm(req: SearchAllRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("query", req.getQuery(), form)
        setIfNotNull("sort", req.getSort(), form)
        setIfNotNull("sort_dir", req.getSortDir(), form)
        setIfNotNull("highlight", req.isHighlight(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: SearchMessagesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("query", req.getQuery(), form)
        setIfNotNull("sort", req.getSort(), form)
        setIfNotNull("sort_dir", req.getSortDir(), form)
        setIfNotNull("highlight", req.isHighlight(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: SearchFilesRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("query", req.getQuery(), form)
        setIfNotNull("sort", req.getSort(), form)
        setIfNotNull("sort_dir", req.getSortDir(), form)
        setIfNotNull("highlight", req.isHighlight(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: StarsAddRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: StarsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: StarsRemoveRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("channel", req.getChannel(), form)
        setIfNotNull("file", req.getFile(), form)
        setIfNotNull("file_comment", req.getFileComment(), form)
        setIfNotNull("timestamp", req.getTimestamp(), form)
        return form
    }

    fun toForm(req: TeamAccessLogsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("before", req.getBefore(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: TeamBillableInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: TeamInfoRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: TeamIntegrationLogsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("service_id", req.getServiceId(), form)
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("change_type", req.getChangeType(), form)
        setIfNotNull("count", req.getCount(), form)
        setIfNotNull("page", req.getPage(), form)
        return form
    }

    fun toForm(req: TeamProfileGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("visibility", req.getVisibility(), form)
        return form
    }

    fun toForm(req: UsergroupsCreateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("handle", req.getHandle(), form)
        setIfNotNull("description", req.getDescription(), form)
        if (req.getChannels() != null) {
            setIfNotNull("channels", req.getChannels().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("include_count", req.isIncludeCount(), form)
        return form
    }

    fun toForm(req: UsergroupsDisableRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("usergroup", req.getUsergroup(), form)
        setIfNotNull("include_count", req.isIncludeCount(), form)
        return form
    }

    fun toForm(req: UsergroupsEnableRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("usergroup", req.getUsergroup(), form)
        setIfNotNull("include_count", req.isIncludeCount(), form)
        return form
    }

    fun toForm(req: UsergroupsListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("include_disabled", req.isIncludeDisabled(), form)
        setIfNotNull("include_count", req.isIncludeCount(), form)
        setIfNotNull("include_users", req.isIncludeUsers(), form)
        return form
    }

    fun toForm(req: UsergroupsUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("usergroup", req.getUsergroup(), form)
        setIfNotNull("name", req.getName(), form)
        setIfNotNull("handle", req.getHandle(), form)
        setIfNotNull("description", req.getDescription(), form)
        if (req.getChannels() != null) {
            setIfNotNull("channels", req.getChannels().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("include_count", req.isIncludeCount(), form)
        return form
    }

    fun toForm(req: UsergroupUsersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("usergroup", req.getUsergroup(), form)
        setIfNotNull("include_disabled", req.isIncludeDisabled(), form)
        return form
    }

    fun toForm(req: UsergroupUsersUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("usergroup", req.getUsergroup(), form)
        if (req.getUsers() != null) {
            setIfNotNull("users", req.getUsers().stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        setIfNotNull("include_count", req.isIncludeCount(), form)
        return form
    }

    fun toForm(req: UsersConversationsRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("exclude_archived", req.isExcludeArchived(), form)
        setIfNotNull("limit", req.getLimit(), form)

        if (req.getTypes() != null) {
            val typeValues: MutableArray<String> = java.util.ArrayArray<String>()
            for (type in req.getTypes()) {
                typeValues.add(type.value())
            }
            setIfNotNull("types", typeValues.stream().collect(java.util.stream.Collectors.joining(",")), form)
        }
        return form
    }

    fun toForm(req: UsersDeletePhotoRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: UsersGetPresenceRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        return form
    }

    fun toForm(req: UsersIdentityRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    fun toForm(req: UsersInfoRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        return form
    }

    fun toForm(req: UsersListRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("cursor", req.getCursor(), form)
        setIfNotNull("limit", req.getLimit(), form)
        setIfNotNull("include_locale", req.isIncludeLocale(), form)
        setIfNotNull("presence", req.isPresence(), form)
        return form
    }

    fun toForm(req: UsersLookupByEmailRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("email", req.getEmail(), form)
        return form
    }

    fun toForm(req: UsersSetActiveRequest?): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        return form
    }

    //    public static MultipartBody.Builder toMultipartBody(UsersSetPhotoRequest req) {
    //        MultipartBody.Builder form = new MultipartBody.Builder();
    //        if (req.getImageData() != null) {
    //            RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), req.getImageData());
    //            form.addFormDataPart("image", "image", image);
    //        } else if (req.getImage() != null) {
    //            RequestBody image = RequestBody.create(MediaType.parse("imageData/*"), req.getImage());
    //            form.addFormDataPart("image", "image", image);
    //        }
    //        setIfNotNull("crop_x", req.getCropX(), form);
    //        setIfNotNull("crop_y", req.getCropY(), form);
    //        setIfNotNull("crop_w", req.getCropW(), form);
    //        return form;
    //    }
    fun toForm(req: UsersSetPresenceRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("presence", req.getPresence(), form)
        return form
    }

    fun toForm(req: UsersProfileGetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        setIfNotNull("include_labels", req.isIncludeLabels(), form)
        return form
    }

    fun toForm(req: UsersProfileSetRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user", req.getUser(), form)
        if (req.getProfile() != null) {
            setIfNotNull("profile", GsonFactory.createSnakeCase().toJson(req.getProfile()), form)
        } else {
            setIfNotNull("name", req.getName(), form)
            setIfNotNull("value", req.getValue(), form)
        }
        return form
    }

    fun toForm(req: ViewsOpenRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("trigger_id", req.getTriggerId(), form)
        if (req.getViewAsString() != null) {
            setIfNotNull("view", req.getViewAsString(), form)
        } else {
            setIfNotNull("view", GsonFactory.createSnakeCase().toJson(req.getView()), form)
        }
        return form
    }

    fun toForm(req: ViewsPushRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("trigger_id", req.getTriggerId(), form)
        if (req.getViewAsString() != null) {
            setIfNotNull("view", req.getViewAsString(), form)
        } else {
            setIfNotNull("view", GsonFactory.createSnakeCase().toJson(req.getView()), form)
        }
        return form
    }

    fun toForm(req: ViewsUpdateRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        if (req.getViewAsString() != null) {
            setIfNotNull("view", req.getViewAsString(), form)
        } else {
            setIfNotNull("view", GsonFactory.createSnakeCase().toJson(req.getView()), form)
        }
        setIfNotNull("external_id", req.getExternalId(), form)
        setIfNotNull("hash", req.getHash(), form)
        setIfNotNull("view_id", req.getViewId(), form)
        return form
    }

    fun toForm(req: ViewsPublishRequest): FormBody.Builder {
        val form: FormBody.Builder = Builder()
        setIfNotNull("user_id", req.getUserId(), form)
        if (req.getViewAsString() != null) {
            setIfNotNull("view", req.getViewAsString(), form)
        } else {
            setIfNotNull("view", GsonFactory.createSnakeCase().toJson(req.getView()), form)
        }
        setIfNotNull("hash", req.getHash(), form)
        return form
    }

    // ----------------------------------------------------------------------------------
    // internal methods
    // ----------------------------------------------------------------------------------
    private fun setIfNotNull(name: String, value: Any?, form: FormBody.Builder) {
        if (value != null) {
            if (value is Boolean) {
                val numValue = if (value) "1" else "0"
                form.add(name, numValue)
            } else {
                form.add(name, value.toString())
            }
        }
    } //    private static void setIfNotNull(String name, Object value, MultipartBody.Builder form) {
    //        if (value != null) {
    //            if (value instanceof Boolean) {
    //                String numValue = ((Boolean) value) ? "1" : "0";
    //                form.addFormDataPart(name, numValue);
    //            } else {
    //                form.addFormDataPart(name, String.valueOf(value));
    //            }
    //        }
    //    }
}
