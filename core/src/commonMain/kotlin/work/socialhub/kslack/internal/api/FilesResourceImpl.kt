package work.socialhub.kslack.internal.api

import work.socialhub.kslack.api.FilesResource
import work.socialhub.kslack.api.methods.Methods
import work.socialhub.kslack.api.methods.impl.AbstractResourceImpl
import work.socialhub.kslack.api.methods.request.files.*
import work.socialhub.kslack.api.methods.request.files.remote.*
import work.socialhub.kslack.api.methods.response.files.*
import work.socialhub.kslack.api.methods.response.files.remote.*
import work.socialhub.kslack.util.toBlocking

class FilesResourceImpl(
    token: String?
) : AbstractResourceImpl(token),
    FilesResource {

    override suspend fun filesDelete(
        req: FilesDeleteRequest
    ): FilesDeleteResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_DELETE,
            getToken(req),
        )
    }

    override fun filesDeleteBlocking(
        req: FilesDeleteRequest
    ): FilesDeleteResponse {
        return toBlocking { filesDelete(req) }
    }

    override suspend fun filesInfo(
        req: FilesInfoRequest
    ): FilesInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_INFO,
            getToken(req),
        )
    }

    override fun filesInfoBlocking(
        req: FilesInfoRequest
    ): FilesInfoResponse {
        return toBlocking { filesInfo(req) }
    }

    override suspend fun filesList(
        req: FilesListRequest
    ): FilesListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_LIST,
            getToken(req),
        )
    }

    override fun filesListBlocking(
        req: FilesListRequest
    ): FilesListResponse {
        return toBlocking { filesList(req) }
    }

    override suspend fun filesRevokePublicURL(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REVOKE_PUBLIC_URL,
            getToken(req),
        )
    }

    override fun filesRevokePublicURLBlocking(
        req: FilesRevokePublicURLRequest
    ): FilesRevokePublicURLResponse {
        return toBlocking { filesRevokePublicURL(req) }
    }

    override suspend fun filesSharedPublicURL(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_SHARED_PUBLIC_URL,
            getToken(req),
        )
    }

    override fun filesSharedPublicURLBlocking(
        req: FilesSharedPublicURLRequest
    ): FilesSharedPublicURLResponse {
        return toBlocking { filesSharedPublicURL(req) }
    }

    override suspend fun filesGetUploadURLExternal(
        req: FilesGetUploadURLExternalRequest
    ): FilesGetUploadURLExternalResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_GET_UPLOAD_URL_EXTERNAL,
            getToken(req),
        )
    }

    override fun filesGetUploadURLExternalBlocking(
        req: FilesGetUploadURLExternalRequest
    ): FilesGetUploadURLExternalResponse {
        return toBlocking { filesGetUploadURLExternal(req) }
    }

    override suspend fun filesCompleteUploadExternal(
        req: FilesCompleteUploadExternalRequest
    ): FilesCompleteUploadExternalResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_COMPLETE_UPLOAD_EXTERNAL,
            getToken(req),
        )
    }

    override fun filesCompleteUploadExternalBlocking(
        req: FilesCompleteUploadExternalRequest
    ): FilesCompleteUploadExternalResponse {
        return toBlocking { filesCompleteUploadExternal(req) }
    }

    override suspend fun filesRemoteAdd(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_ADD,
            getToken(req),
        )
    }

    override fun filesRemoteAddBlocking(
        req: FilesRemoteAddRequest
    ): FilesRemoteAddResponse {
        return toBlocking { filesRemoteAdd(req) }
    }

    override suspend fun filesRemoteInfo(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_INFO,
            getToken(req),
        )
    }

    override fun filesRemoteInfoBlocking(
        req: FilesRemoteInfoRequest
    ): FilesRemoteInfoResponse {
        return toBlocking { filesRemoteInfo(req) }
    }

    override suspend fun filesRemoteList(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_LIST,
            getToken(req),
        )
    }

    override fun filesRemoteListBlocking(
        req: FilesRemoteListRequest
    ): FilesRemoteListResponse {
        return toBlocking { filesRemoteList(req) }
    }

    override suspend fun filesRemoteRemove(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_REMOVE,
            getToken(req),
        )
    }

    override fun filesRemoteRemoveBlocking(
        req: FilesRemoteRemoveRequest
    ): FilesRemoteRemoveResponse {
        return toBlocking { filesRemoteRemove(req) }
    }

    override suspend fun filesRemoteShare(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse {
        return postFormWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_SHARE,
            getToken(req),
        )
    }

    override fun filesRemoteShareBlocking(
        req: FilesRemoteShareRequest
    ): FilesRemoteShareResponse {
        return toBlocking { filesRemoteShare(req) }
    }

    override suspend fun filesRemoteUpdate(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse {
        return postMultipartWithToken(
            req.toParams(),
            Methods.FILES_REMOTE_UPDATE,
            getToken(req),
        )
    }

    override fun filesRemoteUpdateBlocking(
        req: FilesRemoteUpdateRequest
    ): FilesRemoteUpdateResponse {
        return toBlocking { filesRemoteUpdate(req) }
    }
}
