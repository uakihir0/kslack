package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.calls.*
import work.socialhub.kslack.api.methods.request.calls.participants.*
import work.socialhub.kslack.api.methods.response.calls.*
import work.socialhub.kslack.api.methods.response.calls.participants.*
import kotlin.js.JsExport

/**
 * Resource for Slack Huddle Calls APIs.
 *
 * Provides methods for creating, ending, updating, and managing calls,
 * as well as adding and removing call participants.
 *
 * @see <a href="https://api.slack.com/methods/calls">Calls API Docs</a>
 */
@JsExport
interface CallsResource {

    suspend fun callsAdd(
        req: CallsAddRequest
    ): CallsAddResponse

    @JsExport.Ignore
    fun callsAddBlocking(
        req: CallsAddRequest
    ): CallsAddResponse

    suspend fun callsEnd(
        req: CallsEndRequest
    ): CallsEndResponse

    @JsExport.Ignore
    fun callsEndBlocking(
        req: CallsEndRequest
    ): CallsEndResponse

    suspend fun callsInfo(
        req: CallsInfoRequest
    ): CallsInfoResponse

    @JsExport.Ignore
    fun callsInfoBlocking(
        req: CallsInfoRequest
    ): CallsInfoResponse

    suspend fun callsUpdate(
        req: CallsUpdateRequest
    ): CallsUpdateResponse

    @JsExport.Ignore
    fun callsUpdateBlocking(
        req: CallsUpdateRequest
    ): CallsUpdateResponse

    suspend fun callsParticipantsAdd(
        req: CallsParticipantsAddRequest
    ): CallsParticipantsAddResponse

    @JsExport.Ignore
    fun callsParticipantsAddBlocking(
        req: CallsParticipantsAddRequest
    ): CallsParticipantsAddResponse

    suspend fun callsParticipantsRemove(
        req: CallsParticipantsRemoveRequest
    ): CallsParticipantsRemoveResponse

    @JsExport.Ignore
    fun callsParticipantsRemoveBlocking(
        req: CallsParticipantsRemoveRequest
    ): CallsParticipantsRemoveResponse
}
