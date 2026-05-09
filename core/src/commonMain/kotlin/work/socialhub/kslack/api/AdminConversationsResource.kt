package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.admin.conversations.*
import work.socialhub.kslack.api.methods.request.admin.conversations.restrict_access.*
import work.socialhub.kslack.api.methods.response.admin.conversations.*
import work.socialhub.kslack.api.methods.response.admin.conversations.restrict_access.*
import kotlin.js.JsExport

@JsExport
interface AdminConversationsResource {

    suspend fun adminConversationsCreate(
        req: AdminConversationsCreateRequest
    ): AdminConversationsCreateResponse

    @JsExport.Ignore
    fun adminConversationsCreateBlocking(
        req: AdminConversationsCreateRequest
    ): AdminConversationsCreateResponse

    suspend fun adminConversationsBan(
        req: AdminConversationsBanRequest
    ): AdminConversationsBanResponse

    @JsExport.Ignore
    fun adminConversationsBanBlocking(
        req: AdminConversationsBanRequest
    ): AdminConversationsBanResponse

    suspend fun adminConversationsUnban(
        req: AdminConversationsUnbanRequest
    ): AdminConversationsUnbanResponse

    @JsExport.Ignore
    fun adminConversationsUnbanBlocking(
        req: AdminConversationsUnbanRequest
    ): AdminConversationsUnbanResponse

    suspend fun adminConversationsArchive(
        req: AdminConversationsArchiveRequest
    ): AdminConversationsArchiveResponse

    @JsExport.Ignore
    fun adminConversationsArchiveBlocking(
        req: AdminConversationsArchiveRequest
    ): AdminConversationsArchiveResponse

    suspend fun adminConversationsUnarchive(
        req: AdminConversationsUnarchiveRequest
    ): AdminConversationsUnarchiveResponse

    @JsExport.Ignore
    fun adminConversationsUnarchiveBlocking(
        req: AdminConversationsUnarchiveRequest
    ): AdminConversationsUnarchiveResponse

    suspend fun adminConversationsConnect(
        req: AdminConversationsConnectRequest
    ): AdminConversationsConnectResponse

    @JsExport.Ignore
    fun adminConversationsConnectBlocking(
        req: AdminConversationsConnectRequest
    ): AdminConversationsConnectResponse

    suspend fun adminConversationsDisconnect(
        req: AdminConversationsDisconnectRequest
    ): AdminConversationsDisconnectResponse

    @JsExport.Ignore
    fun adminConversationsDisconnectBlocking(
        req: AdminConversationsDisconnectRequest
    ): AdminConversationsDisconnectResponse

    suspend fun adminConversationsSearch(
        req: AdminConversationsSearchRequest
    ): AdminConversationsSearchResponse

    @JsExport.Ignore
    fun adminConversationsSearchBlocking(
        req: AdminConversationsSearchRequest
    ): AdminConversationsSearchResponse

    suspend fun adminConversationsGetCustomRetention(
        req: AdminConversationsGetCustomRetentionRequest
    ): AdminConversationsGetCustomRetentionResponse

    @JsExport.Ignore
    fun adminConversationsGetCustomRetentionBlocking(
        req: AdminConversationsGetCustomRetentionRequest
    ): AdminConversationsGetCustomRetentionResponse

    suspend fun adminConversationsSetCustomRetention(
        req: AdminConversationsSetCustomRetentionRequest
    ): AdminConversationsSetCustomRetentionResponse

    @JsExport.Ignore
    fun adminConversationsSetCustomRetentionBlocking(
        req: AdminConversationsSetCustomRetentionRequest
    ): AdminConversationsSetCustomRetentionResponse

    suspend fun adminConversationsDelete(
        req: AdminConversationsDeleteRequest
    ): AdminConversationsDeleteResponse

    @JsExport.Ignore
    fun adminConversationsDeleteBlocking(
        req: AdminConversationsDeleteRequest
    ): AdminConversationsDeleteResponse

    suspend fun adminConversationsGetCustomClassification(
        req: AdminConversationsGetCustomClassificationRequest
    ): AdminConversationsGetCustomClassificationResponse

    @JsExport.Ignore
    fun adminConversationsGetCustomClassificationBlocking(
        req: AdminConversationsGetCustomClassificationRequest
    ): AdminConversationsGetCustomClassificationResponse

    suspend fun adminConversationsSetCustomClassification(
        req: AdminConversationsSetCustomClassificationRequest
    ): AdminConversationsSetCustomClassificationResponse

    @JsExport.Ignore
    fun adminConversationsSetCustomClassificationBlocking(
        req: AdminConversationsSetCustomClassificationRequest
    ): AdminConversationsSetCustomClassificationResponse

    suspend fun adminConversationsRestrictAccessAdd(
        req: AdminConversationsRestrictAccessAddRequest
    ): AdminConversationsRestrictAccessAddResponse

    @JsExport.Ignore
    fun adminConversationsRestrictAccessAddBlocking(
        req: AdminConversationsRestrictAccessAddRequest
    ): AdminConversationsRestrictAccessAddResponse

    suspend fun adminConversationsRestrictAccessList(
        req: AdminConversationsRestrictAccessListRequest
    ): AdminConversationsRestrictAccessListResponse

    @JsExport.Ignore
    fun adminConversationsRestrictAccessListBlocking(
        req: AdminConversationsRestrictAccessListRequest
    ): AdminConversationsRestrictAccessListResponse

    suspend fun adminConversationsRestrictAccessRemove(
        req: AdminConversationsRestrictAccessRemoveRequest
    ): AdminConversationsRestrictAccessRemoveResponse

    @JsExport.Ignore
    fun adminConversationsRestrictAccessRemoveBlocking(
        req: AdminConversationsRestrictAccessRemoveRequest
    ): AdminConversationsRestrictAccessRemoveResponse
}
