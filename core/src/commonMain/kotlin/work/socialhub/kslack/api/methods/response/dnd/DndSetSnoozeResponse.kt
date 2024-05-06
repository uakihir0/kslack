package com.github.seratch.jslack.api.methods.response.dnd

import com.github.seratch.jslack.api.methods.SlackApiResponse

class DndSetSnoozeResponse : SlackApiResponse {
    override var isOk: Boolean = false
    override var warning: String? = null
    override var error: String? = null
    override var needed: String? = null
    override var provided: String? = null

    var isSnoozeEnabled: Boolean = false
    var snoozeEndtime: Int? = null
    var snoozeRemaining: Int? = null
}