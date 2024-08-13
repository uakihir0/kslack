package work.socialhub.kslack.api.methods.request.migration

import work.socialhub.kslack.api.methods.SlackApiRequest

/**
 * For Enterprise Grid workspaces, map local user IDs to global user IDs
 */
class MigrationExchangeRequest(
    /** Authentication token. Requires scope: `tokens.basic` */
    override var token: String?,
    /** Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`. */
    var isToOld: Boolean,
    /** A comma-separated list of user ids, up to 400 per request */
    var users: Array<String>?
) : SlackApiRequest