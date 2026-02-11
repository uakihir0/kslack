package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.files.*
import work.socialhub.kslack.api.methods.request.files.remote.*
import work.socialhub.kslack.api.methods.response.files.*
import work.socialhub.kslack.api.methods.response.files.remote.*
import kotlin.js.JsExport

@JsExport
interface FilesResource {

    suspend fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse

    @JsExport.Ignore
    fun filesDeleteBlocking(
        req: FilesDeleteRequest
    ): FilesDeleteResponse

    suspend fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse

    @JsExport.Ignore
    fun filesInfoBlocking(
        req: FilesInfoRequest
    ): FilesInfoResponse

    suspend fun filesList(
        req: FilesListRequest
    ): FilesListResponse

    @JsExport.Ignore
    fun filesListBlocking(
        req: FilesListRequest
    ): FilesListResponse

    suspend fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse

    @JsExport.Ignore
    fun filesRevokePublicURLBlocking(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse

    suspend fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse

    @JsExport.Ignore
    fun filesSharedPublicURLBlocking(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse

    suspend fun filesGetUploadURLExternal(
        req: FilesGetUploadURLExternalRequest
    ): FilesGetUploadURLExternalResponse

    @JsExport.Ignore
    fun filesGetUploadURLExternalBlocking(
        req: FilesGetUploadURLExternalRequest
    ): FilesGetUploadURLExternalResponse

    suspend fun filesCompleteUploadExternal(
        req: FilesCompleteUploadExternalRequest
    ): FilesCompleteUploadExternalResponse

    @JsExport.Ignore
    fun filesCompleteUploadExternalBlocking(
        req: FilesCompleteUploadExternalRequest
    ): FilesCompleteUploadExternalResponse

    suspend fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse

    @JsExport.Ignore
    fun filesRemoteAddBlocking(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse

    suspend fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse

    @JsExport.Ignore
    fun filesRemoteInfoBlocking(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse

    suspend fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse

    @JsExport.Ignore
    fun filesRemoteListBlocking(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse

    suspend fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse

    @JsExport.Ignore
    fun filesRemoteRemoveBlocking(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse

    suspend fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse

    @JsExport.Ignore
    fun filesRemoteShareBlocking(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse

    suspend fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse

    @JsExport.Ignore
    fun filesRemoteUpdateBlocking(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse
}
