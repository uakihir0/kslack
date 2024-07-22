package work.socialhub.kslack.api.methods.request.admin.teams

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * https://api.slack.com/methods/admin.teams.create
 */
class AdminTeamsCreateRequest(
    /** Authentication token bearing required scopes. */
    override var token: String?,
    /** Team domain (for example, slacksoftballteam). */
    var teamDomain: String?,
    /** Team name (for example, Slack Softball Team). */
    var teamName: String?,
    /** Description for the team. */
    var teamDescription: String?,
    /** Who can join the team. A team's discoverability can be open, closed, invite_only, or unlisted.*/
    var teamDiscoverability: String?
) : SlackApiRequest