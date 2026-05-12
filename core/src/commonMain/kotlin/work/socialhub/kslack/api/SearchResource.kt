package work.socialhub.kslack.api

import work.socialhub.kslack.api.methods.request.search.SearchAllRequest
import work.socialhub.kslack.api.methods.request.search.SearchFilesRequest
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import work.socialhub.kslack.api.methods.response.search.SearchAllResponse
import work.socialhub.kslack.api.methods.response.search.SearchFilesResponse
import work.socialhub.kslack.api.methods.response.search.SearchMessagesResponse
import kotlin.js.JsExport

/**
 * Resource interface for Slack's `search.*` API methods.
 *
 * Provides methods for searching messages, files, and all content
 * across Slack workspaces. Search results are paginated and sorted
 * by relevance.
 *
 * # Search Syntax
 * Search queries support operators like:
 * - `from:@username` - Messages from a specific user
 * - `#channel` - Messages in a specific channel
 * - `has:link` - Messages containing links
 * - `after:2024-01-01` - Messages after a date
 *
 * # Usage Example
 * ```kotlin
 * // Search messages
 * val messages = slack.search.searchMessages(
 *     SearchMessagesRequest(query = "project deadline")
 * )
 *
 * // Search all content
 * val all = slack.search.all(
 *     SearchAllRequest(query = "budget")
 * )
 *
 * // Search files
 * val files = slack.search.files(
 *     SearchFilesRequest(query = "report.xlsx")
 * )
 * ```
 *
 * @see <a href="https://docs.slack.dev/reference/methods/search.all">search.all</a>
 * @see <a href="https://docs.slack.dev/reference/methods/search.messages">search.messages</a>
 * @see <a href="https://docs.slack.dev/reference/methods/search.files">search.files</a>
 */
@JsExport
interface SearchResource {

    /**
     * Searches for messages matching a query across the workspace.
     *
     * Requires `search:read` OAuth scope. Returns paginated results sorted
     * by relevance or date.
     *
     * @param req Request containing the search query and optional sorting parameters
     * @return Response with matching messages and sort order information
     * @see <a href="https://docs.slack.dev/reference/methods/search.messages">search.messages</a>
     */
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
