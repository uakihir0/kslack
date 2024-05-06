package com.github.seratch.jslack.api.methods.response.migration

import com.github.seratch.jslack.api.methods.SlackApiResponse

class MigrationExchangeResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    /**
     * The workspace/team ID containing the mapped users
     */
    var teamId: String? = null

    /**
     * The enterprise grid organization ID containing the workspace/team.
     */
    var enterpriseId: String? = null

    /**
     * A list of User IDs that cannot be mapped or found
     */
    var invalidUserIds: List<String>? = null

    /**
     * A mapping of provided user IDs with mapped user IDs
     */
    var userIdMap: Map<String, String>? = null
}