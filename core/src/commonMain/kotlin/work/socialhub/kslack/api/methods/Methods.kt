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
    // apps.connections
    // ------------------------------
    const val APPS_CONNECTIONS_OPEN: String = "apps.connections.open"

    // ------------------------------
    // auth
    // ------------------------------
    const val AUTH_REVOKE: String = "auth.revoke"
    const val AUTH_TEST: String = "auth.test"

    // ------------------------------
    // bookmarks
    // ------------------------------
    const val BOOKMARKS_ADD: String = "bookmarks.add"
    const val BOOKMARKS_EDIT: String = "bookmarks.edit"
    const val BOOKMARKS_LIST: String = "bookmarks.list"
    const val BOOKMARKS_REMOVE: String = "bookmarks.remove"

    // ------------------------------
    // bots
    // ------------------------------
    const val BOTS_INFO: String = "bots.info"

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
    const val CONVERSATIONS_MARK: String = "conversations.mark"
    const val CONVERSATIONS_MEMBERS: String = "conversations.members"
    const val CONVERSATIONS_OPEN: String = "conversations.open"
    const val CONVERSATIONS_RENAME: String = "conversations.rename"
    const val CONVERSATIONS_REPLIES: String = "conversations.replies"
    const val CONVERSATIONS_SET_PURPOSE: String = "conversations.setPurpose"
    const val CONVERSATIONS_SET_TOPIC: String = "conversations.setTopic"
    const val CONVERSATIONS_UNARCHIVE: String = "conversations.unarchive"

    // ------------------------------
    // dialog (deprecated: use views.open for modals)
    // ------------------------------
    @Deprecated("Use views.open (modals with Block Kit) instead.")
    val DIALOG_OPEN: String = "dialog.open"

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
    // files
    // ------------------------------
    const val FILES_DELETE: String = "files.delete"
    const val FILES_INFO: String = "files.info"
    const val FILES_LIST: String = "files.list"
    const val FILES_REVOKE_PUBLIC_URL: String = "files.revokePublicURL"
    const val FILES_SHARED_PUBLIC_URL: String = "files.sharedPublicURL"
    const val FILES_GET_UPLOAD_URL_EXTERNAL: String = "files.getUploadURLExternal"
    const val FILES_COMPLETE_UPLOAD_EXTERNAL: String = "files.completeUploadExternal"

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
    // migration
    // ------------------------------
    const val MIGRATION_EXCHANGE: String = "migration.exchange"

    // ------------------------------
    // oauth
    // ------------------------------
    @Deprecated("Use oauth.v2.access instead.")
    val OAUTH_ACCESS: String = "oauth.access"
    const val OAUTH_V2_ACCESS: String = "oauth.v2.access"
    @Deprecated("Use oauth.v2.access instead.")
    val OAUTH_TOKEN: String = "oauth.token"

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
    // search
    // ------------------------------
    const val SEARCH_ALL: String = "search.all"
    const val SEARCH_FILES: String = "search.files"
    const val SEARCH_MESSAGES: String = "search.messages"

    // ------------------------------
    // stars (deprecated: replaced by "Later" view)
    // ------------------------------
    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    val STARS_ADD: String = "stars.add"
    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    val STARS_LIST: String = "stars.list"
    @Deprecated("Stars API is functionally deprecated. Replaced by Later view.")
    val STARS_REMOVE: String = "stars.remove"

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
    @Deprecated("Deprecated by Slack.")
    val USERS_SET_ACTIVE: String = "users.setActive"
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
