package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.team.TeamAccessLogsRequest
import work.socialhub.kslack.api.methods.request.team.TeamBillableInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamInfoRequest
import work.socialhub.kslack.api.methods.request.team.TeamIntegrationLogsRequest
import work.socialhub.kslack.api.methods.request.team.billing.TeamBillingInfoRequest
import work.socialhub.kslack.api.methods.request.team.external_teams.TeamExternalTeamsDisconnectRequest
import work.socialhub.kslack.api.methods.request.team.external_teams.TeamExternalTeamsListRequest
import work.socialhub.kslack.api.methods.request.team.preferences.TeamPreferencesListRequest
import work.socialhub.kslack.api.methods.request.team.profile.TeamProfileGetRequest
import work.socialhub.kslack.api.methods.response.team.TeamAccessLogsResponse
import work.socialhub.kslack.api.methods.response.team.TeamBillableInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamInfoResponse
import work.socialhub.kslack.api.methods.response.team.TeamIntegrationLogsResponse
import work.socialhub.kslack.api.methods.response.team.billing.TeamBillingInfoResponse
import work.socialhub.kslack.api.methods.response.team.external_teams.TeamExternalTeamsDisconnectResponse
import work.socialhub.kslack.api.methods.response.team.external_teams.TeamExternalTeamsListResponse
import work.socialhub.kslack.api.methods.response.team.preferences.TeamPreferencesListResponse
import work.socialhub.kslack.api.methods.response.team.profile.TeamProfileGetResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `team.*` API methods.
 *
 * Provides methods for retrieving team/workspace information, access logs,
 * billable user details, integration logs, profile fields, preferences,
 * and external team connections.
 *
 * # Access Requirements
 * - Most methods require `admin` OAuth scope
 * - `team.info` works with user tokens for basic info
 * - Billing and access log methods require Enterprise Grid
 *
 * # Usage Example
 * ```kotlin
 * // Get basic team info
 * val info = slack.team.info(TeamInfoRequest())
 *
 * // Get team profile fields
 * val profile = slack.team.profileGet(TeamProfileGetRequest())
 *
 * // List team preferences
 * val preferences = slack.team.preferencesList(
 *     TeamPreferencesListRequest()
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/team.info">team.info</a>
 * @see <a href="https://docs.slack.dev/reference/methods/team.accessLogs">team.accessLogs</a>
 * @see <a href="https://docs.slack.dev/reference/methods/team.profile.get">team.profile.get</a>
 */
@JsExport
interface TeamResource {

    /**
     * Retrieves logs of user access to the workspace.
     *
     * Requires `admin` scope and Enterprise Grid workspace.
     * Returns recent authentication events for workspace members.
     *
     * @param req Request with optional pagination and user filters
     * @return Response containing access log entries
     * @see <a href="https://docs.slack.dev/reference/methods/team.accessLogs">team.accessLogs</a>
     */
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

    suspend fun teamBillingInfo(
        req: TeamBillingInfoRequest
    ): TeamBillingInfoResponse

    @JsExport.Ignore
    fun teamBillingInfoBlocking(
        req: TeamBillingInfoRequest
    ): TeamBillingInfoResponse

    suspend fun teamExternalTeamsDisconnect(
        req: TeamExternalTeamsDisconnectRequest
    ): TeamExternalTeamsDisconnectResponse

    @JsExport.Ignore
    fun teamExternalTeamsDisconnectBlocking(
        req: TeamExternalTeamsDisconnectRequest
    ): TeamExternalTeamsDisconnectResponse

    suspend fun teamExternalTeamsList(
        req: TeamExternalTeamsListRequest
    ): TeamExternalTeamsListResponse

    @JsExport.Ignore
    fun teamExternalTeamsListBlocking(
        req: TeamExternalTeamsListRequest
    ): TeamExternalTeamsListResponse

    suspend fun teamPreferencesList(
        req: TeamPreferencesListRequest
    ): TeamPreferencesListResponse

    @JsExport.Ignore
    fun teamPreferencesListBlocking(
        req: TeamPreferencesListRequest
    ): TeamPreferencesListResponse
}
