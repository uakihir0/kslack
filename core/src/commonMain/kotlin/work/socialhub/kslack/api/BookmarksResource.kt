package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.bookmarks.*
import work.socialhub.kslack.api.methods.response.bookmarks.*
import kotlin.js.JsExport

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
}
