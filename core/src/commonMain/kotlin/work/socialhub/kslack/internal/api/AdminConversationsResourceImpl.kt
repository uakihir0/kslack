package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.AdminConversationsResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.admin.conversations.*
import work.socialhub.kslack.api.methods.request.admin.conversations.restrict_access.*
import work.socialhub.kslack.api.methods.response.admin.conversations.*
import work.socialhub.kslack.api.methods.response.admin.conversations.restrict_access.*
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [AdminConversationsResource] for Slack's `admin.conversations.*` API methods.
 *
 * Handles HTTP POST requests for Enterprise Grid admin operations on conversations
 * including creation, banning, archiving, deletion, custom retention, custom
 * classification, and shared workspace management.
 *
 * All methods require `admin` OAuth scope and Enterprise Grid workspace.
 *
 * @param token Optional default token provided at factory initialization
 */
class AdminConversationsResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    AdminConversationsResource {

    override suspend fun adminConversationsCreate(
        req: AdminConversationsCreateRequest
    ): AdminConversationsCreateResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_CREATE,
            getToken(req),
        )
    }

    override fun adminConversationsCreateBlocking(
        req: AdminConversationsCreateRequest
    ): AdminConversationsCreateResponse {
        return toBlocking { adminConversationsCreate(req) }
    }

    override suspend fun adminConversationsBan(
        req: AdminConversationsBanRequest
    ): AdminConversationsBanResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_BAN,
            getToken(req),
        )
    }

    override fun adminConversationsBanBlocking(
        req: AdminConversationsBanRequest
    ): AdminConversationsBanResponse {
        return toBlocking { adminConversationsBan(req) }
    }

    override suspend fun adminConversationsUnban(
        req: AdminConversationsUnbanRequest
    ): AdminConversationsUnbanResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_UNBAN,
            getToken(req),
        )
    }

    override fun adminConversationsUnbanBlocking(
        req: AdminConversationsUnbanRequest
    ): AdminConversationsUnbanResponse {
        return toBlocking { adminConversationsUnban(req) }
    }

    override suspend fun adminConversationsArchive(
        req: AdminConversationsArchiveRequest
    ): AdminConversationsArchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_ARCHIVE,
            getToken(req),
        )
    }

    override fun adminConversationsArchiveBlocking(
        req: AdminConversationsArchiveRequest
    ): AdminConversationsArchiveResponse {
        return toBlocking { adminConversationsArchive(req) }
    }

    override suspend fun adminConversationsUnarchive(
        req: AdminConversationsUnarchiveRequest
    ): AdminConversationsUnarchiveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_UNARCHIVE,
            getToken(req),
        )
    }

    override fun adminConversationsUnarchiveBlocking(
        req: AdminConversationsUnarchiveRequest
    ): AdminConversationsUnarchiveResponse {
        return toBlocking { adminConversationsUnarchive(req) }
    }

    override suspend fun adminConversationsConnect(
        req: AdminConversationsConnectRequest
    ): AdminConversationsConnectResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_CONNECT,
            getToken(req),
        )
    }

    override fun adminConversationsConnectBlocking(
        req: AdminConversationsConnectRequest
    ): AdminConversationsConnectResponse {
        return toBlocking { adminConversationsConnect(req) }
    }

    override suspend fun adminConversationsDisconnect(
        req: AdminConversationsDisconnectRequest
    ): AdminConversationsDisconnectResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_DISCONNECT,
            getToken(req),
        )
    }

    override fun adminConversationsDisconnectBlocking(
        req: AdminConversationsDisconnectRequest
    ): AdminConversationsDisconnectResponse {
        return toBlocking { adminConversationsDisconnect(req) }
    }

    override suspend fun adminConversationsSearch(
        req: AdminConversationsSearchRequest
    ): AdminConversationsSearchResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_SEARCH,
            getToken(req),
        )
    }

    override fun adminConversationsSearchBlocking(
        req: AdminConversationsSearchRequest
    ): AdminConversationsSearchResponse {
        return toBlocking { adminConversationsSearch(req) }
    }

    override suspend fun adminConversationsGetCustomRetention(
        req: AdminConversationsGetCustomRetentionRequest
    ): AdminConversationsGetCustomRetentionResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_GET_CUSTOM_RETENTION,
            getToken(req),
        )
    }

    override fun adminConversationsGetCustomRetentionBlocking(
        req: AdminConversationsGetCustomRetentionRequest
    ): AdminConversationsGetCustomRetentionResponse {
        return toBlocking { adminConversationsGetCustomRetention(req) }
    }

    override suspend fun adminConversationsSetCustomRetention(
        req: AdminConversationsSetCustomRetentionRequest
    ): AdminConversationsSetCustomRetentionResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_SET_CUSTOM_RETENTION,
            getToken(req),
        )
    }

    override fun adminConversationsSetCustomRetentionBlocking(
        req: AdminConversationsSetCustomRetentionRequest
    ): AdminConversationsSetCustomRetentionResponse {
        return toBlocking { adminConversationsSetCustomRetention(req) }
    }

    override suspend fun adminConversationsDelete(
        req: AdminConversationsDeleteRequest
    ): AdminConversationsDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_DELETE,
            getToken(req),
        )
    }

    override fun adminConversationsDeleteBlocking(
        req: AdminConversationsDeleteRequest
    ): AdminConversationsDeleteResponse {
        return toBlocking { adminConversationsDelete(req) }
    }

    override suspend fun adminConversationsGetCustomClassification(
        req: AdminConversationsGetCustomClassificationRequest
    ): AdminConversationsGetCustomClassificationResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_GET_CUSTOM_CLASSIFICATION,
            getToken(req),
        )
    }

    override fun adminConversationsGetCustomClassificationBlocking(
        req: AdminConversationsGetCustomClassificationRequest
    ): AdminConversationsGetCustomClassificationResponse {
        return toBlocking { adminConversationsGetCustomClassification(req) }
    }

    override suspend fun adminConversationsSetCustomClassification(
        req: AdminConversationsSetCustomClassificationRequest
    ): AdminConversationsSetCustomClassificationResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_SET_CUSTOM_CLASSIFICATION,
            getToken(req),
        )
    }

    override fun adminConversationsSetCustomClassificationBlocking(
        req: AdminConversationsSetCustomClassificationRequest
    ): AdminConversationsSetCustomClassificationResponse {
        return toBlocking { adminConversationsSetCustomClassification(req) }
    }

    override suspend fun adminConversationsRestrictAccessAdd(
        req: AdminConversationsRestrictAccessAddRequest
    ): AdminConversationsRestrictAccessAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_RESTRICT_ACCESS_ADD,
            getToken(req),
        )
    }

    override fun adminConversationsRestrictAccessAddBlocking(
        req: AdminConversationsRestrictAccessAddRequest
    ): AdminConversationsRestrictAccessAddResponse {
        return toBlocking { adminConversationsRestrictAccessAdd(req) }
    }

    override suspend fun adminConversationsRestrictAccessList(
        req: AdminConversationsRestrictAccessListRequest
    ): AdminConversationsRestrictAccessListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_RESTRICT_ACCESS_LIST,
            getToken(req),
        )
    }

    override fun adminConversationsRestrictAccessListBlocking(
        req: AdminConversationsRestrictAccessListRequest
    ): AdminConversationsRestrictAccessListResponse {
        return toBlocking { adminConversationsRestrictAccessList(req) }
    }

    override suspend fun adminConversationsRestrictAccessRemove(
        req: AdminConversationsRestrictAccessRemoveRequest
    ): AdminConversationsRestrictAccessRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.ADMIN_CONVERSATIONS_RESTRICT_ACCESS_REMOVE,
            getToken(req),
        )
    }

    override fun adminConversationsRestrictAccessRemoveBlocking(
        req: AdminConversationsRestrictAccessRemoveRequest
    ): AdminConversationsRestrictAccessRemoveResponse {
        return toBlocking { adminConversationsRestrictAccessRemove(req) }
    }
}
