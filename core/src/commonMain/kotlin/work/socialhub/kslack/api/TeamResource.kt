package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.team.TeamAccessLogsRequest
import work.socialhub.kslack.api.methods.request.team.TeamBillableInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamIntegrationLogsRequest
import work.socialhub.kslack.api.methods.request.team.profile.TeamProfileGetRequest
import work.socialhub.kslack.api.methods.response.team.TeamAccessLogsResponse
import work.socialhub.kslack.api.methods.response.team.TeamBillableInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamIntegrationLogsResponse
import work.socialhub.kslack.api.methods.response.team.profile.TeamProfileGetResponse
import kotlin.js.JsExport

@JsExport
interface TeamResource {

    suspend fun teamAccessLogs(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse

    @JsExport.Ignore
    fun teamAccessLogsBlocking(
        req: TeamAccessLogsRequest
    ): TeamAccessLogsResponse

    suspend fun teamBillableInfo(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse

    @JsExport.Ignore
    fun teamBillableInfoBlocking(
        req: TeamBillableInfoRequest
    ): TeamBillableInfoResponse

    suspend fun teamInfo(
        req: TeamInfoRequest
    ): TeamInfoResponse

    @JsExport.Ignore
    fun teamInfoBlocking(
        req: TeamInfoRequest
    ): TeamInfoResponse

    suspend fun teamIntegrationLogs(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse

    @JsExport.Ignore
    fun teamIntegrationLogsBlocking(
        req: TeamIntegrationLogsRequest
    ): TeamIntegrationLogsResponse

    suspend fun teamProfileGet(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse

    @JsExport.Ignore
    fun teamProfileGetBlocking(
        req: TeamProfileGetRequest
    ): TeamProfileGetResponse
}
