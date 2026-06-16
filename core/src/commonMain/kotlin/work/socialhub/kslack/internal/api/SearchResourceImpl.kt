package work.socialhub.kslack.internal.api

import work.socialhub.kslack.Slack

import work.socialhub.kslack.api.SearchResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.search.SearchAllRequest
import work.socialhub.kslack.api.methods.request.search.SearchFilesRequest
import work.socialhub.kslack.api.methods.request.search.SearchMessagesRequest
import work.socialhub.kslack.api.methods.response.search.SearchAllResponse
import work.socialhub.kslack.api.methods.response.search.SearchFilesResponse
import work.socialhub.kslack.api.methods.response.search.SearchMessagesResponse
import work.socialhub.kslack.util.toBlocking

/**
 * Implementation of [SearchResource] for Slack's `search.*` API methods.
 *
 * Handles HTTP POST requests for searching messages, files, and all content
 * across a workspace. Requires `search:read` OAuth scope for most methods.
 *
 * @param token Optional default token provided at factory initialization
 */
class SearchResourceImpl(
    token: String?,
    apiUrl: String = Slack.ENDPOINT_URL_PREFIX,
) : AbstractResourceImpl(token, apiUrl), SearchResource {

    override suspend fun searchAll(
        req: SearchAllRequest
    ): SearchAllResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_ALL,
            getToken(req),
        )
    }

    override fun searchAllBlocking(
        req: SearchAllRequest
    ): SearchAllResponse {
        return toBlocking { searchAll(req) }
    }

    override suspend fun searchMessages(
        req: SearchMessagesRequest
    ): SearchMessagesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_MESSAGES,
            getToken(req),
        )
    }

    override fun searchMessagesBlocking(
        req: SearchMessagesRequest
    ): SearchMessagesResponse {
        return toBlocking { searchMessages(req) }
    }

    override suspend fun searchFiles(
        req: SearchFilesRequest
    ): SearchFilesResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.SEARCH_FILES,
            getToken(req),
        )
    }

    override fun searchFilesBlocking(
        req: SearchFilesRequest
    ): SearchFilesResponse {
        return toBlocking { searchFiles(req) }
    }
}
