package work.socialhub.kslack.api.methods

object Methods {

    // ------------------------------
    // admin.apps
    // ------------------------------
    const val ADMIN_APPS_APPROVE: String = "admin.apps.approve"
    const val ADMIN_APPS_RESTRICT: String = "admin.apps.restrict"

    // ------------------------------
    // admin.apps.requests
    // ------------------------------
    const val ADMIN_APPS_REQUESTS_LIST: String = "admin.apps.requests.list"

    // ------------------------------
    // admin.inviteRequests
    // ------------------------------
    const val ADMIN_INVITE_REQUESTS_APPROVE: String = "admin.inviteRequests.approve"
    const val ADMIN_INVITE_REQUESTS_DENY: String = "admin.inviteRequests.deny"
    const val ADMIN_INVITE_REQUESTS_LIST: String = "admin.inviteRequests.list"
    const val ADMIN_INVITE_REQUESTS_APPROVED_LIST: String = "admin.inviteRequests.approved.list"
    const val ADMIN_INVITE_REQUESTS_DENIED_LIST: String = "admin.inviteRequests.denied.list"

    // ------------------------------
    // admin.teams.admins
    // ------------------------------
    const val ADMIN_TEAMS_ADMINS_LIST: String = "admin.teams.admins.list"

    // ------------------------------
    // admin.teams
    // ------------------------------
    const val ADMIN_TEAMS_CREATE: String = "admin.teams.create"

    // ------------------------------
    // admin.teams.owners
    // ------------------------------
    const val ADMIN_TEAMS_OWNERS_LIST: String = "admin.teams.owners.list"

    // ------------------------------
    // admin.teams.settings
    // ------------------------------
    const val ADMIN_TEAMS_SETTINGS_SET_DESCRIPTION: String = "admin.teams.settings.setDescription"
    const val ADMIN_TEAMS_SETTINGS_SET_ICON: String = "admin.teams.settings.setIcon"
    const val ADMIN_TEAMS_SETTINGS_SET_NAME: String = "admin.teams.settings.setName"

    // ------------------------------
    // admin.users
    // ------------------------------
    const val ADMIN_USERS_ASSIGN: String = "admin.users.assign"
    const val ADMIN_USERS_INVITE: String = "admin.users.invite"
    const val ADMIN_USERS_REMOVE: String = "admin.users.remove"
    const val ADMIN_USERS_SET_ADMIN: String = "admin.users.setAdmin"
    const val ADMIN_USERS_SET_OWNER: String = "admin.users.setOwner"
    const val ADMIN_USERS_SET_REGULAR: String = "admin.users.setRegular"

    // ------------------------------
    // admin.users.session
    // ------------------------------
    const val ADMIN_USERS_SESSION_RESET: String = "admin.users.session.reset"

    // ------------------------------
    // api
    // ------------------------------
    const val API_TEST: String = "api.test"

    // ------------------------------
    // apps
    // ------------------------------
    const val APPS_UNINSTALL: String = "apps.uninstall"

    // ------------------------------
    // apps.permissions
    // ------------------------------
    // Developer preview has ended
    // This feature was exclusive to our workspace apps developer preview.
    // The preview has now ended, but fan-favorite features such as token rotation
    // and the Conversations API will become available to classic Slack apps over the coming months.
    @Deprecated("")
    val APPS_PERMISSIONS_INFO: String = "apps.permissions.info"

    @Deprecated("")
    val APPS_PERMISSIONS_REQUEST: String = "apps.permissions.request"

    @Deprecated("")
    val APPS_PERMISSIONS_RESOURCES_LIST: String = "apps.permissions.resources.list"

    @Deprecated("")
    val APPS_PERMISSIONS_SCOPES_LIST: String = "apps.permissions.scopes.list"

    @Deprecated("")
    val APPS_PERMISSIONS_USERS_LIST: String = "apps.permissions.users.list"

    @Deprecated("")
    val APPS_PERMISSIONS_USERS_REQUEST: String = "apps.permissions.users.request"

    // ------------------------------
    // auth
    // ------------------------------
    const val AUTH_REVOKE: String = "auth.revoke"
    const val AUTH_TEST: String = "auth.test"

    // ------------------------------
    // bots
    // ------------------------------
    const val BOTS_INFO: String = "bots.info"

    // ------------------------------
    // channels
    // ------------------------------
    const val CHANNELS_ARCHIVE: String = "channels.archive"
    const val CHANNELS_CREATE: String = "channels.create"
    const val CHANNELS_HISTORY: String = "channels.history"
    const val CHANNELS_INFO: String = "channels.info"
    const val CHANNELS_INVITE: String = "channels.invite"
    const val CHANNELS_JOIN: String = "channels.join"
    const val CHANNELS_KICK: String = "channels.kick"
    const val CHANNELS_LEAVE: String = "channels.leave"
    const val CHANNELS_LIST: String = "channels.list"
    const val CHANNELS_MARK: String = "channels.mark"
    const val CHANNELS_RENAME: String = "channels.rename"
    const val CHANNELS_REPLIES: String = "channels.replies"
    const val CHANNELS_SET_PURPOSE: String = "channels.setPurpose"
    const val CHANNELS_SET_TOPIC: String = "channels.setTopic"
    const val CHANNELS_UNARCHIVE: String = "channels.unarchive"

    // ------------------------------
    // chat
    // ------------------------------
    const val CHAT_DELETE: String = "chat.delete"
    const val CHAT_DELETE_SCHEDULED_MESSAGE: String = "chat.deleteScheduledMessage"
    const val CHAT_GET_PERMALINK: String = "chat.getPermalink"
    const val CHAT_ME_MESSAGE: String = "chat.meMessage"
    const val CHAT_POST_EPHEMERAL: String = "chat.postEphemeral"
    const val CHAT_POST_MESSAGE: String = "chat.postMessage"
    const val CHAT_SCHEDULE_MESSAGE: String = "chat.scheduleMessage"
    const val CHAT_UNFURL: String = "chat.unfurl"
    const val CHAT_UPDATE: String = "chat.update"

    // ------------------------------
    // chat.scheduledMessages
    // ------------------------------
    const val CHAT_SCHEDULED_MESSAGES_LIST: String = "chat.scheduledMessages.list"

    // ------------------------------
    // conversations
    // ------------------------------
    const val CONVERSATIONS_ARCHIVE: String = "conversations.archive"
    const val CONVERSATIONS_CLOSE: String = "conversations.close"
    const val CONVERSATIONS_CREATE: String = "conversations.create"
    const val CONVERSATIONS_HISTORY: String = "conversations.history"
    const val CONVERSATIONS_INFO: String = "conversations.info"
    const val CONVERSATIONS_INVITE: String = "conversations.invite"
    const val CONVERSATIONS_JOIN: String = "conversations.join"
    const val CONVERSATIONS_KICK: String = "conversations.kick"
    const val CONVERSATIONS_LEAVE: String = "conversations.leave"
    const val CONVERSATIONS_LIST: String = "conversations.list"
    const val CONVERSATIONS_MEMBERS: String = "conversations.members"
    const val CONVERSATIONS_OPEN: String = "conversations.open"
    const val CONVERSATIONS_RENAME: String = "conversations.rename"
    const val CONVERSATIONS_REPLIES: String = "conversations.replies"
    const val CONVERSATIONS_SET_PURPOSE: String = "conversations.setPurpose"
    const val CONVERSATIONS_SET_TOPIC: String = "conversations.setTopic"
    const val CONVERSATIONS_UNARCHIVE: String = "conversations.unarchive"

    // ------------------------------
    // dialog
    // ------------------------------
    const val DIALOG_OPEN: String = "dialog.open"

    // ------------------------------
    // dnd
    // ------------------------------
    const val DND_END_DND: String = "dnd.endDnd"
    const val DND_END_SNOOZE: String = "dnd.endSnooze"
    const val DND_INFO: String = "dnd.info"
    const val DND_SET_SNOOZE: String = "dnd.setSnooze"
    const val DND_TEAM_INFO: String = "dnd.teamInfo"

    // ------------------------------
    // emoji
    // ------------------------------
    const val EMOJI_LIST: String = "emoji.list"

    // ------------------------------
    // files.comments
    // ------------------------------
    @Deprecated("") // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    val FILES_COMMENTS_ADD: String = "files.comments.add"

    @Deprecated("") // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    val FILES_COMMENTS_DELETE: String = "files.comments.delete"

    @Deprecated("") // https://api.slack.com/changelog/2018-05-file-threads-soon-tread
    val FILES_COMMENTS_EDIT: String = "files.comments.edit"

    // ------------------------------
    // files
    // ------------------------------
    const val FILES_DELETE: String = "files.delete"
    const val FILES_INFO: String = "files.info"
    const val FILES_LIST: String = "files.list"
    const val FILES_REVOKE_PUBLIC_URL: String = "files.revokePublicURL"
    const val FILES_SHARED_PUBLIC_URL: String = "files.sharedPublicURL"
    const val FILES_UPLOAD: String = "files.upload"

    // ------------------------------
    // files.remote
    // https://api.slack.com/messaging/files/remote
    // ------------------------------
    const val FILES_REMOTE_ADD: String = "files.remote.add"
    const val FILES_REMOTE_INFO: String = "files.remote.info"
    const val FILES_REMOTE_LIST: String = "files.remote.list"
    const val FILES_REMOTE_REMOVE: String = "files.remote.remove"
    const val FILES_REMOTE_SHARE: String = "files.remote.share"
    const val FILES_REMOTE_UPDATE: String = "files.remote.update"

    // ------------------------------
    // groups
    // ------------------------------
    const val GROUPS_ARCHIVE: String = "groups.archive"

    @Deprecated("") // https://github.com/slackapi/slack-api-specs/issues/12
    val GROUPS_CLOSE: String = "groups.close"
    const val GROUPS_CREATE: String = "groups.create"
    const val GROUPS_CREATE_CHILD: String = "groups.createChild"
    const val GROUPS_HISTORY: String = "groups.history"
    const val GROUPS_INFO: String = "groups.info"
    const val GROUPS_INVITE: String = "groups.invite"
    const val GROUPS_KICK: String = "groups.kick"
    const val GROUPS_LEAVE: String = "groups.leave"
    const val GROUPS_LIST: String = "groups.list"
    const val GROUPS_MARK: String = "groups.mark"
    const val GROUPS_OPEN: String = "groups.open"
    const val GROUPS_RENAME: String = "groups.rename"
    const val GROUPS_SET_PURPOSE: String = "groups.setPurpose"
    const val GROUPS_SET_TOPIC: String = "groups.setTopic"
    const val GROUPS_UNARCHIVE: String = "groups.unarchive"
    const val GROUPS_REPLIES: String = "groups.replies"

    // ------------------------------
    // im
    // ------------------------------
    const val IM_CLOSE: String = "im.close"
    const val IM_HISTORY: String = "im.history"
    const val IM_LIST: String = "im.list"
    const val IM_MARK: String = "im.mark"
    const val IM_OPEN: String = "im.open"
    const val IM_REPLIES: String = "im.replies"

    // ------------------------------
    // migration
    // ------------------------------
    const val MIGRATION_EXCHANGE: String = "migration.exchange"

    // ------------------------------
    // mpim
    // ------------------------------
    const val MPIM_CLOSE: String = "mpim.close"
    const val MPIM_HISTORY: String = "mpim.history"
    const val MPIM_LIST: String = "mpim.list"
    const val MPIM_MARK: String = "mpim.mark"
    const val MPIM_OPEN: String = "mpim.open"
    const val MPIM_REPLIES: String = "mpim.replies"

    // ------------------------------
    // oauth
    // ------------------------------
    const val OAUTH_ACCESS: String = "oauth.access"
    const val OAUTH_V2_ACCESS: String = "oauth.v2.access"
    const val OAUTH_TOKEN: String = "oauth.token"

    // ------------------------------
    // pins
    // ------------------------------
    const val PINS_ADD: String = "pins.add"
    const val PINS_LIST: String = "pins.list"
    const val PINS_REMOVE: String = "pins.remove"

    // ------------------------------
    // reactions
    // ------------------------------
    const val REACTIONS_ADD: String = "reactions.add"
    const val REACTIONS_GET: String = "reactions.get"
    const val REACTIONS_LIST: String = "reactions.list"
    const val REACTIONS_REMOVE: String = "reactions.remove"

    // ------------------------------
    // reminders
    // ------------------------------
    const val REMINDERS_ADD: String = "reminders.add"
    const val REMINDERS_COMPLETE: String = "reminders.complete"
    const val REMINDERS_DELETE: String = "reminders.delete"
    const val REMINDERS_INFO: String = "reminders.info"
    const val REMINDERS_LIST: String = "reminders.list"

    // ------------------------------
    // rtm
    // ------------------------------
    const val RTM_CONNECT: String = "rtm.connect"
    const val RTM_START: String = "rtm.start"

    // ------------------------------
    // search
    // ------------------------------
    const val SEARCH_ALL: String = "search.all"
    const val SEARCH_FILES: String = "search.files"
    const val SEARCH_MESSAGES: String = "search.messages"

    // ------------------------------
    // stars
    // ------------------------------
    const val STARS_ADD: String = "stars.add"
    const val STARS_LIST: String = "stars.list"
    const val STARS_REMOVE: String = "stars.remove"

    // ------------------------------
    // team
    // ------------------------------
    const val TEAM_ACCESS_LOGS: String = "team.accessLogs"
    const val TEAM_BILLABLE_INFO: String = "team.billableInfo"
    const val TEAM_INFO: String = "team.info"
    const val TEAM_INTEGRATION_LOGS: String = "team.integrationLogs"

    // ------------------------------
    // team.profile
    // ------------------------------
    const val TEAM_PROFILE_GET: String = "team.profile.get"

    // ------------------------------
    // usergroups
    // ------------------------------
    const val USERGROUPS_CREATE: String = "usergroups.create"
    const val USERGROUPS_DISABLE: String = "usergroups.disable"
    const val USERGROUPS_ENABLE: String = "usergroups.enable"
    const val USERGROUPS_LIST: String = "usergroups.list"
    const val USERGROUPS_UPDATE: String = "usergroups.update"

    // ------------------------------
    // usergroups.users
    // ------------------------------
    const val USERGROUPS_USERS_LIST: String = "usergroups.users.list"
    const val USERGROUPS_USERS_UPDATE: String = "usergroups.users.update"

    // ------------------------------
    // users
    // ------------------------------
    const val USERS_CONVERSATIONS: String = "users.conversations"
    const val USERS_DELETE_PHOTO: String = "users.deletePhoto"
    const val USERS_GET_PRESENCE: String = "users.getPresence"
    const val USERS_IDENTITY: String = "users.identity"
    const val USERS_INFO: String = "users.info"
    const val USERS_LIST: String = "users.list"
    const val USERS_LOOKUP_BY_EMAIL: String = "users.lookupByEmail"
    const val USERS_SET_ACTIVE: String = "users.setActive"
    const val USERS_SET_PHOTO: String = "users.setPhoto"
    const val USERS_SET_PRESENCE: String = "users.setPresence"

    // ------------------------------
    // users.profile
    // ------------------------------
    const val USERS_PROFILE_GET: String = "users.profile.get"
    const val USERS_PROFILE_SET: String = "users.profile.set"

    // ------------------------------
    // views
    // https://api.slack.com/block-kit/surfaces/modals
    // ------------------------------
    const val VIEWS_OPEN: String = "views.open"
    const val VIEWS_PUSH: String = "views.push"
    const val VIEWS_UPDATE: String = "views.update"

    // https://api.slack.com/surfaces/tabs
    const val VIEWS_PUBLISH: String = "views.publish"
}
