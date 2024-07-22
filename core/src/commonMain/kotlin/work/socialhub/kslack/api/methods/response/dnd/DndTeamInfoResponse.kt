package com.github.seratch.jslack.api.methods.response.dnd

import work.socialhub.kslack.api.methods.SlackApiResponse

class DndTeamInfoResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    // user.id -> info
    var users: Map<String, DndTeamMemberInfo>? = null

    class DndTeamMemberInfo {
        var isDndEnabled: Boolean = false
        var nextDndStartTs: Int? = null
        var nextDndEndTs: Int? = null
    }
}