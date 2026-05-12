package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.bookmarks.*
import work.socialhub.kslack.api.methods.response.bookmarks.*
import kotlin.js.JsExport

/**
 * Resource for channel bookmark management APIs.
 *
 * Provides methods to add, edit, list, remove, and delete bookmarks within channels.
 * Bookmarks allow users to pin and organize important messages and files.
 *
 * @see <a href="https://api.slack.com/methods/bookmarks.add">bookmarks.add</a>
 * @see <a href="https://api.slack.com/methods/bookmarks.delete">bookmarks.delete</a>
 */
@JsExport
interface BookmarksResource {

    suspend fun bookmarksAdd(
        req: BookmarksAddRequest
    ): BookmarksAddResponse

    @JsExport.Ignore
    fun bookmarksAddBlocking(
        req: BookmarksAddRequest
    ): BookmarksAddResponse

    suspend fun bookmarksEdit(
        req: BookmarksEditRequest
    ): BookmarksEditResponse

    @JsExport.Ignore
    fun bookmarksEditBlocking(
        req: BookmarksEditRequest
    ): BookmarksEditResponse

    suspend fun bookmarksList(
        req: BookmarksListRequest
    ): BookmarksListResponse

    @JsExport.Ignore
    fun bookmarksListBlocking(
        req: BookmarksListRequest
    ): BookmarksListResponse

    suspend fun bookmarksRemove(
        req: BookmarksRemoveRequest
    ): BookmarksRemoveResponse

    @JsExport.Ignore
    fun bookmarksRemoveBlocking(
        req: BookmarksRemoveRequest
    ): BookmarksRemoveResponse

    suspend fun bookmarksDelete(
        req: BookmarksDeleteRequest
    ): BookmarksDeleteResponse

    @JsExport.Ignore
    fun bookmarksDeleteBlocking(
        req: BookmarksDeleteRequest
    ): BookmarksDeleteResponse
}
