package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.reminders.*
import work.socialhub.kslack.api.methods.response.reminders.*
import kotlin.js.JsExport

@JsExport
interface RemindersResource {

    suspend fun remindersAdd(
        req: RemindersAddRequest
    ): RemindersAddResponse

    @JsExport.Ignore
    fun remindersAddBlocking(
        req: RemindersAddRequest
    ): RemindersAddResponse

    suspend fun remindersComplete(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    @JsExport.Ignore
    fun remindersCompleteBlocking(
        req: RemindersCompleteRequest
    ): RemindersCompleteResponse

    suspend fun remindersDelete(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    @JsExport.Ignore
    fun remindersDeleteBlocking(
        req: RemindersDeleteRequest
    ): RemindersDeleteResponse

    suspend fun remindersInfo(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    @JsExport.Ignore
    fun remindersInfoBlocking(
        req: RemindersInfoRequest
    ): RemindersInfoResponse

    suspend fun remindersList(
        req: RemindersListRequest
    ): RemindersListResponse

    @JsExport.Ignore
    fun remindersListBlocking(
        req: RemindersListRequest
    ): RemindersListResponse
}
