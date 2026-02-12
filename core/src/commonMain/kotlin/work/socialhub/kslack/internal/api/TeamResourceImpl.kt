package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.TeamResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
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
import work.socialhub.kslack.util.toBlocking

class TeamResourceImpl(
    token: String?
) : AbstractResourceImpl(token), TeamResource {

    override suspend fun teamAccessLogs(req: TeamAccessLogsRequest): TeamAccessLogsResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_ACCESS_LOGS, getToken(req))
    }

    override fun teamAccessLogsBlocking(req: TeamAccessLogsRequest): TeamAccessLogsResponse {
        return toBlocking { teamAccessLogs(req) }
    }

    override suspend fun teamBillableInfo(req: TeamBillableInfoRequest): TeamBillableInfoResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_BILLABLE_INFO, getToken(req))
    }

    override fun teamBillableInfoBlocking(req: TeamBillableInfoRequest): TeamBillableInfoResponse {
        return toBlocking { teamBillableInfo(req) }
    }

    override suspend fun teamInfo(req: TeamInfoRequest): TeamInfoResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_INFO, getToken(req))
    }

    override fun teamInfoBlocking(req: TeamInfoRequest): TeamInfoResponse {
        return toBlocking { teamInfo(req) }
    }

    override suspend fun teamIntegrationLogs(req: TeamIntegrationLogsRequest): TeamIntegrationLogsResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_INTEGRATION_LOGS, getToken(req))
    }

    override fun teamIntegrationLogsBlocking(req: TeamIntegrationLogsRequest): TeamIntegrationLogsResponse {
        return toBlocking { teamIntegrationLogs(req) }
    }

    override suspend fun teamProfileGet(req: TeamProfileGetRequest): TeamProfileGetResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_PROFILE_GET, getToken(req))
    }

    override fun teamProfileGetBlocking(req: TeamProfileGetRequest): TeamProfileGetResponse {
        return toBlocking { teamProfileGet(req) }
    }

    override suspend fun teamBillingInfo(req: TeamBillingInfoRequest): TeamBillingInfoResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_BILLING_INFO, getToken(req))
    }

    override fun teamBillingInfoBlocking(req: TeamBillingInfoRequest): TeamBillingInfoResponse {
        return toBlocking { teamBillingInfo(req) }
    }

    override suspend fun teamExternalTeamsDisconnect(req: TeamExternalTeamsDisconnectRequest): TeamExternalTeamsDisconnectResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_EXTERNAL_TEAMS_DISCONNECT, getToken(req))
    }

    override fun teamExternalTeamsDisconnectBlocking(req: TeamExternalTeamsDisconnectRequest): TeamExternalTeamsDisconnectResponse {
        return toBlocking { teamExternalTeamsDisconnect(req) }
    }

    override suspend fun teamExternalTeamsList(req: TeamExternalTeamsListRequest): TeamExternalTeamsListResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_EXTERNAL_TEAMS_LIST, getToken(req))
    }

    override fun teamExternalTeamsListBlocking(req: TeamExternalTeamsListRequest): TeamExternalTeamsListResponse {
        return toBlocking { teamExternalTeamsList(req) }
    }

    override suspend fun teamPreferencesList(req: TeamPreferencesListRequest): TeamPreferencesListResponse {
        return postFormWithToken(req.toParams(), Methods.TEAM_PREFERENCES_LIST, getToken(req))
    }

    override fun teamPreferencesListBlocking(req: TeamPreferencesListRequest): TeamPreferencesListResponse {
        return toBlocking { teamPreferencesList(req) }
    }
}
