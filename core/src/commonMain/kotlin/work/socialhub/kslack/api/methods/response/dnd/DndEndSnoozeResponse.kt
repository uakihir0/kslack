package work.socialhub.kslack.api.methods.response.dnd

import work.socialhub.kslack.api.methods.SlackApiResponse

class DndEndSnoozeResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var isDndEnabled: Boolean = false
    var nextDndStartTs: Int? = null
    var nextDndEndTs: Int? = null
    var isSnoozeEnabled: Boolean = false
}