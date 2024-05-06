package com.github.seratch.jslack.api.methods.response.team

import com.github.seratch.jslack.api.model.BillableInfo

class TeamBillableInfoResponse : SlackApiResponse {
    var isOk: Boolean = false
    var warning: String? = null
    var error: String? = null
    var needed: String? = null
    var provided: String? = null

    var billableInfo: Map<String, BillableInfo>? = null
}