package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.TeamResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
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
}
