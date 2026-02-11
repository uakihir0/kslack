package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.dnd.*
import work.socialhub.kslack.api.methods.response.dnd.*
import kotlin.js.JsExport

@JsExport
interface DndResource {

    suspend fun dndEndDnd(
        req: DndEndDndRequest
    ): DndEndDndResponse

    @JsExport.Ignore
    fun dndEndDndBlocking(
        req: DndEndDndRequest
    ): DndEndDndResponse

    suspend fun dndEndSnooze(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    @JsExport.Ignore
    fun dndEndSnoozeBlocking(
        req: DndEndSnoozeRequest
    ): DndEndSnoozeResponse

    suspend fun dndInfo(
        req: DndInfoRequest
    ): DndInfoResponse

    @JsExport.Ignore
    fun dndInfoBlocking(
        req: DndInfoRequest
    ): DndInfoResponse

    suspend fun dndSetSnooze(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    @JsExport.Ignore
    fun dndSetSnoozeBlocking(
        req: DndSetSnoozeRequest
    ): DndSetSnoozeResponse

    suspend fun dndTeamInfo(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse

    @JsExport.Ignore
    fun dndTeamInfoBlocking(
        req: DndTeamInfoRequest
    ): DndTeamInfoResponse
}
