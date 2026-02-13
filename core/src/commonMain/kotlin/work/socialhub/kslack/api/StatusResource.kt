package work.socialhub.kslack.api

import work.socialhub.kslack.api.status.model.CurrentStatus
import work.socialhub.kslack.api.status.model.SlackIssue
import kotlin.js.JsExport

@JsExport
interface StatusResource {

    suspend fun current(): CurrentStatus

    @JsExport.Ignore
    fun currentBlocking(): CurrentStatus

    suspend fun history(): Array<SlackIssue>

    @JsExport.Ignore
    fun historyBlocking(): Array<SlackIssue>
}
