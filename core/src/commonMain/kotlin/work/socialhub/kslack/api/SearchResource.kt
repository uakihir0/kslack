package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.search.SearchAllRequest
import work.socialhub.kslack.api.methods.request.search.SearchFilesRequest
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import work.socialhub.kslack.api.methods.response.search.SearchAllResponse
import work.socialhub.kslack.api.methods.response.search.SearchFilesResponse
import work.socialhub.kslack.api.methods.response.search.SearchMessagesResponse
import kotlin.js.JsExport

@JsExport
interface SearchResource {

    suspend fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse

    @JsExport.Ignore
    fun searchAllBlocking(
        req: SearchAllRequest
    ): SearchAllResponse

    suspend fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse

    @JsExport.Ignore
    fun searchMessagesBlocking(
        req: SearchMessagesRequest
    ): SearchMessagesResponse

    suspend fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse

    @JsExport.Ignore
    fun searchFilesBlocking(
        req: SearchFilesRequest
    ): SearchFilesResponse
}
