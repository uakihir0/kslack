package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.BookmarksResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.bookmarks.*
import work.socialhub.kslack.api.methods.response.bookmarks.*
import work.socialhub.kslack.util.toBlocking

class BookmarksResourceImpl(
    token: String?
) : AbstractResourceImpl(token), BookmarksResource {

    override suspend fun bookmarksAdd(
        req: BookmarksAddRequest
    ): BookmarksAddResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.BOOKMARKS_ADD,
            getToken(req),
        )
    }

    override fun bookmarksAddBlocking(
        req: BookmarksAddRequest
    ): BookmarksAddResponse {
        return toBlocking { bookmarksAdd(req) }
    }

    override suspend fun bookmarksEdit(
        req: BookmarksEditRequest
    ): BookmarksEditResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.BOOKMARKS_EDIT,
            getToken(req),
        )
    }

    override fun bookmarksEditBlocking(
        req: BookmarksEditRequest
    ): BookmarksEditResponse {
        return toBlocking { bookmarksEdit(req) }
    }

    override suspend fun bookmarksList(
        req: BookmarksListRequest
    ): BookmarksListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.BOOKMARKS_LIST,
            getToken(req),
        )
    }

    override fun bookmarksListBlocking(
        req: BookmarksListRequest
    ): BookmarksListResponse {
        return toBlocking { bookmarksList(req) }
    }

    override suspend fun bookmarksRemove(
        req: BookmarksRemoveRequest
    ): BookmarksRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.BOOKMARKS_REMOVE,
            getToken(req),
        )
    }

    override fun bookmarksRemoveBlocking(
        req: BookmarksRemoveRequest
    ): BookmarksRemoveResponse {
        return toBlocking { bookmarksRemove(req) }
    }
}
