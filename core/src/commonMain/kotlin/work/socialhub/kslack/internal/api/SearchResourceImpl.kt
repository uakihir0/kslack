package work.socialhub.kslack.internal.api

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

class SearchResourceImpl(
    token: String?
) : AbstractResourceImpl(token), SearchResource {

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
