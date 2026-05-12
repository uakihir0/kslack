package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.files.*
import work.socialhub.kslack.api.methods.request.files.remote.*
import work.socialhub.kslack.api.methods.response.files.*
import work.socialhub.kslack.api.methods.response.files.remote.*
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `files.*` API methods.
 *
 * Provides methods for uploading, downloading, listing, deleting, and managing files
 * across Slack workspaces. This includes both direct file uploads and remote file operations.
 *
 * All file operations require appropriate OAuth scopes (e.g., `files:read`, `files:write`).
 *
 * # File Upload Flow
 *
 * For large files, use the external upload workflow:
 * 1. `filesGetUploadURLExternal` - Get a temporary upload URL
 * 2. Upload the file to the URL via HTTP PUT
 * 3. `filesCompleteUploadExternal` - Finalize the upload
 *
 * For small files, use `filesRemoteAdd` to add a file from a remote URL.
 *
 * # Remote Files
 *
 * Remote files allow referencing files hosted outside Slack:
 * ```kotlin
 * val response = slack.files.remoteAdd(
 *     FilesRemoteAddRequest(
 *         title = "Report.pdf",
 *         filetype = "pdf",
 *         remoteUrl = "https://example.com/report.pdf",
 *         filename = "report.pdf"
 *     )
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/files.delete">files.delete</a>
 * @see <a href="https://docs.slack.dev/reference/methods/files.info">files.info</a>
 * @see <a href="https://docs.slack.dev/reference/methods/files.list">files.list</a>
 * @see <a href="https://docs.slack.dev/reference/methods/files.remote.add">files.remote.add</a>
 */
@JsExport
interface FilesResource {

    /**
     * Deletes a file by its ID.
     *
     * Requires the `files:write` OAuth scope. Only the file owner or a workspace
     * admin can delete a file.
     *
     * @param req Request containing the file ID to delete
     * @return Response indicating whether the file was deleted successfully
     * @see <a href="https://docs.slack.dev/reference/methods/files.delete">files.delete</a>
     */
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
